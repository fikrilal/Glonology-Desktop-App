package com.kelompoka3.form;

import com.kelompoka3.koneksi.koneksi;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Syailendra
 */
public class FormSuplier extends javax.swing.JPanel {

    /**
     * Creates new form formBarang
     */
    public FormSuplier() {
        initComponents();
        TampilanData();
    }
    private void CariData(String Key){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Suplier");
        model.addColumn("Nama Suplier");
        model.addColumn("Alamat");        
        model.addColumn("No Telfon");
        model.addColumn("Keterangan");
        
        
        String sql="SELECT * FROM suplier WHERE namaSuplier LIKE '%"+Key+"%'";
        System.out.println(sql);
        
        try{
            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet rs = stm.executeQuery();
            while(rs.next()){
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5)});
                
            }
            jtable1.setModel(model);            
        }catch(Exception e){
            e.getMessage();
        }
    
        
    }
    private void TampilanData(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Suplier");
        model.addColumn("Nama Suplier");
        model.addColumn("No Telfon");        
        model.addColumn("Alamat");
        model.addColumn("Keterangan");
        
        
        String sql="SELECT * FROM `suplier`";
        System.out.println(sql);
        
        try{
            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet rs = stm.executeQuery();
           
            while(rs.next()){
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5)});
                
                
            }
            jtable1.setModel(model);            
        }catch(Exception e){
            e.getMessage();
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        crBrg = new javax.swing.JTextField();
        btnTambah = new com.kelompoka3.swing.ButtonCustom();
        btnHapus = new com.kelompoka3.swing.ButtonCustom();
        btnEdit = new com.kelompoka3.swing.ButtonCustom();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
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
                "ID Suplier", "Nama Suplier", "No HP", "Alamat", "Keterangan"
            }
        ));
        jtable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable1);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kelompoka3/icons/Search.png"))); // NOI18N
        jLabel1.setText("Cari Barang");

        crBrg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                crBrgKeyReleased(evt);
            }
        });

        btnTambah.setText("+ T A M B A H ");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
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

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kelompoka3/icons/Edit Square.png"))); // NOI18N
        btnEdit.setText("E D I T");
        btnEdit.setStyle(com.kelompoka3.swing.ButtonCustom.ButtonStyle.SECONDARY);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1015, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(crBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 197, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jtable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable1MouseClicked
        // TODO add your handling code here:

        /**  int baris = jtable1.rowAtPoint(evt.getPoint());
        if(jtable1.getValueAt(baris, 0)==null){
            idBrg.setText("");
        }else{
            idBrg.setText(jtable1.getValueAt(baris, 0).toString());
        }
        if(jtable1.getValueAt(baris, 1)==null){
            nmBrg.setText("");
        }else{
            nmBrg.setText(jtable1.getValueAt(baris, 1).toString());
        }
        if(jtable1.getValueAt(baris, 2)==null){
            jnsBrg.setText("");
        }else{
            jnsBrg.setText(jtable1.getValueAt(baris, 2).toString());
        }
        if(jtable1.getValueAt(baris, 3)==null){
            wrnBrg.setText("");
        }else{
            wrnBrg.setText(jtable1.getValueAt(baris, 3).toString());
        }
        if(jtable1.getValueAt(baris, 4)==null){
            hrgJual.setText("");
        }else{
            hrgJual.setText(jtable1.getValueAt(baris, 4).toString());
        }
        if(jtable1.getValueAt(baris, 5)==null){
            hrgBrgBeli.setText("");
        }else{
            hrgBrgBeli.setText(jtable1.getValueAt(baris, 5).toString());
        }if(jtable1.getValueAt(baris, 6)==null){
            stokBrg.setText("");
        }else{
            stokBrg.setText(jtable1.getValueAt(baris, 6).toString());
        } **/
    }//GEN-LAST:event_jtable1MouseClicked

    private void crBrgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_crBrgKeyReleased
        String key=crBrg.getText();

        if(key!=""){
            CariData(key);
        }else{
            TampilanData();
        }
    }//GEN-LAST:event_crBrgKeyReleased

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
         new PopUpTambahSuplier().setVisible(true);
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        new PopUpEditSuplier().setVisible(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        new PopUpHapusSuplier().setVisible(true);
    }//GEN-LAST:event_btnHapusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.kelompoka3.swing.ButtonCustom btnEdit;
    private com.kelompoka3.swing.ButtonCustom btnHapus;
    private com.kelompoka3.swing.ButtonCustom btnTambah;
    private javax.swing.JTextField crBrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtable1;
    // End of variables declaration//GEN-END:variables
}