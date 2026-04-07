package pratikum_2.latihan.latihan_1;

public class Buku {
    String judul;
    String pengarang;
}

class main1{
    public static void main(String[] args){
        Buku buku1 = new Buku();
        buku1.judul = "Jokowi sang tukang kayu";
        buku1.pengarang = "Mulyani";

        System.out.println("judul: " + buku1.judul);
        System.out.println("pengarang: " + buku1.pengarang);
    }
}
