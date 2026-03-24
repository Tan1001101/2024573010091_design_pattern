package modul_3.bagian_4.overloading;

public class Main {
    public static void main(String[] args){
        Kalkulator kalkulator = new Kalkulator();

        System.out.println("Hasil 1: " + kalkulator.tambah(5, 10));
        System.out.println("Hasil 2: " + kalkulator.tambah(5,10,15));
        System.out.println("Hasil 3: " + kalkulator.tambah(3.5,2.5));
    }
}
