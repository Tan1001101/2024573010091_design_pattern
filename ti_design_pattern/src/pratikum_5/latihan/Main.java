package pratikum_5.latihan;

public class Main {
    public static void main(String[] args){
        TaxCalculator calculator = new TaxCalculator();

        TaxStrategy car = new CarTax();
        TaxStrategy motorcycle = new MotorcyleTax();
        TaxStrategy truck = new TruckTax();

        System.out.println("Car tax price: " + calculator.calculateTax(car,100));
        System.out.println("Motorcycle tax price: " + calculator.calculateTax(motorcycle,100));
        System.out.println("Truck tax price: " + calculator.calculateTax(truck,100));
    }
}
