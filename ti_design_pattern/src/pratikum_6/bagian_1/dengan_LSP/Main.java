package pratikum_6.bagian_1.dengan_LSP;

public class Main {
    public static void printArea(Shape shape){
        System.out.println("Luas: " + shape.calculatedArea());
    }

    public static void main(String[] args){
        Shape rectangle = new Rectagle(5,4);
        Shape square = new Square(4);

        printArea(rectangle);
        printArea(square);
    }
}
