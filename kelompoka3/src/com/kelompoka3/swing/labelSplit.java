package com.kelompoka3.swing;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

public class labelSplit extends JLabel {
    private boolean gradient;

    @Override
    public void paint(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D)grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.3f));
        
        super.paint(grphcs);
    }
    
    
}
