package pratikum_7.bagian_1;

public class PublicTransportRoute implements RouteStrategy{
    public void buildRoute(String from, String to){
        System.out.println("membuat rute transpotasi umum dari " + from + " ke " + to);
    }
}
