package com.kelompoka3.component;

import com.kelompoka3.swing.roundPanel;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;

public class Pesan extends javax.swing.JPanel {

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    private PesanType pesanType = PesanType.SUCCES;
    private boolean show;

    public Pesan() {
        initComponents();
        setOpaque(false);
        setVisible(false);
    }

    public void showPesan(PesanType pesanType, String pesan) {
        this.pesanType = pesanType;
        labelPesan.setText(pesan);
        labelPesan.setFont(new Font("poppins", Font.PLAIN, 14));
        if (pesanType == PesanType.SUCCES) {
            labelPesan.setIcon(new ImageIcon(getClass().getResource("/com/kelompoka3/icons/Succes.png")));
        } else {
            labelPesan.setIcon(new ImageIcon(getClass().getResource("/com/kelompoka3/icons/Error.png")));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPesan = new javax.swing.JLabel();

        setForeground(new java.awt.Color(255, 255, 255));
        setToolTipText("");
        setOpaque(false);

        labelPesan.setBackground(new java.awt.Color(255, 255, 255));
        labelPesan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPesan.setForeground(new java.awt.Color(255, 255, 255));
        labelPesan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPesan.setText("Pesan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPesan, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(labelPesan, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {

        Graphics2D g2 = (Graphics2D) grphcs.create();
        if (pesanType == PesanType.SUCCES) {
            g2.setColor(new Color(111, 207, 151));
        } else {
            g2.setColor(new Color(235, 87, 87));
        }
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 12, 12);
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.9f));
        g2.setComposite(AlphaComposite.SrcOver);
//        g2.setColor(new Color(245, 245, 245));

        super.paintComponent(grphcs);
    }

    public static enum PesanType {
        SUCCES, ERROR
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelPesan;
    // End of variables declaration//GEN-END:variables

   
}
