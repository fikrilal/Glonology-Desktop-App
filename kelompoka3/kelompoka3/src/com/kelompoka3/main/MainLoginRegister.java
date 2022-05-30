package com.kelompoka3.main;

import com.kelompoka3.component.PanelCover;
import com.kelompoka3.component.PanelLoading;
import com.kelompoka3.component.PanelVerifikasi;
import com.kelompoka3.component.PanelLoginAndRegister;
import com.kelompoka3.component.Pesan;
import com.kelompoka3.koneksi.DatabaseConnection;
import com.kelompoka3.koneksi.ServiceMail;
import com.kelompoka3.koneksi.ServiceUser;
import com.kelompoka3.model.ModelLogin;
import com.kelompoka3.model.ModelMessage;
import com.kelompoka3.model.ModelUser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.mail.Message;
import javax.swing.JLayeredPane;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class MainLoginRegister extends javax.swing.JFrame {

    private MigLayout layout;
    private PanelCover cover;
    private PanelLoading loading;
    private PanelVerifikasi verifikasi;
    private PanelLoginAndRegister loginAndRegister;
    private boolean isLogin;
    private final double addSize = 30;
    private final double coverSize = 50;
    private final double loginSize = 50;
    private final DecimalFormat df = new DecimalFormat("##0.###");
    private ServiceUser service;

    public MainLoginRegister() {
        initComponents();
        init();
    }

    private void init() {
        service = new ServiceUser();
        layout = new MigLayout("fill, insets 0");
        cover = new PanelCover();
        loading = new PanelLoading();
        verifikasi = new PanelVerifikasi();
        ActionListener eventRegister = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                register();
            }
        };

        ActionListener eventLogin = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                login();
            }
        };
        loginAndRegister = new PanelLoginAndRegister(eventRegister, eventLogin);
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double fractionCover;
                double fractionLogin;
                double size = coverSize;
                if (fraction <= 0.5f) {
                    size += fraction * addSize;
                } else {
                    size += addSize - fraction * addSize;
                }
                if (isLogin) {
                    fractionCover = 1f - fraction;
                    fractionLogin = fraction;
                    if (fraction >= 0.5f) {
                        cover.RegisterKanan(fractionCover * 100);
                    } else {
                        cover.LoginKanan(fractionLogin * 100);
                    }
                } else {
                    fractionCover = fraction;
                    fractionLogin = 1f - fraction;
                    if (fraction <= 0.5f) {
                        cover.RegisterKiri(fraction * 100);
                    } else {
                        cover.LoginKiri((1f - fraction) * 100);
                    }
                }

                if (fraction >= 0.5f) {
                    loginAndRegister.showRegister(isLogin);
                }
                fractionCover = Double.valueOf(df.format(fractionCover));
                fractionLogin = Double.valueOf(df.format(fractionLogin));
                layout.setComponentConstraints(cover, "width " + size + "%, pos " + fractionCover + "al 0 n 100%");
                layout.setComponentConstraints(loginAndRegister, "width " + loginSize + "%, pos " + fractionLogin + "al 0 n 100%");
                background.revalidate();
            }

            @Override
            public void end() {
                isLogin = !isLogin;
            }
        };
        Animator animator = new Animator(1000, target);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
        animator.setResolution(0);
        background.setLayout(layout);
        background.setLayer(loading, JLayeredPane.POPUP_LAYER);
        background.setLayer(verifikasi, JLayeredPane.POPUP_LAYER);
        background.add(loading, "pos 0 0 100% 100%");
        background.add(verifikasi, "pos 0 0 100% 100%");
        background.add(cover, "width " + coverSize + "%, pos 0al 0 n 100%");
        background.add(loginAndRegister, "width " + loginSize + "%, pos 1al 0 n 100%");
        cover.addEvent(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!animator.isRunning()) {
                    animator.start();
                }
            }
        });
        verifikasi.addEventButtonConfirm(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    ModelUser user = loginAndRegister.getUser();
                    if (service.verifyCodeWithUser(user.getUserId(), verifikasi.getInputCode())) {
                        service.succesVerify(user.getUserId());
                        showPesan(Pesan.PesanType.SUCCES, "Registrasi berhasil");
                        verifikasi.setVisible(false);
                    } else {
                        showPesan(Pesan.PesanType.ERROR, "Verifikasi gagal");
                    }

                } catch (SQLException e) {
                    showPesan(Pesan.PesanType.ERROR, "Error");
                }
            }
        });
    }

    private void register() {
        ModelUser user = loginAndRegister.getUser();
        try {
            if (service.checkDuplicateUser(user.getUsername())) {
                showPesan(Pesan.PesanType.ERROR, "Username telah digunakan");
            } else if (service.checkDuplicateEmail(user.getEmail())) {
                showPesan(Pesan.PesanType.ERROR, "Email telah digunakan");
            } else {
                service.insertUser(user);
                sendMain(user);
            }
        } catch (SQLException e) {
            showPesan(Pesan.PesanType.ERROR, "Registrasi gagal");
        }
    }

    private void login() {
        ModelLogin data = loginAndRegister.getDataLogin();
        try {
            ModelUser user = service.login(data);
            if (user != null) {
                if (service.checkKedudukanAdmin(user.getEmail())) {
                    this.dispose();
                    new main().setVisible(true);
                } else if (service.checkKedudukanKaryawan(user.getEmail())) {
                    this.dispose();
                    new mainKaryawan().setVisible(true);
                }
            } else {
                showPesan(Pesan.PesanType.ERROR, "Email atau password salah");
            }

        } catch (SQLException e) {
            showPesan(Pesan.PesanType.ERROR, "Kesalahan login" + e.getMessage());
        }

    }

    private void sendMain(ModelUser user) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                loading.setVisible(true);
                ModelMessage ms = new ServiceMail().sendMain(user.getEmail(), user.getVerifyCode());
                if (ms.isSuccess()) {
                    loading.setVisible(false);
                    verifikasi.setVisible(true);
                } else {
                    loading.setVisible(false);
                    showPesan(Pesan.PesanType.ERROR, ms.getMessage());
                }
            }
        }).start();
    }

    private void showPesan(Pesan.PesanType pesanType, String pesan) {
        Pesan ps = new Pesan();
        ps.showPesan(pesanType, pesan);
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void begin() {
                if (!ps.isShow()) {
                    background.add(ps, "pos 0.5al -30", 0);
                    ps.setVisible(true);
                    background.repaint();
                }
            }

            @Override
            public void timingEvent(float fraction) {
                float f;
                if (ps.isShow()) {
                    f = 40 * (1f - fraction);
                } else {
                    f = 40 * fraction;
                }
                layout.setComponentConstraints(ps, "pos 0.5al " + (int) (f - 30));
                background.repaint();
                background.revalidate();
            }

            @Override
            public void end() {
                if (ps.isShow()) {
                    background.remove(ps);
                    background.repaint();
                    background.revalidate();
                } else {
                    ps.setShow(true);
                }
            }

        };
        Animator animator = new Animator(300, target);
        animator.setResolution(0);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
        animator.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    animator.start();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setOpaque(true);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainLoginRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainLoginRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainLoginRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainLoginRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            DatabaseConnection.getInstance().connectToDatabase();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainLoginRegister().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane background;
    // End of variables declaration//GEN-END:variables

}
