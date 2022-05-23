package com.kelompoka3.swing;

import com.raven.table.TableCustom;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.TableCellRenderer;

public class TableBarang extends TableCustom {
    
    public TableBarang() {     
    }

    @Override
    public void setFont(Font font) {
        super.setFont(new Font("Tomaha", Font.PLAIN, 12));
    }
    
    public void addTableStyle(JScrollPane scroll) {
        
        scroll.getViewport().setOpaque(false);
        scroll.setViewportBorder(null);
        setBorder(null);
        scroll.setBorder(null);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        setForeground(new Color(130,130,130));
        setSelectionForeground(new Color(214, 214, 214));
        setSelectionBackground(new Color(242, 242, 242));
        getTableHeader().setDefaultRenderer(new TableHeaderCustom());
        setRowHeight(76);
        setShowHorizontalLines(true);
        setGridColor(new Color(189,189,189));
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, panel);
    } 
    
    @Override
    public Component prepareRenderer(TableCellRenderer tcr, int i, int i1) {
        Component com = super.prepareRenderer(tcr, i, i1);
        if (!isCellSelected(i, i1)) {
            com.setBackground(new Color(255, 255, 255));
        }
        return com;
    }
}