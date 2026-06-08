package pratikum_7.latihan;

public class BankTransferPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Membayar Rp " + amount + " menggunakan Transfer Bank.");
    }
}
