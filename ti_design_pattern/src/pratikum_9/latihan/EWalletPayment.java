package pratikum_9.latihan;

public class EWalletPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Membayar Rp " + amount + " menggunakan E-Wallet.");
    }
}
