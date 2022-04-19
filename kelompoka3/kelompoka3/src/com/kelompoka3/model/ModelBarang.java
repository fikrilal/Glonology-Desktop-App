package com.kelompoka3.model;

import java.awt.Image;

class ModelBarang {

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Image getCpu1() {
        return cpu1;
    }

    public void setCpu1(Image cpu1) {
        this.cpu1 = cpu1;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ModelBarang(String namaBarang, String jenisBarang, String idBarang, String warna, int harga, Image cpu1, String path) {
        this.namaBarang = namaBarang;
        this.jenisBarang = jenisBarang;
        this.idBarang = idBarang;
        this.warna = warna;
        this.harga = harga;
        this.cpu1 = cpu1;
        this.path = path;
    }
    
    

    public ModelBarang() {
    }
    
    
    private String namaBarang;
    private String jenisBarang;
    private String idBarang;
    private String warna;
    private int harga;
    private Image cpu1;
    private String path;
}
