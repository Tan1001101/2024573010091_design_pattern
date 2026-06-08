package pratikum_9.bagian_1;

public class Navigator {
    private RouteStrategy strategy;

    public Navigator() {}

    public void setStrategy(RouteStrategy strategy){
        this.strategy = strategy;
    }

    public void navigate(String from, String to){
        strategy.buildRoute(from,to);
    }
}
