package com.kelompoka3.form;

import com.kelompoka3.koneksi.koneksi;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class formPegawai extends javax.swing.JPanel {

    private String idPegawai;
    private String sql = "";

    public formPegawai() {
        initComponents();
        TampilanData();
        crBrg.setPrefixIcon(new ImageIcon(getClass().getResource("/com/kelompoka3/icons/Search.png")));
        crBrg.setHint("Cari pegawai..");
        jtable1.addTableStyle(jScrollPane2);
        jtable1.setDefaultEditor(Object.class, null);
//        Id.setVisible(false);
    }

    private void CariData(String Key) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nama lengkap");
        model.addColumn("Email");
        model.addColumn("Username");
        model.addColumn("Alamat");
        String sql = "SELECT namaLengkap, email, username, alamat FROM pegawai WHERE namaLengkap LIKE '%" + Key + "%'";
        System.out.println(sql);

        try {
            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)});

            }
            jtable1.setModel(model);
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    private void TampilanData() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Nama lengkap");
        model.addColumn("Email");
        model.addColumn("Username");
        model.addColumn("Alamat");
        String sql = "SELECT userId, namaLengkap, email, username, alamat FROM "
                + "pegawai WHERE idKedudukan = 2 ORDER BY `namaLengkap` ASC";
        System.out.println(sql);

        try {
            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
            }
            jtable1.setModel(model);
        } catch (SQLException e) {
            e.getMessage();
        }
        jtable1.getColumnModel().getColumn(0).setMinWidth(0);
        jtable1.getColumnModel().getColumn(0).setMaxWidth(0);
        jtable1.getColumnModel().getColumn(0).setWidth(0);
        jtable1.getColumnModel().getColumn(0).setResizable(false);
    }

    private void HapusData() {
        idPegawai = String.valueOf(Id.getText());
        try {
            if (Id.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Pilih data untuk dihapus!");
            } else {
                sql = "DELETE FROM pegawai WHERE userId = '" + idPegawai + "'";
                java.sql.Connection conn = (Connection) koneksi.koneksi();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                TampilanData();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR \n" + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnTambah = new com.kelompoka3.swing.ButtonCustom();
        btnHapus = new com.kelompoka3.swing.ButtonCustom();
        btnEdit = new com.kelompoka3.swing.ButtonCustom();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable1 = new com.kelompoka3.swing.Table();
        crBrg = new com.kelompoka3.swing.MyTextField();
        Id = new javax.swing.JTextField();
        buttonCustom1 = new com.kelompoka3.swing.ButtonCustom();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        btnEdit.setText("Edit");
        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEdit.setStyle(com.kelompoka3.swing.ButtonCustom.ButtonStyle.SECONDARY);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jtable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", ""
            }
        ));
        jtable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtable1);

        crBrg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                crBrgKeyReleased(evt);
            }
        });

        buttonCustom1.setText("Refresh");
        buttonCustom1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonCustom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCustom1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(crBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 58, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        new PopUpTambahPegawai().setVisible(true);
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
       if (Id.getText().equals("")) {
           JOptionPane.showMessageDialog(null, "Pilih data untuk diedit!");
           new PopUpEditPegawai().setVisible(false);
       } else {
        new PopUpEditPegawai().setVisible(true);
       }
    }//GEN-LAST:event_btnEditActionPerformed

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

    private void jtable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable1MouseClicked
        int baris = jtable1.rowAtPoint(evt.getPoint());
        if (jtable1.getValueAt(baris, 0) == null) {
            Id.setText("");
        } else {
            Id.setText(jtable1.getValueAt(baris, 0).toString());
        }
    }//GEN-LAST:event_jtable1MouseClicked

    private void buttonCustom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCustom1ActionPerformed
        // TODO add your handling code here:
        TampilanData();
    }//GEN-LAST:event_buttonCustom1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Id;
    private com.kelompoka3.swing.ButtonCustom btnEdit;
    private com.kelompoka3.swing.ButtonCustom btnHapus;
    private com.kelompoka3.swing.ButtonCustom btnTambah;
    private com.kelompoka3.swing.ButtonCustom buttonCustom1;
    private com.kelompoka3.swing.MyTextField crBrg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.kelompoka3.swing.Table jtable1;
    // End of variables declaration//GEN-END:variables
}
