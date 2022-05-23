package com.kelompoka3.koneksi;

import com.kelompoka3.model.ModelBarang;
import com.mysql.jdbc.PreparedStatement;
import com.onbarcode.barcode.EAN13;
import com.onbarcode.barcode.IBarcode;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceBarang {
    
    public void encodeBarcode(ModelBarang data) throws Exception {

        EAN13 objEan = new EAN13();
        objEan.setData(data.getIdBarang().getIdBarang());
        objEan.setUom(IBarcode.UOM_PIXEL);
        objEan.setX(3f);
        objEan.setY(175f);

        objEan.setLeftMargin(0f);
        objEan.setRightMargin(0f);
        objEan.setTopMargin(0f);
        objEan.setBottomMargin(0f);
        objEan.setResolution(72);
        objEan.setShowText(true);
        objEan.setTextMargin(6);
        objEan.setRotate(IBarcode.ROTATE_0);
        objEan.drawBarcode("C://drivers//" + data.getNamaBarang() + ".png");
    }

    public void setUkuranBarCode(EAN13 mBarcode, float panjangBarcode, float tinggiBarcode) {
        mBarcode.setX(panjangBarcode);
        mBarcode.setY(tinggiBarcode);
    }

    public void insertBarang(ModelBarang data) throws SQLException, IOException {
        String barcode = "C://drivers//" + data.getNamaBarang() + ".png";
        
        String sql = "INSERT INTO barang(idBarang, image, namaBarang, jenis, warna, hargaJual, hargaBeli, stok, Barcode) VAlUES"
                + "(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement p = (PreparedStatement) DatabaseConnection.getInstance().getConnection().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        p.setString(1, data.getIdBarang().getIdBarang());
        p.setString(2, data.getImage());
        p.setString(3, data.getNamaBarang());
        p.setString(4, data.getJenis());
        p.setString(5, data.getWarna());
        p.setInt(6, data.getHargaJual());
        p.setInt(7, data.getHargaBeli());
        p.setInt(8, data.getStok());
        p.setString(9, barcode);
        p.execute();
        System.out.println(sql);
        ResultSet r = p.getGeneratedKeys();
        r.close();
        p.close();
        
    }
}
