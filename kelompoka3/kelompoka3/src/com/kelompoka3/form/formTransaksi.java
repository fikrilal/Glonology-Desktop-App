/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kelompoka3.form;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AMEL
 */
public class formTransaksi extends javax.swing.JPanel {

    public formTransaksi() {
        initComponents();
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Kode Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Quantity");
        model.addColumn("Harga Barang");
        model.addColumn("Total Harga");
        
        tabelBeli.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBeli = new com.kelompoka3.swing.Table();
        kodeBarang = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        namaBarang = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        hargaBarang = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tambahBarang = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        cetak = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        totalPembelian = new javax.swing.JTextField();
        pembayaran = new javax.swing.JTextField();
        kembalian = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        tabelBeli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "KODE BARANG", "NAMA BARANG", "QUANTITY", "HARGA BARANG", "TOTAL HARGA"
            }
        ));
        jScrollPane1.setViewportView(tabelBeli);

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

        jLabel1.setFont(new java.awt.Font("Roboto Slab", 1, 14)); // NOI18N
        jLabel1.setText("KODE BARANG");

        namaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaBarangActionPerformed(evt);
            }
        });
        namaBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                namaBarangKeyTyped(evt);
            }
        });

        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });
        quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityKeyTyped(evt);
            }
        });

        hargaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaBarangActionPerformed(evt);
            }
        });
        hargaBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hargaBarangKeyTyped(evt);
            }
        });

        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                totalKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Slab", 1, 14)); // NOI18N
        jLabel2.setText("NAMA BARANG");

        jLabel3.setFont(new java.awt.Font("Roboto Slab", 1, 14)); // NOI18N
        jLabel3.setText("QUANTITY");

        jLabel4.setFont(new java.awt.Font("Roboto Slab", 1, 14)); // NOI18N
        jLabel4.setText("HARGA BARANG");

        jLabel5.setFont(new java.awt.Font("Roboto Slab", 1, 14)); // NOI18N
        jLabel5.setText("TOTAL");

        tambahBarang.setBackground(new java.awt.Color(0, 102, 51));
        tambahBarang.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tambahBarang.setForeground(new java.awt.Color(255, 255, 255));
        tambahBarang.setText("TAMBAH BARU");
        tambahBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBarangActionPerformed(evt);
            }
        });

        simpan.setBackground(new java.awt.Color(0, 102, 51));
        simpan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        simpan.setForeground(new java.awt.Color(255, 255, 255));
        simpan.setText("SIMPAN");

        edit.setBackground(new java.awt.Color(0, 102, 51));
        edit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("EDIT");

        hapus.setBackground(new java.awt.Color(0, 102, 51));
        hapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hapus.setForeground(new java.awt.Color(255, 255, 255));
        hapus.setText("HAPUS");

        cetak.setBackground(new java.awt.Color(0, 102, 51));
        cetak.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cetak.setForeground(new java.awt.Color(255, 255, 255));
        cetak.setText("CETAK");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("TOTAL PEMBELIAN");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("PEMBAYARAN");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("KEMBALIAN");

        pembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pembayaranActionPerformed(evt);
            }
        });
        pembayaran.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pembayaranKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(tambahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(totalPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(simpan)
                .addGap(36, 36, 36)
                .addComponent(edit)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hapus)
                    .addComponent(cetak))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tambahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(simpan)
                            .addComponent(edit)
                            .addComponent(hapus)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(cetak))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void kodeBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeBarangActionPerformed
      
    }//GEN-LAST:event_kodeBarangActionPerformed

    private void namaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaBarangActionPerformed
    
    }//GEN-LAST:event_namaBarangActionPerformed

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
      
    }//GEN-LAST:event_quantityActionPerformed

    private void hargaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaBarangActionPerformed
 
    }//GEN-LAST:event_hargaBarangActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed

    }//GEN-LAST:event_totalActionPerformed

    private void tambahBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahBarangActionPerformed
       
    }//GEN-LAST:event_tambahBarangActionPerformed

    private void pembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pembayaranActionPerformed

       int total,bayar,uangKembali;
        
        total = Integer.valueOf(totalPembelian.getText());
        bayar = Integer.valueOf(pembayaran.getText());
        
        if (total>bayar){
            JOptionPane.showMessageDialog(null, "Uang Tidak Cukup Untuk Melakukan Pembayaran !");
            
        }else {
            uangKembali = bayar-total ;
            kembalian.setText(String.valueOf(uangKembali));
        }
    }//GEN-LAST:event_pembayaranActionPerformed

    private void kodeBarangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kodeBarangKeyTyped
          filterhuruf(evt);
    }//GEN-LAST:event_kodeBarangKeyTyped

    private void namaBarangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaBarangKeyTyped
           filterangka(evt);
    }//GEN-LAST:event_namaBarangKeyTyped

    private void quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyTyped
             filterhuruf(evt);
    }//GEN-LAST:event_quantityKeyTyped

    private void hargaBarangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hargaBarangKeyTyped
            filterhuruf(evt);
    }//GEN-LAST:event_hargaBarangKeyTyped

    private void totalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalKeyTyped
            filterhuruf(evt);
    }//GEN-LAST:event_totalKeyTyped

    private void pembayaranKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pembayaranKeyTyped
         filterhuruf(evt);
    }//GEN-LAST:event_pembayaranKeyTyped
