package com.kelompoka3.chart;

import java.awt.Color;

/**
 *
 * @author fikrimuzakky24
 */
public class ModelLabel {

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ModelLabel(String nama, Color color) {
        this.nama = nama;
        this.color = color;
    }

    public ModelLabel() {
    }
    
    private String nama;
    private Color color;
    
}
