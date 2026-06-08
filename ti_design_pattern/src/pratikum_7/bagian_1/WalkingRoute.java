package pratikum_7.bagian_1;

public class WalkingRoute implements RouteStrategy{
    public void buildRoute(String from, String to){
        System.out.println("membuat rute jalan kaki dari " + from + " ke " + to);
    }
}
