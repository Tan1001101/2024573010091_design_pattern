package pratikum_6.bagian_1.tanpa_LSP;

public class Square extends Rectangle{
    @Override
    public void setWidth(int width){
        super.setWidth(width);
        super.setHeight(width);
    }

    public void setHeight(int height){
        super.setHeight(height);
        super.setWidth(height);
    }
}
