package com.kelompoka3.form;

import com.kelompoka3.koneksi.koneksi;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class formPegawai extends javax.swing.JPanel {

    public formPegawai() {

        initComponents();
        tablePegawai();
        setOpaque(false);
        table1.addTableStyle(jScrollPane1);

        txtNamaLengkap.setPrefixIcon(new ImageIcon(getClass().getResource("/com/kelompoka3/icons/Profile.png")));
        txtNamaLengkap.setHint("Nama Lengkap");

        txtEmail.setPrefixIcon(new ImageIcon(getClass().getResource("/com/kelompoka3/icons/Message.png")));
        txtEmail.setHint("Email");

        txtUsername.setPrefixIcon(new ImageIcon(getClass().getResource("/com/kelompoka3/icons/Profile.png")));
        txtUsername.setHint("Username");

        txtPassword.setPrefixIcon(new ImageIcon(getClass().getResource("/com/kelompoka3/icons/Lock.png")));
        txtPassword.setHint("Password");

        txtAlamat.setPrefixIcon(new ImageIcon(getClass().getResource("/com/kelompoka3/icons/Location.png")));
        txtAlamat.setHint("Alamat");

    }

    private void tablePegawai() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nama");
        model.addColumn("Email");
        model.addColumn("Username");
        model.addColumn("Password");
        model.addColumn("Alamat");
        try {
            String sql = "SELECT namaLengkap, email, username, password, alamat FROM pegawai ORDER BY userId DESC";
            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{res.getString(1),
                    res.getString(2), res.getString(3), res.getString(4), res.getString(5)});
            }
            table1.setModel(model);
        } catch (SQLException e) {
        }
    }

    private String sql = "";
    private String namaLengkap, email, username, password, alamat;

    private void TambahkanData() {
        namaLengkap = String.valueOf(txtNamaLengkap.getText());
        email = String.valueOf(txtEmail.getText());
        username = String.valueOf(txtUsername.getText());
        password = String.valueOf(txtPassword.getText());
        alamat = String.valueOf(txtAlamat.getText());
        sql = "INSERT INTO pegawai VALUES (NULL, '" + namaLengkap + "','" + email + "','" + username + "','" + password + "','" + alamat + "', NULL, 'Verified', '2')";
        System.out.println(sql);
        try {
            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR \n" + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNamaLengkap = new com.kelompoka3.swing.MyTextField();
        txtEmail = new com.kelompoka3.swing.MyTextField();
        txtUsername = new com.kelompoka3.swing.MyTextField();
        txtPassword = new com.kelompoka3.swing.MyTextField();
        txtAlamat = new com.kelompoka3.swing.MyTextField();
        buttonCustom1 = new com.kelompoka3.swing.ButtonCustom();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new com.kelompoka3.swing.Table();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(79, 79, 79));
        jLabel1.setText("Buat akun pegawai");

        buttonCustom1.setText("Confirm");
        buttonCustom1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonCustom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCustom1ActionPerformed(evt);
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
        table1.setFont(new java.awt.Font("Tomaha", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(table1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNamaLengkap, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(249, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCustom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCustom1ActionPerformed
        TambahkanData();
    }//GEN-LAST:event_buttonCustom1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.kelompoka3.swing.ButtonCustom buttonCustom1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.kelompoka3.swing.Table table1;
    private com.kelompoka3.swing.MyTextField txtAlamat;
    private com.kelompoka3.swing.MyTextField txtEmail;
    private com.kelompoka3.swing.MyTextField txtNamaLengkap;
    private com.kelompoka3.swing.MyTextField txtPassword;
    private com.kelompoka3.swing.MyTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
