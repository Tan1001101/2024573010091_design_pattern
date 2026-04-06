package pratikum_3.bagian_5.abstrak;

abstract class Hewan {
    String nama;

    void makan(){
        System.out.println(nama + " sedang makan");
    }

    abstract void bersuara();
}
