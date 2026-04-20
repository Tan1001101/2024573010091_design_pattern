package pratikum_5.pratikum_2.dengan_ocp;

public class DiscountCalculator {
    public double calculatedDiskount(Discount discountStrategy, double price){
        return discountStrategy.applyDiscount(price);
    }
}
