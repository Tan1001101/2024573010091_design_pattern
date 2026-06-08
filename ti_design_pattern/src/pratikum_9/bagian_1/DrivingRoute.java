package pratikum_9.bagian_1;

public class DrivingRoute implements RouteStrategy{
    public void buildRoute(String from, String to){
        System.out.println("membuat rute berkendara dari " + from + " ke " + to);
    }
}
