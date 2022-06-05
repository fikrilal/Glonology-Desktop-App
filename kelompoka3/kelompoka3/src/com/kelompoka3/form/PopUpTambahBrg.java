package com.kelompoka3.form;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import com.kelompoka3.koneksi.koneksi;
import com.onbarcode.barcode.EAN13;
import com.onbarcode.barcode.IBarcode;
import java.awt.Image;
import java.io.File;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Random;
import javax.imageio.ImageIO;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PopUpTambahBrg extends javax.swing.JFrame {

    public PopUpTambahBrg() {
        initComponents();
        idBrg.setHint("ID Barang");
        String rndmNmr = getrandomString(13);
        idBrg.setText(rndmNmr);
        idBrg.setEditable(false);
        nmBrg.setHint("Nama barang");
        jnsBrg.setHint("Jenis");
        wrnBrg.setHint("Warna");
        hrgBrgBeli.setHint("Harga Beli");
        hrgJual.setHint("Harga Jual");
        stokBrg.setHint("Stok");
    }
    private String sql = "";
    private String idBarang, namaBarang, jenis, warna, hargaJual, hargaBeli, stok;

    private void TambahkanData() {
        idBarang = String.valueOf(idBrg.getText());
        namaBarang = String.valueOf(nmBrg.getText());
        jenis = String.valueOf(jnsBrg.getText());
        warna = String.valueOf(wrnBrg.getText());
        hargaJual = String.valueOf(hrgBrgBeli.getText());
        hargaBeli = String.valueOf(hrgJual.getText());
        stok = String.valueOf(stokBrg.getText());
        String brcode = "C://drivers//" + this.nmBrg.getText().toString() + ".png";

        sql = "INSERT INTO barang VALUES ( '" + idBarang + "','" + namaBarang + "', '" + jenis + "', "
                + "'" + warna + "', '" + hargaJual + "', '" + hargaBeli + "', '" + stok + "', '" + brcode + "')";
        System.out.println(sql);
        try {

            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR \n" + e.getMessage());
        }
    }

    static String getrandomString(int panjangKarakter) {
        List<Character> charTemp = new ArrayList<>();
        for (int i = 0; i < panjangKarakter; i++) {
            charTemp.add((char) ThreadLocalRandom.current().nextInt(48, 57));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < charTemp.size(); i++) {
            sb.append(charTemp.get(i));
        }
        return sb.toString();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBatal = new com.kelompoka3.swing.ButtonCustom();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBatal1 = new com.kelompoka3.swing.ButtonCustom();
        btnSimpan = new com.kelompoka3.swing.ButtonCustom();
        idBrg = new com.kelompoka3.swing.MyTextField();
        nmBrg = new com.kelompoka3.swing.MyTextField();
        jnsBrg = new com.kelompoka3.swing.MyTextField();
        wrnBrg = new com.kelompoka3.swing.MyTextField();
        hrgBrgBeli = new com.kelompoka3.swing.MyTextField();
        hrgJual = new com.kelompoka3.swing.MyTextField();
        stokBrg = new com.kelompoka3.swing.MyTextField();

        btnBatal.setText("B AT A L");
        btnBatal.setStyle(com.kelompoka3.swing.ButtonCustom.ButtonStyle.DESTRUCTIVE);
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(79, 79, 79));
        jLabel1.setText("Tambah Barang");

        btnBatal1.setText("Kembali");
        btnBatal1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBatal1.setStyle(com.kelompoka3.swing.ButtonCustom.ButtonStyle.SECONDARY);
        btnBatal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatal1ActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nmBrg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jnsBrg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(wrnBrg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hrgBrgBeli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hrgJual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stokBrg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(idBrg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel1)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(idBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nmBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jnsBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(wrnBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hrgBrgBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hrgJual, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stokBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnBatal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatal1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnBatal1ActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        TambahkanData();
        encodeBarcode();

    }//GEN-LAST:event_btnSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(PopUpTambahBrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUpTambahBrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUpTambahBrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUpTambahBrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopUpTambahBrg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.kelompoka3.swing.ButtonCustom btnBatal;
    private com.kelompoka3.swing.ButtonCustom btnBatal1;
    private com.kelompoka3.swing.ButtonCustom btnSimpan;
    private com.kelompoka3.swing.MyTextField hrgBrgBeli;
    private com.kelompoka3.swing.MyTextField hrgJual;
    private com.kelompoka3.swing.MyTextField idBrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private com.kelompoka3.swing.MyTextField jnsBrg;
    private com.kelompoka3.swing.MyTextField nmBrg;
    private com.kelompoka3.swing.MyTextField stokBrg;
    private com.kelompoka3.swing.MyTextField wrnBrg;
    // End of variables declaration//GEN-END:variables

    public void encodeBarcode() {

        EAN13 objEan = new EAN13();
        objEan.setData(this.idBrg.getText().toString());
        objEan.setUom(IBarcode.UOM_PIXEL);
        objEan.setX(3f);
        objEan.setY(175f);

        objEan.setLeftMargin(0f);
        objEan.setRightMargin(0f);
        objEan.setTopMargin(0f);
        objEan.setBottomMargin(0f);
        objEan.setResolution(72);
        objEan.setShowText(true);
        objEan.setTextMargin(6);
        objEan.setRotate(IBarcode.ROTATE_0);
        try {
            objEan.drawBarcode("C://drivers//" + this.nmBrg.getText().toString() + ".png");
//            JOptionPane.showMessageDialog(this, "BARCODE BERHASIL.....");
        } catch (Exception ex) {
        }
    }

    public void setUkuranBarCode(EAN13 mBarcode, float panjangBarcode, float tinggiBarcode) {
        mBarcode.setX(panjangBarcode);
        mBarcode.setY(tinggiBarcode);

    }
}
