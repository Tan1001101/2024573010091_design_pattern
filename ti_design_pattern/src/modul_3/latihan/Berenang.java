package modul_3.latihan;

interface Berenang {
    void berenang();
}

abstract class HewanAir{
    String nama;

    abstract void makan();
}

class Ikan extends HewanAir implements Berenang{
    @Override
    void makan() {
        System.out.println(nama + " sedang makan");
    }

    @Override
    public void berenang(){
        System.out.println(nama + " sedang berenang");
    }
}

class main{
    public static void main(String[] args){
        Ikan ikan = new Ikan();
        ikan.nama = "Tongkol";
        ikan.makan();
        ikan.berenang();
    }
}
