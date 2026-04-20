package pratikum_5.pratikum_1.tanpa_ocp;

public class PaymentProcessor {
    public void processPayment(String paymentType,double amount){
        if(paymentType.equals("CreditCard")){
            System.out.println("processing credit card payment of Rp " + amount);
        }else if(paymentType.equals("EWallet")){
            System.out.println("processing E-Wallet payment of Rp " + amount);
        }else {
            System.out.println("Invalid payment method");
        }
    }
}
