package pratikum_5.pratikum_2.tanpa_ocp;

public class Main {
    public static void main(String[] args){
        DiskonCalculator calculator = new DiskonCalculator();
        System.out.println("regular customer discount: " + calculator.CalculateDiscount("Reguler",100));
        System.out.println("Premium customer discount: " + calculator.CalculateDiscount("Premium",100));
    }
}
