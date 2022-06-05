package com.kelompoka3.form;

import com.kelompoka3.koneksi.koneksi;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class formBarang extends javax.swing.JPanel {

    private Connection con;
    private Statement st;
    private ResultSet RSBarang;
    private String sql = "";

    private String idBarang, namaBarang, jenis, warna, hargaJual, hargaBeli, stok;

    public formBarang() {
        initComponents();
        TampilanData();
        table1.addTableStyle(jScrollPane1);
        crBrg.setHint("Cari Barang");
        crBrg.setPrefixIcon(new ImageIcon(getClass().getResource("/com/kelompoka3/icons/Search.png")));
        Id.setVisible(false);
        
    }

    private void CariData(String Key) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nama Barang");
        model.addColumn("Jenis");
        model.addColumn("Warna");
        model.addColumn("Harga Jual");
        model.addColumn("Harga Beli");
        model.addColumn("Stok");
        model.addColumn("Barcode");

        String sql = "SELECT namaBarang, jenis, warna, hargaJual, hargaBeli, "
                + "stok, Barcode FROM barang WHERE namaBarang LIKE '%" + Key + "%'";
        System.out.println(sql);

        try {
            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2),
                    rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
                    rs.getString(7)});
            }
            table1.setModel(model);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void TampilanData() {
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Nama Barang");
        model.addColumn("Jenis");
        model.addColumn("Warna");
        model.addColumn("Harga Jual");
        model.addColumn("Harga Beli");
        model.addColumn("Stok");
        model.addColumn("Barcode");

        String sql = "SELECT idBarang, namaBarang, jenis, warna, hargaJual, hargaBeli, stok, "
                + "Barcode FROM barang ORDER BY namaBarang ASC";
        System.out.println(sql);

        try {
            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2),
                    rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
                    rs.getString(7), rs.getString(8)});
            }
            table1.setModel(model);
        } catch (Exception e) {
            e.getMessage();
        }
        table1.getColumnModel().getColumn(0).setMinWidth(0);
        table1.getColumnModel().getColumn(0).setMaxWidth(0);
        table1.getColumnModel().getColumn(0).setWidth(0);
        table1.getColumnModel().getColumn(0).setResizable(false);
        table1.getColumnModel().getColumn(1).setMaxWidth(260);
        table1.getColumnModel().getColumn(2).setMaxWidth(110);
        table1.getColumnModel().getColumn(3).setMaxWidth(110);
        table1.getColumnModel().getColumn(4).setMaxWidth(160);
        table1.getColumnModel().getColumn(5).setMaxWidth(160);
        table1.getColumnModel().getColumn(6).setMaxWidth(80);
        table1.getColumnModel().getColumn(7).setMaxWidth(200);
    }

    private void HapusData() {
        idBarang = String.valueOf(Id.getText());
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEdit = new com.kelompoka3.swing.ButtonCustom();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new com.kelompoka3.swing.Table();
        btnTambah = new com.kelompoka3.swing.ButtonCustom();
        btnHapus = new com.kelompoka3.swing.ButtonCustom();
        crBrg = new com.kelompoka3.swing.MyTextField();
        Id = new com.kelompoka3.swing.MyTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnEdit.setText("Edit");
        btnEdit.setToolTipText("");
        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEdit.setStyle(com.kelompoka3.swing.ButtonCustom.ButtonStyle.SECONDARY);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "null", "Title 8"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(6).setMinWidth(80);
            table1.getColumnModel().getColumn(6).setMaxWidth(80);
        }

        btnTambah.setText("Tambah");
        btnTambah.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHapus.setStyle(com.kelompoka3.swing.ButtonCustom.ButtonStyle.DESTRUCTIVE);
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        crBrg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                crBrgKeyReleased(evt);
            }
        });

        Id.setForeground(new java.awt.Color(255, 255, 255));
        Id.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(crBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(134, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        new PopUpEditBrg().setVisible(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        new PopUpTambahBrg().setVisible(true);
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        HapusData();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void crBrgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_crBrgKeyReleased
        String key = crBrg.getText();

        if (key != "") {
            CariData(key);
        } else {
            TampilanData();
        }
    }//GEN-LAST:event_crBrgKeyReleased

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        int baris = table1.rowAtPoint(evt.getPoint());
        if (table1.getValueAt(baris, 0) == null) {
            Id.setText("");
        } else {
            Id.setText(table1.getValueAt(baris, 0).toString());
        }
    }//GEN-LAST:event_table1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.kelompoka3.swing.MyTextField Id;
    private com.kelompoka3.swing.ButtonCustom btnEdit;
    private com.kelompoka3.swing.ButtonCustom btnHapus;
    private com.kelompoka3.swing.ButtonCustom btnTambah;
    private com.kelompoka3.swing.MyTextField crBrg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.kelompoka3.swing.Table table1;
    // End of variables declaration//GEN-END:variables
}
