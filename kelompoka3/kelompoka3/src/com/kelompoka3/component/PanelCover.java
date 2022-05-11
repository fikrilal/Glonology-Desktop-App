package com.kelompoka3.component;

import com.kelompoka3.swing.ButtonCustom;
import com.kelompoka3.swing.ButtonCustomOutline;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;

public class PanelCover extends javax.swing.JPanel {

    private final DecimalFormat df = new DecimalFormat("##0.###");
    private ActionListener event;
    private MigLayout layout;
    private JLabel title;
    private JLabel description;
    private JLabel description1;
    private ButtonCustomOutline button;
    private boolean isLogin;

    public PanelCover() {
        initComponents();
        setOpaque(false);
        layout = new MigLayout("wrap, fill", "[center]", "push[]25[]10[]25[]push");
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
        description.setForeground(new Color(130, 130, 130));
        add(description);
        
        ButtonCustom Outlinebtn = new ButtonCustom();
        Outlinebtn.setPreferredSize(new Dimension(384, 52));
        Outlinebtn.setStyle(ButtonCustom.ButtonStyle.OUTLINE);
        Outlinebtn.setContentAreaFilled(false);
        Outlinebtn.setBorder(new EmptyBorder(5, 0, 5, 0));
        Outlinebtn.setBackground(Color.WHITE);
        Outlinebtn.setForeground(new Color(250, 250, 250));
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
