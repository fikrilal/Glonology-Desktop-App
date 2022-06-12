package com.kelompoka3.form;

import com.kelompoka3.koneksi.koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class formHistory extends javax.swing.JPanel {

    DefaultTableModel tabel = new DefaultTableModel();

    public formHistory() {
        initComponents();
        TampilanData();
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        String tgl = simpleDateFormat.format(now), data;
        tbr.addTableStyle(jScrollPane1);
        tbr.setDefaultEditor(Object.class, null);
        search.setHint("Cari riwayat pembelian..");
        search.setPrefixIcon(new ImageIcon(getClass().getResource("/com/kelompoka3/icons/Search.png")));
    }

    private void tableformhistory(String cari) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No Faktur");
        model.addColumn("Id Barang");
        model.addColumn("jumlah Barang");
        model.addColumn("Harga Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Tanggal");
        try {
            String sql = "SELECT detailpenjualan.noFaktur,detailpenjualan.idBarang,detailpenjualan.jumlahBarang,"
                    + "detailpenjualan.hargaBarang,detailpenjualan.namaBarang,faktur.tanggal "
                    + "FROM detailpenjualan INNER JOIN faktur ON detailpenjualan.noFaktur=faktur.noFaktur "
                    + "WHERE detailpenjualan.noFaktur LIKE'%" + cari + "%' OR "
                    + "detailpenjualan.idBarang LIKE'%" + cari + "%' OR "
                    + "detailpenjualan.jumlahBarang LIKE'%" + cari + "%' OR "
                    + "detailpenjualan.hargaBarang LIKE'%" + cari + "%' OR "
                    + "detailpenjualan.namaBarang LIKE'%" + cari + "%' OR "
                    + "faktur.tanggal LIKE'%" + cari + "%' ORDER BY tanggal DESC";

            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();

            while (res.next()) {
                model.addRow(new Object[]{"#" + res.getString(1), res.getString(2),
                    res.getString(3), res.getString(4), res.getString(5), res.getString(6)});
            }
            tbr.setModel(model);
        } catch (SQLException e) {
        }

    }

    public void TampilanData() {

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No Faktur");
        model.addColumn("Id Barang");
        model.addColumn("jumlah Barang");
        model.addColumn("Harga Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Tanggal");

        String sql = "SELECT detailpenjualan.noFaktur,detailpenjualan.idBarang,detailpenjualan.jumlahBarang,"
                + "detailpenjualan.hargaBarang,detailpenjualan.namaBarang,faktur.tanggal "
                + "FROM detailpenjualan INNER JOIN faktur ON detailpenjualan.noFaktur=faktur.noFaktur ";
        System.out.println(sql);

        try {
            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2),
                    rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)});
            }
            tbr.setModel(model);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void tampilkan_tabelLP() {
        String tanggal = ((JTextField) date1.getDateEditor().getUiComponent()).getText();
        String tanggal2 = ((JTextField) date2.getDateEditor().getUiComponent()).getText();

        try {
            String sql1 = "SELECT detailpenjualan.noFaktur,detailpenjualan.idBarang,detailpenjualan.jumlahBarang,"
                    + "detailpenjualan.hargaBarang,detailpenjualan.namaBarang,faktur.tanggal FROM detailpenjualan "
                    + "JOIN faktur ON detailpenjualan.noFaktur=faktur.noFaktur "
                    + "WHERE faktur.tanggal BETWEEN '" + tanggal + "' AND '" + tanggal2 + "' ORDER BY tanggal ASC ";

            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement pst1 = conn.prepareStatement(sql1);
            java.sql.ResultSet rs = pst1.executeQuery(sql1);
            DefaultTableModel model = (DefaultTableModel) tbr.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2),
                    rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)});
            }
            tbr.setModel(model);
        } catch (SQLException ex) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbr = new com.kelompoka3.swing.Table();
        date1 = new com.toedter.calendar.JDateChooser();
        date2 = new com.toedter.calendar.JDateChooser();
        btnn = new com.kelompoka3.swing.ButtonCustom();
        search = new com.kelompoka3.swing.MyTextField();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1105, 720));

        tbr.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbr);

        date1.setDateFormatString("yyyy-MM-dd");

        date2.setDateFormatString("yyyy-MM-dd");

        btnn.setText("Tampilkan");
        btnn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnMouseClicked(evt);
            }
        });

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(79, 79, 79));
        jLabel1.setText("Sampai");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(185, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(date2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnMouseClicked
        // TODO add your handling code here:
        tampilkan_tabelLP();
    }//GEN-LAST:event_btnnMouseClicked

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        String key = search.getText();

        if (key != "") {
            tableformhistory(key);
        } else {
            tampilkan_tabelLP();
        }
    }//GEN-LAST:event_searchKeyReleased

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.kelompoka3.swing.ButtonCustom btnn;
    private com.toedter.calendar.JDateChooser date1;
    private com.toedter.calendar.JDateChooser date2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.kelompoka3.swing.MyTextField search;
    private com.kelompoka3.swing.Table tbr;
    // End of variables declaration//GEN-END:variables

}
