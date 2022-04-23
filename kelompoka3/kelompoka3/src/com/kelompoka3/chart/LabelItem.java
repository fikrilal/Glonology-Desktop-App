
package com.kelompoka3.chart;

/**
 *
 * @author fikrimuzakky24
 */
public class LabelItem extends javax.swing.JPanel {

    public LabelItem(ModelLabel data) {
        initComponents();
        setOpaque(false);
        LbColor.setBackground(data.getColor());
        namaLabel.setText(data.getNama());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namaLabel = new javax.swing.JLabel();
        LbColor = new com.kelompoka3.chart.LabelColor();

        namaLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        namaLabel.setForeground(new java.awt.Color(130, 130, 130));
        namaLabel.setText("Nama");

        LbColor.setBackground(new java.awt.Color(113, 135, 116));
        LbColor.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LbColor, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaLabel))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LbColor, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaLabel)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.kelompoka3.chart.LabelColor LbColor;
    private javax.swing.JLabel namaLabel;
    // End of variables declaration//GEN-END:variables
}
