package pratikum_5.latihan;

public class TruckTax implements TaxStrategy{
    @Override
    public double applyTax(double price) {
        return price * 0.15;
    }
}
