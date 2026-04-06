package pratikum_2.bagian_5;

public class Person {
    private String nama;
    private int umur;

    public Person(){
        nama = "uknown";
        umur = 0;
    }

    public Person(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    public void tampilkanInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}
