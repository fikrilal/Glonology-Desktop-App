package com.kelompoka3.form;

import com.kelompoka3.chart.ModelChart;
import com.kelompoka3.koneksi.koneksi;
import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.lang3.*;

public class formDashboard extends javax.swing.JPanel {

    public formDashboard() {
        initComponents();
        barangPerHari();
        barangPerBulan();
        penjualanPerHari();
        penjualanPerBulan();
        tableHistory();
        dataChart();
        setOpaque(false);
        table1.addTableStyle(jScrollPane1);
        table1.setDefaultEditor(Object.class, null);
        chartDashboard.addLabel("Tahun ini", new Color(113, 135, 116));
        chartDashboard.addLabel("Tahun lalu", new Color(79, 94, 83));
    }

    public final void dataChart() {

        try {
            String sql = "Select left(monthname(tanggal),3) as BULAN, sum(case "
                    + "when year(tanggal) = year(curdate()) then hargatotal else 0 end) "
                    + "as THISYEAR, sum(case when year(tanggal)+1 = year(curdate()) "
                    + "then hargaTotal else 0 end) as LASTYEAR From faktur GROUP "
                    + "BY MONTH(tanggal);;"; // Query LEFT digunakan untuk membatasi karakter yang ditampilkan, diambil dari yang paling kiri, 3 adalah batasan karakter
            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery(sql);

            ArrayList<String> perbulan = new ArrayList<>();
            ArrayList<Double> nominal = new ArrayList<>();
            ArrayList<Double> nominalLastyear = new ArrayList<>();

            //ArrayList<Double> harus diconvert ke double[] untuk bisa tampil di chart https://stackoverflow.com/questions/6018267/how-to-cast-from-listdouble-to-double-in-java
            double[] array = ArrayUtils.toPrimitive(nominal.toArray(new Double[nominal.size()]));
            double[] arrayLastyear = ArrayUtils.toPrimitive(nominalLastyear.toArray(new Double[nominalLastyear.size()]));

            while (res.next()) {
                perbulan.add(res.getString(1));
                nominal.add(res.getDouble(2));
                nominalLastyear.add(res.getDouble(3));

                chartDashboard.addData(new ModelChart(res.getString(1), new double[]{res.getDouble(2), res.getDouble(3)}));
            }

        } catch (SQLException e) {

        }
    }

