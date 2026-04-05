package modul_3.latihan;

public class Buku {
    String judul;
    String penulis;
    int tahunTerbit;

    void displayInfo(){
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
}

class Utama{
    public static void main(String[] args){
        Buku buku1 = new Buku();

        buku1.judul = "Cara Membudidayakan Lele";
        buku1.penulis = "Ahmad Royanto";
        buku1.tahunTerbit = 2019;

        buku1.displayInfo();
    }
}
