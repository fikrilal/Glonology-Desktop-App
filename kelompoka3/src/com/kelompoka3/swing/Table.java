package com.kelompoka3.swing;

import com.raven.table.TableCustom;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Table extends TableCustom {
    
    public Table() {     
    }
    
    public void addTableStyle(JScrollPane scroll) {
        scroll.getViewport().setOpaque(false);
        scroll.setViewportBorder(null);
        setBorder(null);
        scroll.setBorder(null);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//        scroll.setVerticalScrollBar(new ScrollBarCustom());
    }

}