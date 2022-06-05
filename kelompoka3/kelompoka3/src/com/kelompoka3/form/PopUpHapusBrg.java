package com.kelompoka3.form;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import com.kelompoka3.koneksi.koneksi;

public class PopUpHapusBrg extends javax.swing.JFrame {

    private String sql = "";
    private String idBarang, namaBarang, jenis, warna, hargaJual, hargaBeli, stok;

    public PopUpHapusBrg() {
        initComponents();
        TampilanData();
        table1.addTableStyle(jScrollPane1);
    }

    private void HapusData() {
        idBarang = String.valueOf(idBrg.getText());
        sql = "DELETE FROM barang WHERE idBarang = '" + idBarang + "'";
        try {
            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            TampilanData();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR \n" + e.getMessage());
        }
    }

    private void TampilanData() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Jenis Barang");
        model.addColumn("Warna");
        model.addColumn("Harga Jual");
        model.addColumn("Harga Beli");
        model.addColumn("Stok");
        model.addColumn("Barcode");

        String sql = "SELECT * FROM `barang`";
        System.out.println(sql);

        try {
            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)});

            }
            table1.setModel(model);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        hrgJual = new javax.swing.JTextField();
        nmBrg = new javax.swing.JTextField();
        jnsBrg = new javax.swing.JTextField();
        hrgBrgBeli = new javax.swing.JTextField();
        idBrg = new javax.swing.JTextField();
        wrnBrg = new javax.swing.JTextField();
        stokBrg = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new com.kelompoka3.swing.Table();
        btnHapus = new com.kelompoka3.swing.ButtonCustom();
        btnBatal = new com.kelompoka3.swing.ButtonCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        hrgJual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrgJualActionPerformed(evt);
            }
        });

        nmBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nmBrgActionPerformed(evt);
            }
        });

        hrgBrgBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrgBrgBeliActionPerformed(evt);
            }
        });

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kelompoka3/icons/Delete-1.png"))); // NOI18N
        btnHapus.setText("H A P U S");
        btnHapus.setStyle(com.kelompoka3.swing.ButtonCustom.ButtonStyle.DESTRUCTIVE);
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnBatal.setText(" B A T A L");
        btnBatal.setStyle(com.kelompoka3.swing.ButtonCustom.ButtonStyle.SECONDARY);
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hrgBrgBeli)
                            .addComponent(hrgJual)
                            .addComponent(wrnBrg)
                            .addComponent(stokBrg, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nmBrg)
                            .addComponent(jnsBrg)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(idBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(57, 57, 57))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(idBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nmBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jnsBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(wrnBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hrgJual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hrgBrgBeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stokBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hrgJualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrgJualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hrgJualActionPerformed

    private void nmBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nmBrgActionPerformed
        // TODO add your handling code here:
        formBarang brg = new formBarang();
        brg.setVisible(true);
        dispose();
    }//GEN-LAST:event_nmBrgActionPerformed

    private void hrgBrgBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrgBrgBeliActionPerformed
        // TODO add your handling code here:
        formBarang brg = new formBarang();
        brg.setVisible(true);
        dispose();
    }//GEN-LAST:event_hrgBrgBeliActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        // TODO add your handling code here:
        int baris = table1.rowAtPoint(evt.getPoint());
        if (table1.getValueAt(baris, 0) == null) {
            idBrg.setText("");
        } else {
            idBrg.setText(table1.getValueAt(baris, 0).toString());
        }
        if (table1.getValueAt(baris, 1) == null) {
            nmBrg.setText("");
        } else {
            nmBrg.setText(table1.getValueAt(baris, 1).toString());
        }
        if (table1.getValueAt(baris, 2) == null) {
            jnsBrg.setText("");
        } else {
            jnsBrg.setText(table1.getValueAt(baris, 2).toString());
        }
        if (table1.getValueAt(baris, 3) == null) {
            wrnBrg.setText("");
        } else {
            wrnBrg.setText(table1.getValueAt(baris, 3).toString());
        }
        if (table1.getValueAt(baris, 4) == null) {
            hrgJual.setText("");
        } else {
            hrgJual.setText(table1.getValueAt(baris, 4).toString());
        }
        if (table1.getValueAt(baris, 5) == null) {
            hrgBrgBeli.setText("");
        } else {
            hrgBrgBeli.setText(table1.getValueAt(baris, 5).toString());
        }
        if (table1.getValueAt(baris, 6) == null) {
            stokBrg.setText("");
        } else {
            stokBrg.setText(table1.getValueAt(baris, 6).toString());
        }

    }//GEN-LAST:event_table1MouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        HapusData();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnBatalActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PopUpHapusBrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUpHapusBrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUpHapusBrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUpHapusBrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopUpHapusBrg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.kelompoka3.swing.ButtonCustom btnBatal;
    private com.kelompoka3.swing.ButtonCustom btnHapus;
    private javax.swing.JTextField hrgBrgBeli;
    private javax.swing.JTextField hrgJual;
    private javax.swing.JTextField idBrg;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jnsBrg;
    private javax.swing.JTextField nmBrg;
    private javax.swing.JTextField stokBrg;
    private com.kelompoka3.swing.Table table1;
    private javax.swing.JTextField wrnBrg;
    // End of variables declaration//GEN-END:variables
}
