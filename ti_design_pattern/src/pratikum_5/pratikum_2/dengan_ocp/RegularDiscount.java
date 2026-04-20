package pratikum_5.pratikum_2.dengan_ocp;

public class RegularDiscount implements Discount{
    @Override
    public double applyDiscount(double price){
        return price * 0.1;
    }

}
