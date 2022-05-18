package com.kelompoka3.model;

public class ModelUser {

    public ModelUser(String username, String password, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public ModelUser(int userId, String namaLengkap, String email, String username, String password, String alamat, String verifyCode) {
        this.userId = userId;
        this.namaLengkap = namaLengkap;
        this.email = email;
        this.username = username;
        this.password = password;
        this.alamat = alamat;
        this.verifyCode = verifyCode;
    }

    public ModelUser(int userId, String namaLengkap, String email, String username, String password, String alamat) {
        this.userId = userId;
        this.namaLengkap = namaLengkap;
        this.email = email;
        this.username = username;
        this.password = password;
        this.alamat = alamat;
    }

    public ModelUser() {
    }

    private int userId;
    private String namaLengkap;
    private String email;
    private String username;
    private String password;
    private String alamat;
    private String verifyCode;

   
}
