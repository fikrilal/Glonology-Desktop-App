package com.kelompoka3.form;

import com.kelompoka3.cell.CellAction;
import com.kelompoka3.cell.CellHargaBeli;
import com.kelompoka3.cell.CellHargaJual;
import com.kelompoka3.cell.CellJenis;
import com.kelompoka3.cell.CellNamaBarang;
import com.kelompoka3.cell.CellName;
import com.kelompoka3.cell.CellStok;
import com.kelompoka3.cell.CellWarna;
import com.kelompoka3.model.ModelBarang;
import com.kelompoka3.model.ModelidBarang;
import javax.swing.ImageIcon;

public class formLogout extends javax.swing.JPanel {

    public formLogout() {
        setOpaque(false);
        initComponents();
        initDataTable();
        table1.addTableStyle(jScrollPane2);
    }

    private void initDataTable() {
        table1.addTableCell(new CellName(), 0);
        table1.addTableCell(new CellNamaBarang(), 1);
        table1.addTableCell(new CellJenis(), 2);
        table1.addTableCell(new CellWarna(), 3);
        table1.addTableCell(new CellHargaJual(), 4);
        table1.addTableCell(new CellHargaBeli(), 5);
        table1.addTableCell(new CellStok(), 6);
        table1.addTableCell(new CellAction(), 8);
table1.addRow(new ModelBarang(new ModelidBarang("123456789", new ImageIcon(getClass().getResource("/com/kelompoka3/image/cpu1.jpg")), ""), "Asus Zenbook 14X", "Laptop", "Biru", "",20000000, 20000000, 12, null), false);
        table1.addRow(new ModelBarang(new ModelidBarang("12345", new ImageIcon(getClass().getResource("/com/kelompoka3/image/cpu1.jpg")), ""), "Asus Zenbook 14X", "Laptop", "Biru", "",20000000, 20000000, 12, null), false);
        table1.addRow(new ModelBarang(new ModelidBarang("123456789", new ImageIcon(getClass().getResource("/com/kelompoka3/image/cpu1.jpg")), ""), "Asus Zenbook 14X", "Laptop", "Biru", "",20000000, 20000000, 12, null), false);
        table1.addRow(new ModelBarang(new ModelidBarang("12345", new ImageIcon(getClass().getResource("/com/kelompoka3/image/cpu1.jpg")), ""), "Asus Zenbook 14X", "Laptop", "Biru", "",10000, 10000, 12, null), false);
        table1.addRow(new ModelBarang(new ModelidBarang("123456789", new ImageIcon(getClass().getResource("/com/kelompoka3/image/cpu1.jpg")), ""), "Asus Zenbook 14X", "Laptop", "Biru", "",10000, 10000, 12, null), false);
        table1.addRow(new ModelBarang(new ModelidBarang("12345", new ImageIcon(getClass().getResource("/com/kelompoka3/image/cpu1.jpg")), ""), "Asus Zenbook 14X", "Laptop", "Biru", "",10000, 10000, 12, null), false);
        table1.addRow(new ModelBarang(new ModelidBarang("123456789", new ImageIcon(getClass().getResource("/com/kelompoka3/image/cpu1.jpg")), ""), "Asus Zenbook 14X", "Laptop", "Biru", "",10000, 10000, 12, null), false);
        table1.addRow(new ModelBarang(new ModelidBarang("12345", new ImageIcon(getClass().getResource("/com/kelompoka3/image/cpu1.jpg")), ""), "Asus Zenbook 14X", "Laptop", "Biru", "",10000, 10000, 12, null), false);
        table1.addRow(new ModelBarang(new ModelidBarang("123456789", new ImageIcon(getClass().getResource("/com/kelompoka3/image/cpu1.jpg")), ""), "Asus Zenbook 14X", "Laptop", "Biru", "",10000, 10000, 12, null), false);
        table1.addRow(new ModelBarang(new ModelidBarang("12345", new ImageIcon(getClass().getResource("/com/kelompoka3/image/cpu1.jpg")), ""), "Asus Zenbook 14X", "Laptop", "Biru", "",10000, 10000, 12, null), false);
//        table1.editRowAt(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonTambah = new com.kelompoka3.swing.ButtonCustom();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new com.kelompoka3.swing.TableBarang();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        buttonTambah.setText("Tambah Barang");
        buttonTambah.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Barang", "Nama", "Jenis", "Warna", "Harga Jual", "Harga Beli", "Stok", "Barcode", "Action"
            }
        ));
        table1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setPreferredWidth(180);
            table1.getColumnModel().getColumn(0).setMaxWidth(180);
            table1.getColumnModel().getColumn(1).setPreferredWidth(80);
            table1.getColumnModel().getColumn(2).setPreferredWidth(100);
            table1.getColumnModel().getColumn(2).setMaxWidth(100);
            table1.getColumnModel().getColumn(3).setPreferredWidth(80);
            table1.getColumnModel().getColumn(3).setMaxWidth(80);
            table1.getColumnModel().getColumn(4).setPreferredWidth(100);
            table1.getColumnModel().getColumn(4).setMaxWidth(100);
            table1.getColumnModel().getColumn(5).setPreferredWidth(100);
            table1.getColumnModel().getColumn(5).setMaxWidth(100);
            table1.getColumnModel().getColumn(6).setPreferredWidth(60);
            table1.getColumnModel().getColumn(6).setMaxWidth(60);
            table1.getColumnModel().getColumn(7).setPreferredWidth(40);
            table1.getColumnModel().getColumn(8).setPreferredWidth(100);
            table1.getColumnModel().getColumn(8).setMaxWidth(100);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(304, 304, 304))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1097, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(buttonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        table1.insertRowWithEdit(new ModelBarang(new ModelidBarang("", null, ""), "", "", "", "", 0, 0, 0, null), 0, true);
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void myTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.kelompoka3.swing.ButtonCustom buttonTambah;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.kelompoka3.swing.TableBarang table1;
    // End of variables declaration//GEN-END:variables
}