public void LoadData(){
        DefaultTableModel model = (DefaultTableModel)tabelBeli.getModel();
        model.addRow(new Object[]{
        kodeBarang.getText(),
        namaBarang.getText(),
        quantity.getText(),
        hargaBarang.getText(),
        total.getText(),
  
    });
    }

public void kosong(){
        DefaultTableModel model=(DefaultTableModel) tabelBeli.getModel();
        
        while (model.getRowCount()>0){
            model.removeRow(0);
            
        }
    }

void filterhuruf(KeyEvent a){
        if(Character.isAlphabetic(a.getKeyChar())){
            a.consume();
            JOptionPane.showMessageDialog(null,"Pada Kolom Jumlah Hanya Bisa Memasukan Karakter Angka");
        }
    }
void filterangka(KeyEvent b){
        if(Character.isDigit(b.getKeyChar())){
            b.consume();
            JOptionPane.showMessageDialog(null,"Pada Kolom Jumlah Hanya Bisa Memasukan Karakter Huruf");
        }
    }
    
    public void totalBiaya(){
        int jumlahBaris = tabelBeli.getRowCount();
        int totalBiaya = 0;
        int jumlahBarang, hargaBarang;
        
        for (int i = 0 ; i<jumlahBaris ; i++){
            jumlahBarang = Integer.parseInt(tabelBeli.getValueAt(i, 4).toString());
            hargaBarang = Integer.parseInt(tabelBeli.getValueAt(i, 5).toString());
            totalBiaya = totalBiaya + (jumlahBarang * hargaBarang);
            
        }
        //txt_total.setText(String.valueOf(totalBiaya));
        totalPembelian.setText("Rp"+totalBiaya+",-");
                
    }
//private void Tabel(){
//    DefaultTableModel model = new DefaultTableModel();
//    model.addColumn("No");
//    model.addColumn("Id Barang");
//    model.addColumn("Nama Barang");
//    model.addColumn("Jenis Barang");
//     model.addColumn("Merek Barang");
//     model.addColumn("Stok Barang");
//    model.addColumn("Harga Jual");
//    model.addColumn("Harga Beli");
//    
//    
//    try{
//        int no=1;
//        String query ="SELECT * FROM barang";
//        java.sql.Connection conn = (Connection) koneksi.koneksi();
//        java.sql.Statement stm = conn.createStatement();
//        java.sql.ResultSet res = stm.executeQuery(query);
//        while(res.next()){
//            model.addRow(new Object[] {no++,res.getString(1),res.getString(2), 
//            res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7)});
//        }
//                tabelBeli.setModel(model);
//    } catch (Exception e){
//    }
//}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cetak;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField hargaBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kembalian;
    private javax.swing.JTextField kodeBarang;
    private javax.swing.JTextField namaBarang;
    private javax.swing.JTextField pembayaran;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton simpan;
    private com.kelompoka3.swing.Table tabelBeli;
    private javax.swing.JButton tambahBarang;
    private javax.swing.JTextField total;
    private javax.swing.JTextField totalPembelian;
    // End of variables declaration//GEN-END:variables


}
