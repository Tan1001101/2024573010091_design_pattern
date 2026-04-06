package pratikum_2.latihan.latihan_5;

public class Barang {
    String namaBarang;
    int harga;

    public Barang(){
        namaBarang = "barang";
        harga = 0;
    }

    public Barang(String namaBarang, int harga){
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    public void tampilkanInfo(){
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga: " + harga);
    }
}
