package com.kelompoka3.model;

public class ModelUser {

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ModelUser(String nama, String username, String password, String alamat, String verifyCode, String status) {
        this.nama = nama;
        this.username = username;
        this.password = password;
        this.alamat = alamat;
        this.verifyCode = verifyCode;
        this.status = status;
    }

    public ModelUser() {
    }
    
    private String nama;
    private String username;
    private String password;
    private String alamat;
    private String verifyCode;
    private String status;
}
