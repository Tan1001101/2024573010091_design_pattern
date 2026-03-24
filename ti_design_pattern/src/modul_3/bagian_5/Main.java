package modul_3.bagian_5;

interface Terbang{
    void    terbang();
}

abstract class Hewan{
    String nama;

    abstract void bersuara();
}

class Burung extends Hewan implements Terbang{
    @Override
    void bersuara(){
        System.out.println("kicau kicau");
    }

    @Override
    public void terbang(){
        System.out.println(nama + "sedang terbang");
    }
}

public class Main {
    public static void main(String[] args){
        Burung burung = new Burung();
        burung.nama = "merpati";
        burung.bersuara();
        burung.terbang();
    }
}
