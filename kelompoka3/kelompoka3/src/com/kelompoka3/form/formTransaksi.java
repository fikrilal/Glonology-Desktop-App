package com.kelompoka3.form;

import com.kelompoka3.koneksi.koneksi;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class formTransaksi extends javax.swing.JPanel {

    public formTransaksi() {
        initComponents();
        autoNumber();
        Date date = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        isiTanggal.setText(s.format(date));
        tabelBeli.addTableStyle(jScrollPane2);
        kodeBarang.setHint("Kode barang");
        namaBarang.setHint("Nama barang");
        quantity.setHint("QTY");
        hargaBarang.setHint("Harga barang");
//        total.setHint("Total");
        totalPembelian.setHint("Total pembelian");
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Quantity");
        model.addColumn("Harga Barang");
        model.addColumn("Total Harga");
        tabelBeli.setModel(model);
        tabelBeli.setDefaultEditor(Object.class, null);
        jumlahbarang.setVisible(false);
        faktur.setVisible(false);
        tabelBeli.getColumnModel().getColumn(0).setMaxWidth(204);
        tabelBeli.getColumnModel().getColumn(1).setMaxWidth(262);
        tabelBeli.getColumnModel().getColumn(2).setMaxWidth(98);
        tabelBeli.getColumnModel().getColumn(3).setMaxWidth(198);
        tabelBeli.getColumnModel().getColumn(4).setMaxWidth(313);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jumlahbarang = new javax.swing.JTextField();
        isiTanggal = new javax.swing.JLabel();
        faktur = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelBeli = new com.kelompoka3.swing.Table();
        kodeBarang = new com.kelompoka3.swing.MyTextField();
        namaBarang = new com.kelompoka3.swing.MyTextField();
        quantity = new com.kelompoka3.swing.MyTextField();
        hargaBarang = new com.kelompoka3.swing.MyTextField();
        tambahBarang = new com.kelompoka3.swing.ButtonCustom();
        hapus = new com.kelompoka3.swing.ButtonCustom();
        cetak = new com.kelompoka3.swing.ButtonCustom();
        totalPembelian = new com.kelompoka3.swing.MyTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jumlahbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahbarangActionPerformed(evt);
            }
        });

        isiTanggal.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        isiTanggal.setForeground(new java.awt.Color(255, 255, 255));

        tabelBeli.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabelBeli);

        kodeBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeBarangActionPerformed(evt);
            }
        });
        kodeBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                kodeBarangKeyTyped(evt);
            }
        });

        namaBarang.setEnabled(false);
        namaBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                namaBarangKeyTyped(evt);
            }
        });

        quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityKeyTyped(evt);
            }
        });

        hargaBarang.setEnabled(false);
        hargaBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hargaBarangKeyTyped(evt);
            }
        });

        tambahBarang.setText("Tambah Barang");
        tambahBarang.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tambahBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBarangActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hapus.setStyle(com.kelompoka3.swing.ButtonCustom.ButtonStyle.DESTRUCTIVE);
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        cetak.setText("Simpan");
        cetak.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakActionPerformed(evt);
            }
        });

        totalPembelian.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(kodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(tambahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(isiTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(faktur, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jumlahbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cetak, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(totalPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tambahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(isiTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(totalPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cetak, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumlahbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faktur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void autoNumber() {
        try {
            Connection c = (Connection) koneksi.koneksi();
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("select * from faktur order by noFaktur desc");

            if (r.next()) {

                int no_t = Integer.parseInt(r.getString("noFaktur")) + 1;
                faktur.setText(Integer.toString(no_t));
            } else {
                int no_t = 1;
                faktur.setText(Integer.toString(no_t));
            }

            r.close();
            s.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void kodeBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeBarangActionPerformed
        if (kodeBarang.getText().length() == 0) {
            namaBarang.setText("");
            hargaBarang.setText("");
            quantity.setText("");
        }
        try {
            String kb = kodeBarang.getText();
//              if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String sql = "select * from barang where idBarang = '" + kb + "'";
//                    +evt.getKeyChar() +"";
            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                namaBarang.setText(rs.getString("namaBarang"));
                hargaBarang.setText(rs.getString("hargaJual"));
            }
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_kodeBarangActionPerformed

    private void quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyTyped
        filterhuruf(evt);
    }//GEN-LAST:event_quantityKeyTyped

    private void hargaBarangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hargaBarangKeyTyped
        filterhuruf(evt);
    }//GEN-LAST:event_hargaBarangKeyTyped

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabelBeli.getModel();
        int row = tabelBeli.getSelectedRow();
        model.removeRow(row);
        clear();
        clear2();
        totalBiaya();
        totalBarang();
    }//GEN-LAST:event_hapusActionPerformed

    private void jumlahbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahbarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahbarangActionPerformed

    private void tambahBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahBarangActionPerformed
        cekstok();
    }//GEN-LAST:event_tambahBarangActionPerformed

    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakActionPerformed
        try {
            Connection c = (Connection) koneksi.koneksi();
            String sql = "insert into faktur (noFaktur,hargatotal, jumlahtotal, tanggal) values('"
                    + faktur.getText() + "','" + totalPembelian.getText() + "','" + jumlahbarang.getText() + "','" + isiTanggal.getText() + "')";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.execute();
            pst.close();
            int baris = tabelBeli.getRowCount();
            for (int i = 0; i < baris; i++) {
                String sqll = "insert into detailpenjualan (noFaktur,idBarang,namaBarang,hargaBarang, jumlahBarang) values ('"
                        + faktur.getText() + "','" + tabelBeli.getValueAt(i, 0) + "','" + tabelBeli.getValueAt(i, 1) + "',"
                        + "'" + tabelBeli.getValueAt(i, 3) + "','" + tabelBeli.getValueAt(i, 2) + "')";
                PreparedStatement pstl = c.prepareStatement(sqll);
                pstl.execute();
                pstl.close();
                JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil !");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println("Penyimpanan Error !");
        }
        clear();
        clear2();
        autoNumber();
        kosong();

        new formFaktur2().setVisible(true);
    }//GEN-LAST:event_cetakActionPerformed

    private void kodeBarangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kodeBarangKeyTyped
        filterhuruf(evt);
    }//GEN-LAST:event_kodeBarangKeyTyped

    private void namaBarangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaBarangKeyTyped
        filterangka(evt);
    }//GEN-LAST:event_namaBarangKeyTyped

    public void clear() {
        totalPembelian.setText("");
    }

    public void clear2() {
        kodeBarang.setText("");
        namaBarang.setText("");
        quantity.setText("");
        hargaBarang.setText("");
//      
    }

    public void tambahTranksaksi() {
        int jumlah, harga, totalharga;

        jumlah = Integer.valueOf(quantity.getText());
        harga = Integer.valueOf(hargaBarang.getText());
        totalharga = jumlah * harga;
//        total.setText(String.valueOf(totalharga));
        LoadData();
        totalBiaya();
        totalBarang();
        clear2();
        kodeBarang.requestFocus();
    }

    public void cekstok() {
        int qty = Integer.parseInt(quantity.getText());
        try {
            String sql = "Select stok from barang where idBarang ='" + kodeBarang.getText() + "'";
            Connection c = (Connection) koneksi.koneksi();
            Statement stm = c.createStatement();
            ResultSet res = stm.executeQuery(sql);
            if (res.next()) {
                int stok = res.getInt(1);
                if (stok < qty) {
                    JOptionPane.showMessageDialog(this, "Maaf Stok Barang telah Habis !");
                    int respon = JOptionPane.showConfirmDialog(this,
                            "silahkan hubungi supplier untuk menambahkan stok", "Messege", JOptionPane.YES_NO_OPTION);
                    if (respon == JOptionPane.YES_OPTION) {
                    } else if (respon == JOptionPane.NO_OPTION) {
                    }
                } else {
                    tambahTranksaksi();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void LoadData() {
        DefaultTableModel model = (DefaultTableModel) tabelBeli.getModel();

        String kd_barang = kodeBarang.getText();
        String nm_barang = namaBarang.getText();
        String harga_barang = hargaBarang.getText();
        String quantity = this.quantity.getText();
        String totalHarga = "";
        boolean noMerge = true;

        if (model.getRowCount() >= 1) {
            for (int i = 0; i < model.getRowCount(); i++) {

                String name = (String) model.getValueAt(i, 1);

                if (name.equalsIgnoreCase(namaBarang.getText())) {
                    noMerge = false;
                    // Modify the quantity of the last row
                    int oldQuantity = Integer.parseInt((String) model.getValueAt(i, 2));

                    int newQuantity = oldQuantity + Integer.parseInt(quantity);
                    // int hargaBaru = harga + Integer.parseInt(hargaBarang);
                    model.setValueAt(Integer.toString(newQuantity), i, 2);
                    String total = Integer.toString(newQuantity * Integer.parseInt(hargaBarang.getText()));
                    model.setValueAt(total, i, 4);
                }

            }
        }

        if (noMerge) {
            model.addRow(new Object[]{
                kd_barang, nm_barang, quantity, harga_barang, Integer.toString(Integer.parseInt(quantity) * Integer.parseInt(hargaBarang.getText()))});
        }
        this.tabelBeli.setModel(model);

    }

    public void kosong() {
        DefaultTableModel model = (DefaultTableModel) tabelBeli.getModel();

        while (model.getRowCount() > 0) {
            model.removeRow(0);

        }
    }

    void filterhuruf(KeyEvent a) {
        if (Character.isAlphabetic(a.getKeyChar())) {
            a.consume();
            JOptionPane.showMessageDialog(null, "Pada Kolom Jumlah Hanya Bisa Memasukan Karakter Angka");
        }
    }

    void filterangka(KeyEvent b) {
        if (Character.isDigit(b.getKeyChar())) {
            b.consume();
            JOptionPane.showMessageDialog(null, "Pada Kolom Jumlah Hanya Bisa Memasukan Karakter Huruf");
        }
    }

    public void totalBiaya() {
        int jumlahBaris = tabelBeli.getRowCount();
        int totalBiaya = 0;
        int hargaBarang;

        for (int i = 0; i < jumlahBaris; i++) {
            hargaBarang = Integer.parseInt(tabelBeli.getValueAt(i, 4).toString());
            totalBiaya = totalBiaya + hargaBarang;

        }
        totalPembelian.setText(String.valueOf(totalBiaya));

    }

    public void totalBarang() {
        int jumlahBaris = tabelBeli.getRowCount();
        int totalBiaya = 0;
        int jumlahBarang;

        for (int i = 0; i < jumlahBaris; i++) {
            jumlahBarang = Integer.parseInt(tabelBeli.getValueAt(i, 2).toString());
            totalBiaya = totalBiaya + jumlahBarang;

        }
        jumlahbarang.setText(String.valueOf(totalBiaya));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.kelompoka3.swing.ButtonCustom cetak;
    private javax.swing.JTextField faktur;
    private com.kelompoka3.swing.ButtonCustom hapus;
    private com.kelompoka3.swing.MyTextField hargaBarang;
    private javax.swing.JLabel isiTanggal;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jumlahbarang;
    private com.kelompoka3.swing.MyTextField kodeBarang;
    private com.kelompoka3.swing.MyTextField namaBarang;
    private com.kelompoka3.swing.MyTextField quantity;
    private com.kelompoka3.swing.Table tabelBeli;
    private com.kelompoka3.swing.ButtonCustom tambahBarang;
    private com.kelompoka3.swing.MyTextField totalPembelian;
    // End of variables declaration//GEN-END:variables

}
