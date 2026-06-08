package pratikum_6.bagian_1.dengan_LSP;

public class Rectagle implements Shape{
    private int width;
    private int height;

    public Rectagle(int width,int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public int calculatedArea() {
        return width * height;
    }
}
