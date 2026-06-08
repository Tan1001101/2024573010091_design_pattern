package pratikum_7.latihan;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Membayar Rp " + amount + " menggunakan Kartu Kredit.");
    }
}
