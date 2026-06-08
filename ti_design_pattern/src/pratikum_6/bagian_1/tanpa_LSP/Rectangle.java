package pratikum_6.bagian_1.tanpa_LSP;

public class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width){
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int calculatedArea(){
        return width * height;
    }
}
