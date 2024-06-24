package Barang;

public class Barang {
    private String kodeBarang; // kode_barang CHAR(4)
    private String namaBarang; // nama_barang VARCHAR(25)
    private int hargaBarang;   // harga_barang INT(4)
    private int stokBarang;    // stok_barang INT(4)

    // Getter dan Setter untuk kodeBarang
    public String getKodeBarang() {
        return kodeBarang;
    }
    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    // Getter dan Setter untuk namaBarang
    public String getNamaBarang() {
        return namaBarang;
    }
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    // Getter dan Setter untuk hargaBarang
    public int getHargaBarang() {
        return hargaBarang;
    }
    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    // Getter dan Setter untuk stokBarang
    public int getStokBarang() {
        return stokBarang;
    }
    public void setStokBarang(int stokBarang) {
        this.stokBarang = stokBarang;
    }
}