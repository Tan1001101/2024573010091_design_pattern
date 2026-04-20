package pratikum_5.pratikum_1.dengan_ocp;

public class CreditPayment implements PaymentMethod{
    public void process(double amount){
        System.out.println("processing Credit card payment of Rp " + (amount));
    }
}
