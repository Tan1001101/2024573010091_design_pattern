package pratikum_5.pratikum_2.dengan_ocp;

public class Main {
    public static void main(String[] args){
        DiscountCalculator calculator = new DiscountCalculator();

        Discount regular = new RegularDiscount();
        Discount premium = new PremiumDiscount();

        System.out.println("regular customer discount: " + calculator.calculatedDiskount(regular,100));
        System.out.println("premium customer discount: " + calculator.calculatedDiskount(premium,100));
    }
}
