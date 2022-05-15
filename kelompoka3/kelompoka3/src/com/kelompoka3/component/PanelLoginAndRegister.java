package com.kelompoka3.component;

import com.kelompoka3.model.ModelUser;
import com.kelompoka3.swing.ButtonCustom;
import com.kelompoka3.swing.MyPasswordField;
import com.kelompoka3.swing.MyTextField;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;

public class PanelLoginAndRegister extends javax.swing.JLayeredPane {

    public ModelUser getUser() {
        return user;
    }

    private ModelUser user;
    
    public PanelLoginAndRegister(ActionListener eventRegister) {
        initComponents();
        initRegister(eventRegister);
        initLogin();
        login.setVisible(false);
        register.setVisible(true);

    }

    private void initRegister(ActionListener eventRegister) {
        register.setLayout(new MigLayout("wrap", "push[center]push", "push[]12[]32[]18[]18[]18[]18[]32[]push"));
        JLabel judul = new JLabel("Create an Account");
        JLabel deskripsi = new JLabel("<html> Lengkapi data diri dan lakukan pendaftaran untuk mengakses<br/><center>program kami</center> </html>");
        judul.setFont(new Font("poppins", Font.BOLD, 20));
        judul.setForeground(new Color(79, 79, 79));
        register.add(judul);
        deskripsi.setFont(new Font("poppins", Font.PLAIN, 14));
        deskripsi.setForeground(new Color(130, 130, 130));
        register.add(deskripsi);
        MyTextField txtName = new MyTextField();
        txtName.setPreferredSize(new Dimension(400, 52));
        txtName.setPrefixIcon(new ImageIcon(getClass().getResource("/com/kelompoka3/icons/Profile.png")));
        txtName.setHint("Nama Lengkap");
        register.add(txtName, "w 60%");

        MyTextField txtEmail = new MyTextField();
        txtEmail.setPreferredSize(new Dimension(400, 52));
        txtEmail.setPrefixIcon(new ImageIcon(getClass().getResource("/com/kelompoka3/icons/Message.png")));
        txtEmail.setHint("Email");
        register.add(txtEmail, "w 60%");

        MyTextField txtUsername = new MyTextField();
        txtUsername.setPreferredSize(new Dimension(400, 52));
        txtUsername.setPrefixIcon(new ImageIcon(getClass().getResource("/com/kelompoka3/icons/Profile.png")));
        txtUsername.setHint("Username");
        register.add(txtUsername, "w 60%");

        MyPasswordField txtPassword = new MyPasswordField();
        txtPassword.setPreferredSize(new Dimension(400, 52));
        txtPassword.setPrefixIcon(new ImageIcon(getClass().getResource("/com/kelompoka3/icons/Lock.png")));
        txtPassword.setHint("Password");
        register.add(txtPassword, "w 60%");

        MyTextField txtAlamat = new MyTextField();
        txtAlamat.setPreferredSize(new Dimension(400, 52));
        txtAlamat.setPrefixIcon(new ImageIcon(getClass().getResource("/com/kelompoka3/icons/Location.png")));
        txtAlamat.setHint("Alamat");
        register.add(txtAlamat, "w 60%");

        ButtonCustom cmd = new ButtonCustom();
        cmd.setPreferredSize(new Dimension(384, 52));
        cmd.setBackground(new Color(113, 135, 116));
        cmd.setForeground(new Color(250, 250, 250));
        cmd.setFont(new Font("poppins", Font.BOLD, 14));
        cmd.addActionListener(eventRegister);
        cmd.setText("Create Account");
        register.add(cmd);
        cmd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String namaLengkap = txtName.getText().trim();
                String email = txtEmail.getText().trim();
                String username = txtUsername.getText().trim();
                String password = String.valueOf(txtPassword.getPassword());
                String alamat = txtAlamat.getText().trim();
                user = new ModelUser(namaLengkap, email, username, password, alamat);
            }
        });
    }

    private void initLogin() {
        login.setLayout(new MigLayout("wrap", "push[center]push", "push[]32[]18[]12[]32[]push"));
        JLabel judul = new JLabel("Sign In");
        judul.setFont(new Font("poppins", Font.BOLD, 20));
        judul.setForeground(new Color(79, 79, 79));
        login.add(judul);

        MyTextField txtUsername = new MyTextField();
        txtUsername.setPreferredSize(new Dimension(400, 52));
        txtUsername.setPrefixIcon(new ImageIcon(getClass().getResource("/com/kelompoka3/icons/Profile.png")));
        txtUsername.setHint("Username");
        login.add(txtUsername, "w 60%");

        MyPasswordField txtPassword = new MyPasswordField();
        txtPassword.setPreferredSize(new Dimension(400, 52));
        txtPassword.setPrefixIcon(new ImageIcon(getClass().getResource("/com/kelompoka3/icons/Lock.png")));
        txtPassword.setHint("Password");
        login.add(txtPassword, "w 60%");

        JButton cmdForget = new JButton("                                                           Forgot your password?");
        cmdForget.setForeground(new Color(47, 128, 237));
        cmdForget.setFont(new Font("poppins", Font.PLAIN, 14));
        cmdForget.setContentAreaFilled(false);
        cmdForget.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login.add(cmdForget);

        ButtonCustom cmd = new ButtonCustom();
        cmd.setPreferredSize(new Dimension(384, 52));
        cmd.setBackground(new Color(113, 135, 116));
        cmd.setForeground(new Color(250, 250, 250));
        cmd.setFont(new Font("poppins", Font.BOLD, 14));
        cmd.setText("Sign In");
        login.add(cmd);
    }

    public void showRegister(boolean show) {
        if (show) {
            register.setVisible(true);
            login.setVisible(false);
        } else {
            register.setVisible(false);
            login.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        register = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(login, "card3");

        register.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(register, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel login;
    private javax.swing.JPanel register;
    // End of variables declaration//GEN-END:variables
}
