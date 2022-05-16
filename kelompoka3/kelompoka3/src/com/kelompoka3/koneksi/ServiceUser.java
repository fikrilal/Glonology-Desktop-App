package com.kelompoka3.koneksi;

import com.kelompoka3.model.ModelUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Random;

public class ServiceUser {

    private final Connection con;

    public ServiceUser() {
        con = DatabaseConnection.getInstance().getConnection();
    }

    public void insertUser(ModelUser user) throws SQLException {
        PreparedStatement p = con.prepareStatement("INSERT INTO `pegawai` "
                + "(`namaLengkap`, `email`, `username`, `password`, `alamat`, `verifyCode`) "
                + "VALUES ('?', '?', '?', '?', '?', '?')", PreparedStatement.RETURN_GENERATED_KEYS);
        String code = generateVerifyCode();
        p.setString(1, user.getNamaLengkap());
        p.setString(2, user.getEmail());
        p.setString(3, user.getUsername());
        p.setString(4, user.getPassword());
        p.setString(5, user.getAlamat());
        p.setString(6, code);
        p.execute();
        ResultSet r = p.getGeneratedKeys();
        r.first();
        int userId = r.getInt(1);
        r.close();
        p.close();
        user.setUserId(userId);
        user.setVerifyCode(code);
    }

    private String generateVerifyCode() throws SQLException {
        DecimalFormat df = new DecimalFormat("000000");
        Random ran = new Random();
        String code = df.format(ran.nextInt(1000000)); //untuk generate code verifikasi secara random
        while (checkDuplicateCode(code)) {
            code = df.format(ran.nextInt(1000000));
        }
        return code;
    }

    private boolean checkDuplicateCode(String code) throws SQLException {
        boolean duplicate = false;
        PreparedStatement p = con.prepareStatement("SELECT userId FROM pegawai "
                + "WHERE verifyCode=? limit 1");
        p.setString(1, code);
        ResultSet r = p.executeQuery();
        if (r.first()) {
            duplicate = true;
        }
        r.close();
        p.close();
        return duplicate;
    }

    public boolean checkDuplicateUser(String user) throws SQLException {
        boolean duplicate = false;
        PreparedStatement p = con.prepareStatement("SELECT userId FROM pegawai"
                + "WHERE username=? and status = Verified LIMIT 1");
        p.setString(1, user);
        ResultSet r = p.executeQuery();
        if (r.first()) {
            duplicate = true;
        }
        r.close();
        p.close();
        return duplicate;
    }

    public boolean checkDuplicateEmail(String user) throws SQLException {
        boolean duplicate = false;
        PreparedStatement p = con.prepareStatement("SELECT userId FROM pegawai"
                + "WHERE email=? and status = Verified LIMIT 1");
        p.setString(1, user);
        ResultSet r = p.executeQuery();
        if (r.first()) {
            duplicate = true;
        }
        r.close();
        p.close();
        return duplicate;
    }

    public void succesVerify(int userId) throws SQLException {
        PreparedStatement p = con.prepareStatement("UPDATE pegawai SET verifyCode='',"
                + "status='Verified' WHERE userId=? LIMIT 1");
        p.setInt(1, userId);
        p.execute();
        p.close();
    }

    public boolean verifyCodeWithUser(int userId, String code) throws SQLException {
        boolean verify = false;
        PreparedStatement p = con.prepareStatement("SELECT userId FROM pegawai WHERE"
                + "userId=? LIMIT 1");
        p.setInt(1, userId);
        p.setString(2, code);
        ResultSet r = p.executeQuery();
        if (r.first()) {
            verify = true;
        }
        r.close();
        p.close();
        return verify;
    }
}
