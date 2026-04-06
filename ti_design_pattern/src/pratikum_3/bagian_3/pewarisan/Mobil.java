package pratikum_3.bagian_3.pewarisan;

public class Mobil extends Kendaraan {
    int jumlahPintu;


    void displayInfoMobil() {
        displayInfo();
        System.out.println("Jumlah pintu: " + jumlahPintu);
    }
}
