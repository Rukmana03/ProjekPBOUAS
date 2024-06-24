package Barang;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private String url, usr, pwd, db;

    public ConnectionDB(){
        db = "toko";
        url = "jdbc:mysql://localhost/" + db;
        usr = "root";
        pwd = "";
    }
    
    public Connection getConnect(){
        Connection cn = null;
        try {
            // Memuat driver database
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Membuat koneksi ke database
            cn = DriverManager.getConnection(url, usr, pwd);
            System.out.println("Koneksi Berhasil");
        } catch (ClassNotFoundException er) {
            System.out.println("Error #1: Driver tidak ditemukan - " + er.getMessage());
        } catch (SQLException er) {
            System.out.println("Error #2: Kesalahan SQL - " + er.getMessage());
        }
        return cn;
    }

    public static void main(String[] args) {
        ConnectionDB dbConnection = new ConnectionDB();
        Connection cn = dbConnection.getConnect();
        
        if (cn != null) {
            try {
                // Tempatkan logika yang memerlukan koneksi di sini
            } finally {
                try {
                    cn.close();
                    System.out.println("Koneksi ditutup");
                } catch (SQLException er) {
                    System.out.println("Error saat menutup koneksi - " + er.getMessage());
                }
            }
        }
    }
}


