package com.kelompoka3.cell;

import com.kelompoka3.model.ModelBarang;
import com.kelompoka3.model.ModelidBarang;
import com.raven.table.TableCustom;
import com.raven.table.cell.TableCustomCell;
import com.raven.table.model.TableRowData;
import java.awt.Component;

public class CellName extends TableCustomCell {
    
    private String pathGambar;

    public CellName() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        gambar = new com.kelompoka3.swing.BingkaiGambar();
        txt_idBarang = new com.kelompoka3.swing.MyTextFieldTable();

        setBackground(new java.awt.Color(242, 242, 242));
        setMaximumSize(new java.awt.Dimension(180, 190));
        setPreferredSize(new java.awt.Dimension(180, 190));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(128, 128, 128));
        jLabel1.setText("Klik gambar untuk mengganti");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(gambar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addComponent(txt_idBarang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(txt_idBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(gambar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void setData(Object o) {
        if(o != null) {
            ModelidBarang d = (ModelidBarang)o;
            txt_idBarang.setText(d.getIdBarang());
            gambar.setImage(d.getGambar());
            pathGambar = d.getPath();
        }
    }

    @Override
    public Object getData() {
        String idBarang = txt_idBarang.getText().trim();
        return new ModelidBarang(idBarang, gambar.getImage(), pathGambar);
    }

    @Override
    public Component createComponentCellRender(TableCustom table, TableRowData data, int row, int column) {
        ModelBarang barang = (ModelBarang) data;
        return new CellidBarangRender(barang.getIdBarang());
    }

    
    
    @Override
    public TableCustomCell createComponentCellEditor(TableCustom tc, TableRowData trd, Object o, int i, int i1) {
        CellName cell = new CellName();
        cell.setData(o);
        return cell;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.kelompoka3.swing.BingkaiGambar gambar;
    private javax.swing.JLabel jLabel1;
    private com.kelompoka3.swing.MyTextFieldTable txt_idBarang;
    // End of variables declaration//GEN-END:variables
}
