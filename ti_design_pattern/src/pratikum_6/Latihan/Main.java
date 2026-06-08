package pratikum_6.Latihan;

public class Main {
    public static void beginTrip(Kendaraan kendaraan, String Destination){
        kendaraan.bergerak(Destination);
    }

    public static void main(String[] args){
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();

        System.out.println("perjalanan mobil:");
        beginTrip(mobil,"taman");

        System.out.println("perjalanan sepeda:");
        beginTrip(sepeda, "taman");
    }
}
