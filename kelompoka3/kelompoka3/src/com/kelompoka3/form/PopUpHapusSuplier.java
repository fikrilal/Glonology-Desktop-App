package com.kelompoka3.form;

import com.kelompoka3.koneksi.koneksi;
import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author @Syailendra
 */
public class PopUpHapusSuplier extends javax.swing.JFrame {
 private String sql="";
    private String idSuplier, nama, noHp, alamat, txtket;
    /**
     * Creates new form PopUpHapus
     */
    public PopUpHapusSuplier() {
        initComponents();
        TampilanData();
    }
      private void HapusData(){
        idSuplier=String.valueOf(idsup.getText());
        sql= "DELETE FROM suplier WHERE idSuplier = '"+idSuplier+"'";
        try{  
            java.sql.Connection conn=(Connection)koneksi.koneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            TampilanData();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR \n"+e.getMessage());
        }
    }
    private void TampilanData(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Suplier");
        model.addColumn("Nama Suplier");
        model.addColumn("Alamat");        
        model.addColumn("No Telfon");
        model.addColumn("Keterangan");
        
        
        String sql="SELECT * FROM `suplier`";
        System.out.println(sql);
        
        try{
            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet rs = stm.executeQuery();
           
            while(rs.next()){
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
                
                
            }
            jtable1.setModel(model);            
        }catch(Exception e){
            e.getMessage();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        nBarang = new javax.swing.JLabel();
        jBarang = new javax.swing.JLabel();
        IDbrg = new javax.swing.JLabel();
        wrn = new javax.swing.JLabel();
        namaSup = new javax.swing.JTextField();
        noHp1 = new javax.swing.JTextField();
        idsup = new javax.swing.JTextField();
        alamat1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtKet = new javax.swing.JTextField();
        btnHapus = new com.kelompoka3.swing.ButtonCustom();
        btnBatal = new com.kelompoka3.swing.ButtonCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        nBarang.setText("Nama Suplier");

        jBarang.setText("No HP");

        IDbrg.setText("ID Suplier");

        wrn.setText("Alamat");

        namaSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaSupActionPerformed(evt);
            }
        });

        jtable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Suplier", "Nama Suplier", "No Hp", "Alamat", "Keteranganl"
            }
        ));
        jtable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable1);

        jLabel1.setText("Keterangan");

        txtKet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKetActionPerformed(evt);
            }
        });

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kelompoka3/icons/Delete-1.png"))); // NOI18N
        btnHapus.setText("H A P U S");
        btnHapus.setStyle(com.kelompoka3.swing.ButtonCustom.ButtonStyle.DESTRUCTIVE);
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnBatal.setText(" B A T A L");
        btnBatal.setStyle(com.kelompoka3.swing.ButtonCustom.ButtonStyle.SECONDARY);
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nBarang)
                            .addComponent(jBarang)
                            .addComponent(IDbrg)
                            .addComponent(wrn)
                            .addComponent(jLabel1))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alamat1)
                            .addComponent(namaSup)
                            .addComponent(noHp1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(idsup, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtKet))))
                .addGap(57, 57, 57))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDbrg)
                    .addComponent(idsup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nBarang)
                    .addComponent(namaSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBarang)
                    .addComponent(noHp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wrn)
                    .addComponent(alamat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKet, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaSupActionPerformed
        // TODO add your handling code here:
        FormSuplier brg = new FormSuplier();
        brg.setVisible(true);
        dispose();
    }//GEN-LAST:event_namaSupActionPerformed

    private void jtable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable1MouseClicked
        // TODO add your handling code here:

        int baris = jtable1.rowAtPoint(evt.getPoint());
        if(jtable1.getValueAt(baris, 0)==null){
            idsup.setText("");
        }else{
            idsup.setText(jtable1.getValueAt(baris, 0).toString());
        }
        if(jtable1.getValueAt(baris, 1)==null){
            namaSup.setText("");
        }else{
            namaSup.setText(jtable1.getValueAt(baris, 1).toString());
        }
        if(jtable1.getValueAt(baris, 2)==null){
            noHp1.setText("");
        }else{
            noHp1.setText(jtable1.getValueAt(baris, 2).toString());
        }
        if(jtable1.getValueAt(baris, 3)==null){
            alamat1.setText("");
        }else{
            alamat1.setText(jtable1.getValueAt(baris, 3).toString());
        }
        if(jtable1.getValueAt(baris, 4)==null){
            txtKet.setText("");
        }else{
            txtKet.setText(jtable1.getValueAt(baris, 4).toString());
        }
        
    }//GEN-LAST:event_jtable1MouseClicked

    private void txtKetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKetActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        HapusData();
        idsup.setText("");
        namaSup.setText("");
        noHp1.setText("");
        alamat1.setText("");
        txtKet.setText("");
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnBatalActionPerformed

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
            java.util.logging.Logger.getLogger(PopUpHapusSuplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUpHapusSuplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUpHapusSuplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUpHapusSuplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopUpHapusSuplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDbrg;
    private javax.swing.JTextField alamat1;
    private com.kelompoka3.swing.ButtonCustom btnBatal;
    private com.kelompoka3.swing.ButtonCustom btnHapus;
    private javax.swing.JTextField idsup;
    private javax.swing.JLabel jBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtable1;
    private javax.swing.JLabel nBarang;
    private javax.swing.JTextField namaSup;
    private javax.swing.JTextField noHp1;
    private javax.swing.JTextField txtKet;
    private javax.swing.JLabel wrn;
    // End of variables declaration//GEN-END:variables
}
