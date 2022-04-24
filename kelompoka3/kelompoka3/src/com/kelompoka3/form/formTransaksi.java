
package com.kelompoka3.form;

import com.kelompoka3.koneksi.koneksi;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBeli = new com.kelompoka3.swing.Table();
        tambahBarang = new javax.swing.JButton();
        kodeBarang = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        namaBarang = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        hargaBarang = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hapus = new javax.swing.JButton();
        cetak = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        totalPembelian = new javax.swing.JTextField();
        pembayaran = new javax.swing.JTextField();
        kembalian = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 152, 1031, 362));

        tambahBarang.setBackground(new java.awt.Color(0, 102, 51));
        tambahBarang.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tambahBarang.setForeground(new java.awt.Color(255, 255, 255));
        tambahBarang.setText("TAMBAH");
        tambahBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBarangActionPerformed(evt);
            }
        });
        add(tambahBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 130, 40));

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
        add(kodeBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 72, 123, 40));

        jLabel1.setFont(new java.awt.Font("Roboto Slab", 1, 14)); // NOI18N
        jLabel1.setText("KODE BARANG");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 28, 123, 21));

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
        add(namaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 72, 204, 40));

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
        add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 72, 123, 40));

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
        add(hargaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 72, 204, 40));

        total.setEnabled(false);
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
        add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 123, 40));

        jLabel2.setFont(new java.awt.Font("Roboto Slab", 1, 14)); // NOI18N
        jLabel2.setText("NAMA BARANG");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 28, 123, 21));

        jLabel3.setFont(new java.awt.Font("Roboto Slab", 1, 14)); // NOI18N
        jLabel3.setText("QUANTITY");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 28, 123, 21));

        jLabel4.setFont(new java.awt.Font("Roboto Slab", 1, 14)); // NOI18N
        jLabel4.setText("HARGA BARANG");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 28, 123, 21));

        hapus.setBackground(new java.awt.Color(0, 102, 51));
        hapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hapus.setForeground(new java.awt.Color(255, 255, 255));
        hapus.setText("HAPUS");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(764, 545, -1, -1));

        cetak.setBackground(new java.awt.Color(0, 102, 51));
        cetak.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cetak.setForeground(new java.awt.Color(255, 255, 255));
        cetak.setText("CETAK");
        cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakActionPerformed(evt);
            }
        });
        add(cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(876, 545, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("TOTAL PEMBELIAN");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 545, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("PEMBAYARAN");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 545, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("KEMBALIAN");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 545, -1, -1));

        totalPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPembelianActionPerformed(evt);
            }
        });
        add(totalPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 580, 172, 40));

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
        add(pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 580, 172, 40));
        add(kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 580, 172, 40));
    }// </editor-fold>                        

    private void kodeBarangActionPerformed(java.awt.event.ActionEvent evt) {                                           
      
    }                                          

    private void namaBarangActionPerformed(java.awt.event.ActionEvent evt) {                                           
    
    }                                          

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {                                         
      
    }                                        

    private void hargaBarangActionPerformed(java.awt.event.ActionEvent evt) {                                            
 
    }                                           

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {                                      

    }                                     

    private void tambahBarangActionPerformed(java.awt.event.ActionEvent evt) {                                             
cekstok();       
    }                                            

    private void pembayaranActionPerformed(java.awt.event.ActionEvent evt) {                                           

       int total,bayar,uangKembali;
        
        total = Integer.valueOf(totalPembelian.getText());
        bayar = Integer.valueOf(pembayaran.getText());
        
        if (total>bayar){
            JOptionPane.showMessageDialog(null, "Uang Tidak Cukup Untuk Melakukan Pembayaran !");
            
        }else {
            uangKembali = bayar-total ;
            kembalian.setText(String.valueOf(uangKembali));
        }
    }                                          

    private void kodeBarangKeyTyped(java.awt.event.KeyEvent evt) {                                    
          filterhuruf(evt);
    }                                   

    private void namaBarangKeyTyped(java.awt.event.KeyEvent evt) {                                    
           filterangka(evt);
    }                                   

    private void quantityKeyTyped(java.awt.event.KeyEvent evt) {                                  
             filterhuruf(evt);
    }                                 

    private void hargaBarangKeyTyped(java.awt.event.KeyEvent evt) {                                     
            filterhuruf(evt);
    }                                    

    private void totalKeyTyped(java.awt.event.KeyEvent evt) {                               
            filterhuruf(evt);
    }                              

    private void pembayaranKeyTyped(java.awt.event.KeyEvent evt) {                                    
         filterhuruf(evt);
    }                                   

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {                                      
        DefaultTableModel model = (DefaultTableModel)tabelBeli.getModel();
        
        int row = tabelBeli.getSelectedRow();
        model.removeRow(row);
        totalBiaya();
        clear();
        clear2();
        
    }                                     

    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {                                      
        new formFaktur2().setVisible(true);

    }                                     

    private void totalPembelianActionPerformed(java.awt.event.ActionEvent evt) {                                               
        
    }                                              

    public void clear(){
        totalPembelian.setText("0");
        pembayaran.setText("0");
        kembalian.setText("0");
    }
    
    public void clear2(){
       kodeBarang.setText("");
        namaBarang.setText("");
        quantity.setText("");
        hargaBarang.setText("");
        total.setText("");
    }
    
    public void tambahTranksaksi(){
        int jumlah,harga,totalharga;
        
        jumlah = Integer.valueOf(quantity.getText());
        harga= Integer.valueOf(hargaBarang.getText());
        totalharga = jumlah * harga ;
        total.setText(String.valueOf(totalharga));
        LoadData();
        totalBiaya();
        clear2();
        kodeBarang.requestFocus();}
    public void cekstok(){
        int qty = Integer.parseInt(quantity.getText());
        try{
        String sql ="Select stok from barang where idBarang ='"+kodeBarang.getText()+"'";
        Connection c =(Connection)koneksi.koneksi();Statement stm = c.createStatement();
        ResultSet res=stm.executeQuery(sql);
           if(res.next()){
            int stok = res.getInt(1);
            if (stok < qty){
                JOptionPane.showMessageDialog(this,"Maaf Stok Barang telah Habis !");
                int respon = JOptionPane.showConfirmDialog(this,
                        "Apakah anda Ingin menambahkan Stok ?","Messege",JOptionPane.YES_NO_OPTION);
                if(respon==JOptionPane.YES_OPTION){
                    //this.setVisible(false);
                   // new formBarang().setVisible(true);
                }else if(respon==JOptionPane.NO_OPTION) {}
            }else{
                tambahTranksaksi();
            }
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(this,e);
    }
    }
    
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
        
        for (int i = 0 ; i<jumlahBaris ; i++){
            totalBiaya = Integer.parseInt(tabelBeli.getValueAt(i, 4).toString());
            
        }
        totalPembelian.setText(String.valueOf(totalBiaya));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton cetak;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField hargaBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kembalian;
    private javax.swing.JTextField kodeBarang;
    private javax.swing.JTextField namaBarang;
    private javax.swing.JTextField pembayaran;
    private javax.swing.JTextField quantity;
    private com.kelompoka3.swing.Table tabelBeli;
    private javax.swing.JButton tambahBarang;
    private javax.swing.JTextField total;
    private javax.swing.JTextField totalPembelian;
    // End of variables declaration                   


}
