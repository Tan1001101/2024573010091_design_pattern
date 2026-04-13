package pratikum_4.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama produk: ");
        String product = scanner.nextLine();

        System.out.print("Masukkan jumlah: ");
        int quantity = scanner.nextInt();

        System.out.print("Masukkan harga satuan: ");
        double price = scanner.nextDouble();

        Order order = new Order(product, quantity, price);

        OrderCalculator calculator = new OrderCalculator();
        double total = calculator.calculateTotal(order);

        OrderRepository repository = new OrderRepository();
        repository.saveOrder(order, total);

        OrderPrinter printer = new OrderPrinter();
        printer.printReceipt(order, total);
    }
}
