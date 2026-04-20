package pratikum_5.pratikum_1.dengan_ocp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter payment type (CreditCard/EWallet): ");
        String type = scanner.next();
        System.out.println("enter amount: ");
        double amount = scanner.nextDouble();

        PaymentProcess processor = new PaymentProcess();
        PaymentMethod paymentMethod;

        if(type.equalsIgnoreCase("CreditCard")){
            paymentMethod = new CreditPayment();
        }else if(type.equalsIgnoreCase("EWallet")){
            paymentMethod = new EWalletPayment();
        }else {
            System.out.println("invalid payment method");
            return;
        }

        processor.processPayment(paymentMethod,amount);
    }
}
