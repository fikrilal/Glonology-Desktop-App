package com.kelompoka3.cell;

import com.kelompoka3.koneksi.ServiceBarang;
import com.kelompoka3.model.ModelBarang;
import com.kelompoka3.model.ModelidBarang;
import com.onbarcode.barcode.EAN13;
import com.onbarcode.barcode.IBarcode;
import com.raven.table.TableCustom;
import com.raven.table.cell.TableCustomCell;
import com.raven.table.model.TableRowData;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CellAction extends TableCustomCell {

    public CellAction() {
        initComponents();
    }

    private void addEvent(TableCustom table, TableRowData data, int row) {
        btn_edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (data.isEditing()) {
                    table.cancelEditRowAt(row);
                    btn_edit.setIcon(new ImageIcon(getClass().getResource("/com/kelompoka3/icons/ActEdit.png")));
//                    btn_simpan.setVisible(false);
                } else {
                    table.editRowAt(row);
                    btn_edit.setIcon(new ImageIcon(getClass().getResource("/com/kelompoka3/icons/ActClose.png")));
//                    btn_simpan.setVisible(true);
                }
            }
        });
        btn_delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                table.deleteRowAt(getRow(), true);
            }
        });
    }

    private void checkIcon(TableRowData data) {
        if (data.isEditing()) {
            btn_edit.setIcon(new ImageIcon(getClass().getResource("/com/kelompoka3/icons/ActClose.png")));
//            btn_simpan.setVisible(true);
        } else {
            btn_edit.setIcon(new ImageIcon(getClass().getResource("/com/kelompoka3/icons/ActEdit.png")));
//            btn_simpan.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_edit = new com.kelompoka3.swing.ButtonIcon();
        btn_delete = new com.kelompoka3.swing.ButtonIcon();
        btn_simpan = new com.kelompoka3.swing.ButtonCustom();

        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kelompoka3/icons/ActEdit.png"))); // NOI18N
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kelompoka3/icons/ActDelete.png"))); // NOI18N
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_simpan.setText("Simpan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 32, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btn_simpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 140, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_deleteActionPerformed

    public void addEventSave(TableCustom table) {
        btn_simpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                table.stopCellEditing();
                int row = getRow();
                ModelidBarang id = (ModelidBarang) table.getValueAt(row, 0);
                String namaBarang = table.getValueAt(row, 1).toString();
                String jenis = table.getValueAt(row, 2).toString();
                String warna = table.getValueAt(row, 3).toString();
                int hargaJual = Integer.valueOf(table.getValueAt(row, 4).toString());
                int hargaBeli = Integer.valueOf(table.getValueAt(row, 5).toString());
                int stok = Integer.valueOf(table.getValueAt(row, 6).toString());
                String barcode = "C://drivers//" + table.getValueAt(row, 1).toString() + ".png";
                ModelBarang barang = (ModelBarang) table.getModelData(row);
                ModelBarang data = new ModelBarang(barang.getIdBarang(), warna, namaBarang, jenis, warna, hargaJual, hargaBeli, stok, barcode);
//                String brd = "C://drivers//" + data.getNamaBarang() + ".png";
                try {
                    if (barang.getIdBarang() == null) {
                        new ServiceBarang().insertBarang(data);
                        data.getIdBarang().setPath("Image");
                        table.updateModelData(row, data);
                    } else {

                    }
                } catch (IOException | SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
    }

    @Override
    public void setData(Object o) {

    }

    @Override
    public Object getData() {
        return null;
    }

    @Override
    public Component createComponentCellRender(TableCustom table, TableRowData data, int row, int column) {
        CellAction cell = new CellAction();
        cell.checkIcon(data);
        cell.addEvent(table, data, row);
        return cell;
    }

    @Override
    public Component createComponentCellRenderOnEditor(TableCustom table, TableRowData data, int row, int column) {
        return null;
    }

    @Override
    public TableCustomCell createComponentCellEditor(TableCustom table, TableRowData data, Object o, int row, int column) {
        CellAction cell = new CellAction();
        cell.checkIcon(data);
        cell.addEvent(table, data, row);
        cell.addEventSave(table);
        return cell;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.kelompoka3.swing.ButtonIcon btn_delete;
    private com.kelompoka3.swing.ButtonIcon btn_edit;
    private com.kelompoka3.swing.ButtonCustom btn_simpan;
    // End of variables declaration//GEN-END:variables
public void encodeBarcode(ModelBarang data) throws Exception {
        
        EAN13 objEan = new EAN13();
        objEan.setData(data.getIdBarang().getIdBarang());
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
        objEan.drawBarcode("C://drivers//" + data.getNamaBarang() + ".png");
    }

    public void setUkuranBarCode(EAN13 mBarcode, float panjangBarcode, float tinggiBarcode) {
        mBarcode.setX(panjangBarcode);
        mBarcode.setY(tinggiBarcode);
    }
}
