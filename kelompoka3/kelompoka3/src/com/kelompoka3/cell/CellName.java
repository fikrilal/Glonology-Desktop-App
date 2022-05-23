package com.kelompoka3.cell;

import com.kelompoka3.model.ModelBarang;
import com.kelompoka3.model.ModelidBarang;
import com.raven.table.TableCustom;
import com.raven.table.cell.TableCustomCell;
import com.raven.table.model.TableRowData;
import java.awt.Component;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileFilter;

public class CellName extends TableCustomCell {
    
    private String pathGambar;
    
    public CellName() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popup = new javax.swing.JPopupMenu();
        deleteImage = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        gambar = new com.kelompoka3.swing.BingkaiGambar();
        txt_idBarang = new com.kelompoka3.swing.MyTextFieldTable();

        deleteImage.setText("Hapus Image");
        deleteImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteImageActionPerformed(evt);
            }
        });
        popup.add(deleteImage);

        setBackground(new java.awt.Color(242, 242, 242));
        setMaximumSize(new java.awt.Dimension(180, 190));
        setPreferredSize(new java.awt.Dimension(180, 190));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(128, 128, 128));
        jLabel1.setText("Klik gambar untuk mengganti");

        gambar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gambarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                gambarMousePressed(evt);
            }
        });

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

    private void gambarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gambarMouseClicked
        if (SwingUtilities.isLeftMouseButton(evt) && evt.getClickCount() == 1) {
            JFileChooser ch = new JFileChooser();
            ch.setFileFilter(new FileFilter() {
                @Override
                public boolean accept(File file) {
                    String name = file.getName().toLowerCase();
                    return file.isDirectory() || name.endsWith(".png") || name.endsWith(".jpg") || name.endsWith(".jpeg");
                }
                
                @Override
                public String getDescription() {
                    return "Image File";
                }
            });
            int opt = ch.showOpenDialog(this);
            if (opt == JFileChooser.APPROVE_OPTION) {
                pathGambar = ch.getSelectedFile().getAbsolutePath();
                gambar.setImage(new ImageIcon(pathGambar));
            }
        }
    }//GEN-LAST:event_gambarMouseClicked

    private void deleteImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteImageActionPerformed
        pathGambar="";
        gambar.setImage(null);
    }//GEN-LAST:event_deleteImageActionPerformed

    private void gambarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gambarMousePressed
        if(SwingUtilities.isRightMouseButton(evt)) {
            popup.show(gambar, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_gambarMousePressed
    
    @Override
    public void setData(Object o) {
        if (o != null) {
            ModelidBarang d = (ModelidBarang) o;
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
    private javax.swing.JMenuItem deleteImage;
    private com.kelompoka3.swing.BingkaiGambar gambar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu popup;
    private com.kelompoka3.swing.MyTextFieldTable txt_idBarang;
    // End of variables declaration//GEN-END:variables
}