    private void penjualanPerHari() {
        try {
            String sql = "SELECT SUM(hargaTotal) AS totalPenjualan FROM faktur "
                    + "WHERE YEAR(tanggal) = YEAR(NOW()) AND MONTH(tanggal) = "
                    + "MONTH(NOW()) AND DAY(tanggal) = DAY(NOW())";
            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                String data = res.getString("totalPenjualan");
                if (data == null) {
                    txt_penjualanhari.setText("Rp 0,-");
                } else {
                    txt_penjualanhari.setText("Rp " + data);
                }
            }
        } catch (SQLException e) {

        }
    }

    private void penjualanPerBulan() {
        try {
            String sql = "SELECT SUM(hargaTotal) AS totalPenjualan FROM faktur "
                    + "WHERE YEAR(tanggal) = YEAR(NOW()) AND MONTH(tanggal) = MONTH(NOW())";
            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                String data = res.getString("totalPenjualan");
                if (data == null) {
                    txt_penjualanbulan.setText("Rp 0,-");
                } else {
                    txt_penjualanbulan.setText("Rp " + data);
                }
            }
        } catch (SQLException e) {

        }
    }

    private void barangPerHari() {
        try {
            String sql = "SELECT SUM(jumlahTotal) AS totalBarang FROM faktur "
                    + "WHERE YEAR(tanggal) = YEAR(NOW()) AND MONTH(tanggal) = "
                    + "MONTH(NOW()) AND DAY(tanggal) = DAY(NOW())";
            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                String data = res.getString("totalBarang");
                if (data == null) {
                    txt_barangHari.setText("0 items");
                } else {
                    txt_barangHari.setText(data + " items");
                }
            }
        } catch (SQLException e) {

        }
    }

    private void barangPerBulan() {
        try {
            String sql = "SELECT SUM(jumlahTotal) AS totalBarang FROM faktur "
                    + "WHERE YEAR(tanggal) = YEAR(NOW()) AND MONTH(tanggal)=MONTH(NOW())";
            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                String data = res.getString("totalBarang");
                if (data == null) {
                    jLabel5.setText("0 items");
                } else {
                    jLabel5.setText(data + " items");
                }
            }
        } catch (SQLException e) {

        }
    }

    private void tableHistory() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Invoices");
        model.addColumn("Jumlah Barang");
        model.addColumn("Total Harga");
        model.addColumn("Tanggal");
        try {
            String sql = "SELECT noFaktur, jumlahTotal, hargaTotal, tanggal "
                    + "FROM faktur ORDER BY tanggal DESC";
            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{"# " + res.getString(1),
                    res.getString(2), res.getString(3), res.getString(4)});
            }
            table1.setModel(model);

        } catch (SQLException e) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new com.kelompoka3.swing.roundPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_penjualanhari = new javax.swing.JLabel();
        roundPanel2 = new com.kelompoka3.swing.roundPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_barangHari = new javax.swing.JLabel();
        roundPanel3 = new com.kelompoka3.swing.roundPanel();
        txt_penjualanbulan = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        roundPanel4 = new com.kelompoka3.swing.roundPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new com.kelompoka3.swing.Table();
        chartDashboard = new com.kelompoka3.chart.Chart();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1104, 720));

        roundPanel1.setBackground(new java.awt.Color(113, 135, 116));
        roundPanel1.setForeground(new java.awt.Color(141, 159, 144));
        roundPanel1.setPreferredSize(new java.awt.Dimension(130, 100));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Penjualan hari ini");
        roundPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 16, -1, -1));

        txt_penjualanhari.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_penjualanhari.setForeground(new java.awt.Color(255, 255, 255));
        txt_penjualanhari.setText("Rp. 230.000");
        roundPanel1.add(txt_penjualanhari, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 44, -1, -1));

        roundPanel2.setBackground(new java.awt.Color(113, 135, 116));
        roundPanel2.setForeground(new java.awt.Color(141, 159, 144));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Barang terjual hari ini");

        txt_barangHari.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_barangHari.setForeground(new java.awt.Color(255, 255, 255));
        txt_barangHari.setText("12 Items");

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txt_barangHari))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_barangHari)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roundPanel3.setBackground(new java.awt.Color(113, 135, 116));
        roundPanel3.setForeground(new java.awt.Color(141, 159, 144));
        roundPanel3.setPreferredSize(new java.awt.Dimension(130, 100));
        roundPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_penjualanbulan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_penjualanbulan.setForeground(new java.awt.Color(255, 255, 255));
        txt_penjualanbulan.setText("Rp. 43.000.000");
        roundPanel3.add(txt_penjualanbulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 44, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Penjualan bulan ini");
        roundPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 16, -1, -1));

        roundPanel4.setBackground(new java.awt.Color(113, 135, 116));
        roundPanel4.setForeground(new java.awt.Color(141, 159, 144));
        roundPanel4.setPreferredSize(new java.awt.Dimension(130, 100));
        roundPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("290 Items");
        roundPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 44, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Barang terjual bulan ini");
        roundPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 16, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(79, 79, 79));
        jLabel10.setText("History Transaksi");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(79, 79, 79));
        jLabel2.setText("Statistik Penjualan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(roundPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2)
                    .addComponent(chartDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap(299, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roundPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addGap(11, 11, 11)
                        .addComponent(chartDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)))
                .addGap(3, 3, 3))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.kelompoka3.chart.Chart chartDashboard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private com.kelompoka3.swing.roundPanel roundPanel1;
    private com.kelompoka3.swing.roundPanel roundPanel2;
    private com.kelompoka3.swing.roundPanel roundPanel3;
    private com.kelompoka3.swing.roundPanel roundPanel4;
    private com.kelompoka3.swing.Table table1;
    private javax.swing.JLabel txt_barangHari;
    private javax.swing.JLabel txt_penjualanbulan;
    private javax.swing.JLabel txt_penjualanhari;
    // End of variables declaration//GEN-END:variables
}
