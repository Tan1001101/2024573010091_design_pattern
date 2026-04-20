package pratikum_5.pratikum_1.dengan_ocp;

public class EWalletPayment implements PaymentMethod{
    public void process(double amount){
        System.out.println("Processing E-Wallet payment of Rp " + amount);
    }
}
