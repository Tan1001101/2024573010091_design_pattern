package pratikum_6.Latihan;

public class Mobil implements Kendaraan{
    public void mulaiMesin(){
        System.out.println("mesin mobil menyala");
    }

    public void bergerak(String Destination){
        System.out.println("mobil bergerak ke" + Destination);
    }

}
