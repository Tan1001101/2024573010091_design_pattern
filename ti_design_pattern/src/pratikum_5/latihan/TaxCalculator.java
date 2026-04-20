package pratikum_5.latihan;

public class TaxCalculator {
    public double calculateTax(TaxStrategy taxType, double price){
        return taxType.applyTax(price);
    }
}
