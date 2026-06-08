package pratikum_9.latihan;

public class Main {
    public static void main(String[] args) {
        Checkout checkout = new Checkout(new CreditCardPayment());
        checkout.processPayment(500000);

        checkout.setPaymentStrategy(new EWalletPayment());
        checkout.processPayment(150000);

        checkout.setPaymentStrategy(new BankTransferPayment());
        checkout.processPayment(300000);
    }
}
