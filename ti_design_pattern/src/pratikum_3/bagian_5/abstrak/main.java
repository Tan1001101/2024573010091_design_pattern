package pratikum_3.bagian_5.abstrak;

public class main {
    public static void main(String[] args){
        Hewan kucing = new Kucing();
        kucing.nama = "kitty";
        kucing.makan();
        kucing.bersuara();

        Hewan anjing = new Anjing();
        anjing.nama = "Doggy";
        anjing.makan();
        anjing.bersuara();

    }
}
