package pratikum_9.bagian_1;

public class Main {
    public static void main(String[] args){
        Navigator nav = new Navigator();

        nav.setStrategy(new WalkingRoute());
        nav.navigate("kampus","kos");

        nav.setStrategy(new DrivingRoute());
        nav.navigate("kampus","mall");

        nav.setStrategy(new PublicTransportRoute());
        nav.navigate("kampus","stasiun");
    }
}
