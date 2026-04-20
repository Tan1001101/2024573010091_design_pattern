package pratikum_5.latihan;

public class CarTax implements TaxStrategy{
    @Override
    public double applyTax(double price){
        return price * 0.1;
    }
}
