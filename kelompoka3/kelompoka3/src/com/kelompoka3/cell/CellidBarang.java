package com.kelompoka3.cell;

import com.kelompoka3.model.ModelidBarang;
import com.raven.table.cell.Cell;

public class CellidBarang extends Cell {

    public CellidBarang(ModelidBarang data) {
        initComponents();
        lb.setText(data.toString());
        image.setImage(data.getGambar());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        image = new com.kelompoka3.swing.BingkaiGambar();
        lb = new javax.swing.JLabel();

        image.setBorderSpace(1);
        image.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/kelompoka3/image/cpu1.jpg"))); // NOI18N

        lb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb.setForeground(new java.awt.Color(130, 130, 130));
        lb.setText("ID Barang");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lb)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lb)))
                .addGap(8, 8, 8))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.kelompoka3.swing.BingkaiGambar image;
    private javax.swing.JLabel lb;
    // End of variables declaration//GEN-END:variables
}
