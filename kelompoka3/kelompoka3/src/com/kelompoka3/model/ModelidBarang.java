package com.kelompoka3.model;

import javax.swing.Icon;

public class ModelidBarang {

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public Icon getGambar() {
        return gambar;
    }

    public void setGambar(Icon gambar) {
        this.gambar = gambar;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ModelidBarang(String idBarang, Icon gambar, String path) {
        this.idBarang = idBarang;
        this.gambar = gambar;
        this.path = path;
    }

    public ModelidBarang() {
    }
    
    private String idBarang;
    private Icon gambar;
    private String path;

    @Override
    public String toString() {
        return idBarang;
    }
    
}
