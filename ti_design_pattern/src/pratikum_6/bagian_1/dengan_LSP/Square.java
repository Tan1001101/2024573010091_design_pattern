package pratikum_6.bagian_1.dengan_LSP;

public class Square implements Shape{
    private int side;

    public Square(int side){
        this.side = side;
    }

    @Override
    public int calculatedArea() {
        return side * side;
    }
}
