
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
import javax.swing.table.TableModel;

/**
 *
 * @author AMEL
 */
public class formTransaksi extends javax.swing.JPanel {

    public formTransaksi() {
        initComponents();
        autoNumber();
        Date date = new Date();
        SimpleDateFormat s  = new SimpleDateFormat("yyyy-MM-dd");
        
        isiTanggal .setText(s.format(date));
        
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
        totalPembelian = new javax.swing.JTextField();
        jumlahbarang = new javax.swing.JTextField();
        isiTanggal = new javax.swing.JLabel();
        faktur = new javax.swing.JTextField();

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

        namaBarang.setEnabled(false);
        namaBarang.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                namaBarangInputMethodTextChanged(evt);
            }
        });
        namaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaBarangActionPerformed(evt);
            }
        });
        namaBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                namaBarangKeyReleased(evt);
            }
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

        hargaBarang.setEnabled(false);
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
        add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 610, 90, 40));

        cetak.setBackground(new java.awt.Color(0, 102, 51));
        cetak.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cetak.setForeground(new java.awt.Color(255, 255, 255));
        cetak.setText("SELESAI");
        cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakActionPerformed(evt);
            }
        });
        add(cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 610, 100, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("TOTAL PEMBELIAN");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 540, -1, -1));

        totalPembelian.setEnabled(false);
        totalPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPembelianActionPerformed(evt);
            }
        });
        add(totalPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 530, 172, 40));
        add(jumlahbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 610, 70, -1));
        add(isiTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 90, 20));
        add(faktur, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 610, 50, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void autoNumber(){
        try {
            Connection c = (Connection)koneksi.koneksi();
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("select * from faktur order by noFaktur desc");
            
            if (r.next()){
                
                int no_t = Integer.parseInt(r.getString("noFaktur")) + 1;
                faktur.setText(Integer.toString(no_t));}
                else{int no_t = 1;faktur.setText(Integer.toString(no_t));}
            
        r.close();
        s.close();
        }
         catch(Exception e){
             JOptionPane.showMessageDialog(this,e);
    }   }    
    
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
cekstok();       
    }//GEN-LAST:event_tambahBarangActionPerformed

    private void kodeBarangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kodeBarangKeyTyped
          filterhuruf(evt);
          if(kodeBarang.getText().toString().length() == 0){
              namaBarang.setText("");
              hargaBarang.setText("");
              quantity.setText("");
          }
          try {
            String sql ="select * from barang where idBarang = "+evt.getKeyChar() +"";
            java.sql.Connection conn=(Connection)koneksi.koneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery();
            while(rs.next()){
        namaBarang.setText(rs.getString("namaBarang"));
        hargaBarang.setText(rs.getString("hargaJual"));
            }

        }catch (SQLException e){
            
        }  

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

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        DefaultTableModel model = (DefaultTableModel)tabelBeli.getModel();
        
        int row = tabelBeli.getSelectedRow();
        model.removeRow(row);
        totalBiaya();
        totalBarang();
        clear();
        clear2();
        
    }//GEN-LAST:event_hapusActionPerformed

    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakActionPerformed

 
        
        
        clear();
        clear2();
        autoNumber();
        kosong();
            
                  
        new formFaktur2().setVisible(true);

    }//GEN-LAST:event_cetakActionPerformed

    private void totalPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPembelianActionPerformed
        
    }//GEN-LAST:event_totalPembelianActionPerformed

    private void namaBarangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaBarangKeyReleased

    }//GEN-LAST:event_namaBarangKeyReleased

    private void namaBarangInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_namaBarangInputMethodTextChanged

    }//GEN-LAST:event_namaBarangInputMethodTextChanged

    public void clear(){
        totalPembelian.setText("");
        
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
        totalBarang();
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
                        "silahkan hubungi supplier untuk menambahkan stok","Messege",JOptionPane.YES_NO_OPTION);
                if(respon==JOptionPane.YES_OPTION){
//                    this.setVisible(false);
//                    new formBarang().setVisible(true);
//                    formBarang obj = new formBarang ();
//                        setLayout(new BorderLayout());
//                        add(obj ,BorderLayout.EAST ,1);//3rd argument is index
//                        repaint();
//                        revalidate();
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
        int hargaBarang ;
        
        for (int i = 0 ; i<jumlahBaris ; i++){
            hargaBarang = Integer.parseInt(tabelBeli.getValueAt(i, 4).toString());
            totalBiaya = totalBiaya + hargaBarang;
            
        }
     totalPembelian.setText(String.valueOf(totalBiaya));
      
    }

    public void totalBarang(){
        int jumlahBaris = tabelBeli.getRowCount();
        int totalBiaya = 0;
        int jumlahBarang ;
        
        for (int i = 0 ; i<jumlahBaris ; i++){
            jumlahBarang = Integer.parseInt(tabelBeli.getValueAt(i, 2).toString());
            totalBiaya = totalBiaya + jumlahBarang;
            
        }
        jumlahbarang.setText(String.valueOf(totalBiaya));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cetak;
    private javax.swing.JTextField faktur;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField hargaBarang;
    private javax.swing.JLabel isiTanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlahbarang;
    private javax.swing.JTextField kodeBarang;
    private javax.swing.JTextField namaBarang;
    private javax.swing.JTextField quantity;
    private com.kelompoka3.swing.Table tabelBeli;
    private javax.swing.JButton tambahBarang;
    private javax.swing.JTextField total;
    private javax.swing.JTextField totalPembelian;
    // End of variables declaration//GEN-END:variables

   

}
