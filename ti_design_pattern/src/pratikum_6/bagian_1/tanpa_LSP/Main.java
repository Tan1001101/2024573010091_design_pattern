package pratikum_6.bagian_1.tanpa_LSP;

public class Main {
    public static void testRectangle(Rectangle r) {
        r.setWidth(5);
        r.setHeight(4);
        System.out.println("hasil yang diharapkan: 20, hasil output: " + r.calculatedArea());
    }
    public static void main(String[] args){
        Rectangle rect = new Rectangle();
        testRectangle(rect);

        Rectangle square = new Square();
        testRectangle(square);
    }
}
