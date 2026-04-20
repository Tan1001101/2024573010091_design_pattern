package pratikum_5.latihan;

public class MotorcyleTax implements TaxStrategy{
    @Override
    public double applyTax(double price) {
        return price * 0.05;
    }
}
