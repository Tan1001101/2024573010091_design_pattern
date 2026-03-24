package modul_3.latihan;

class Processor{
    void jalankan(){
        System.out.println("Processor dijalankan");
}
}

class Ram{
    void baca(){
        System.out.println("Ram sedang membaca");
    }

    void tulis(){
        System.out.println("Ram sedang menulis");
    }
}
public class Laptop {
    private Processor processor;
    private Ram ram;

    public Laptop(){
        this.processor = new Processor();
        this.ram = new Ram();
    }

    void mulai(){
        processor.jalankan();
        System.out.println("Laptop siap digunakan");
    }

    void membaca(){
        ram.baca();
        System.out.println("Laptop sedang membaca isi file");
    }

    void menulis(){
        ram.tulis();
        System.out.println("Laptop sedang menulis isi file");
    }
}

class Main_Laptop{
    public static void main(String[] args){
    Laptop laptop = new Laptop();
    laptop.mulai();
    laptop.membaca();
    laptop.menulis();
    }
}

