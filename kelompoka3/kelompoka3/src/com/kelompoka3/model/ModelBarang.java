package com.kelompoka3.model;

import com.raven.table.model.TableRowData;

public class ModelBarang extends TableRowData {

    public ModelidBarang getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(ModelidBarang idBarang) {
        this.idBarang = idBarang;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(int hargaJual) {
        this.hargaJual = hargaJual;
    }

    public int getHargaBeli() {
        return hargaBeli;
    }

    public void setHargaBeli(int hargaBeli) {
        this.hargaBeli = hargaBeli;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public ModelBarang(ModelidBarang idBarang, String image, String namaBarang, String jenis, String warna, int hargaJual, int hargaBeli, int stok, String barcode) {
        this.idBarang = idBarang;
        this.image = image;
        this.namaBarang = namaBarang;
        this.jenis = jenis;
        this.warna = warna;
        this.hargaJual = hargaJual;
        this.hargaBeli = hargaBeli;
        this.stok = stok;
        this.barcode = barcode;
    }

    public ModelBarang() {
    }

    private ModelidBarang idBarang;
    private String image;
    private String namaBarang;
    private String jenis;
    private String warna;
    private int hargaJual;
    private int hargaBeli;
    private int stok;
    private String barcode;

    @Override
    public Object[] toTableRow() {
        return new Object[]{idBarang, namaBarang, jenis, warna, hargaJual, hargaBeli, stok, barcode};
    }

}
