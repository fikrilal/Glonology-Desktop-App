package com.kelompoka3.component;

import com.kelompoka3.swing.ButtonCustom;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;
import net.miginfocom.swing.MigLayout;

public class PanelCover extends javax.swing.JPanel {

    private final DecimalFormat df = new DecimalFormat("##0.###");
    private ActionListener event;
    private MigLayout layout;
    private JLabel title;
    private JLabel description;
    private JLabel description1;
    private panelGambar gambar;
    private ButtonCustom Outlinebtn;
    private boolean isLogin;

    public PanelCover() {
        initComponents();
        setOpaque(false);
        layout = new MigLayout("wrap, fill", "[center]", "push[]12[]32[]25[]push");
        setLayout(layout);
        init();
    }

    private void init() {
        title = new JLabel("Meet Our Dashboard");
        title.setFont(new Font("poppins", Font.BOLD, 20));
        title.setForeground(new Color(245, 245, 245));
        add(title);
        description = new JLabel("<html>Cara termudah untuk mengelola transaksi, "
                + "dilengkapi dengan<center>laporan penjualan dan statistik bulanan."
                + "</center> </html>");
        description.setFont(new Font("poppins", Font.PLAIN, 14));
        description.setForeground(new Color(242, 242, 242));
        add(description);
        
//        gambar = new panelGambar();
//        add(gambar);
        

        Outlinebtn = new ButtonCustom();
        Outlinebtn.setPreferredSize(new Dimension(384, 52));
        Outlinebtn.setStyle(ButtonCustom.ButtonStyle.OUTLINE);
        Outlinebtn.setBorder(BorderFactory.createLineBorder(new Color(245, 245, 245)));
        Outlinebtn.setOpaque(false);
        Outlinebtn.setBackground(new Color(113, 135, 116));
        Outlinebtn.setBorder(new RoundedBorder(10));
        Outlinebtn.setForeground(new Color(245, 245, 245));
        Outlinebtn.setFont(new Font("poppins", Font.BOLD, 14));
        Outlinebtn.setText("Sign In");
        Outlinebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                event.actionPerformed(ae);
            }
        });
        add(Outlinebtn);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        GradientPaint gra = new GradientPaint(0, 0, new Color(113, 135, 116), 0, getHeight(), new Color(113, 135, 116));
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }

    public void addEvent(ActionListener event) {
        this.event = event;
    }

    //kode kebawah untuk set border tombol di panel cover, tapi elek, kapan kapan dibenakno
    private static class RoundedBorder implements Border {

        private final int radius;

        RoundedBorder(int radius) {
            this.radius = radius;
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
        }

        @Override
        public boolean isBorderOpaque() {
            return true;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        }
    }

    public void RegisterKiri(double v) {
        v = Double.valueOf(df.format(v));
        login(false);
        layout.setComponentConstraints(title, "pad 0 -" + v + "% 0 0");
        layout.setComponentConstraints(description, "pad 0 -" + v + "% 0 0");
    }

    public void RegisterKanan(double v) {
        v = Double.valueOf(df.format(v));
        login(false);
        layout.setComponentConstraints(title, "pad 0 -" + v + "% 0 0");
        layout.setComponentConstraints(description, "pad 0 -" + v + "% 0 0");
    }

    public void LoginKiri(double v) {
        v = Double.valueOf(df.format(v));
        login(true);
        layout.setComponentConstraints(title, "pad 0 " + v + "% 0 " + v + "%");
        layout.setComponentConstraints(description, "pad 0 " + v + "% 0 " + v + "%");
    }

    public void LoginKanan(double v) {
        v = Double.valueOf(df.format(v));
        login(true);
        layout.setComponentConstraints(title, "pad 0 " + v + "% 0 " + v + "%");
        layout.setComponentConstraints(description, "pad 0 " + v + "% 0 " + v + "%");
    }

    private void login(boolean login) {
        if (this.isLogin != login) {
            if (login) {
                title.setText("Meet Our Dashboard");
                description.setText("<html>Cara termudah untuk mengelola transaksi, "
                + "dilengkapi dengan<center>laporan penjualan dan statistik bulanan."
                + "</center> </html>");
                Outlinebtn.setText("Create Account");
            } else {
                title.setText("Meet Our Dashboard");
                description.setText("<html>Cara termudah untuk mengelola transaksi, "
                + "dilengkapi dengan<center>laporan penjualan dan statistik bulanan."
                + "</center> </html>");
                Outlinebtn.setText("Sign In");
            }
            this.isLogin = login;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
