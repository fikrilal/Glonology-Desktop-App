package com.kelompoka3.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.table.DefaultTableCellRenderer;

public class TableHeaderCustom extends DefaultTableCellRenderer {

    public TableHeaderCustom() {
        setPreferredSize(new Dimension(0, 32));
        setBackground(new Color(255, 255, 255));
        setForeground(new Color(60, 60, 60));
    }

    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs);
        grphcs.setColor(new Color(189, 189, 189));
        grphcs.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
    }

}
