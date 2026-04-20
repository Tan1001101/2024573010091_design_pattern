package pratikum_5.pratikum_2.tanpa_ocp;

public class DiskonCalculator {
    public double CalculateDiscount(String customerType,double price){
        if(customerType.equals("Reguler")){
            return price * 0.1;
        }else if(customerType.equals("Premium")){
            return price * 0.2;
        }else {
            return 0;
        }
    }
}
