package pratikum_5.pratikum_1.dengan_ocp;

public class PaymentProcess {
    public void processPayment(PaymentMethod method,double amount){
        method.process(amount);
    }
}
