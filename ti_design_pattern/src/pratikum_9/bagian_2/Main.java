package pratikum_9.bagian_2;

public class Main {
    public static void main(String[] args) {
        PhotoEditor editor = new PhotoEditor(new BlackWhiteFilter());
        editor.applyFilter("pemandangan.jpg");

        editor.setFilterStrategy(new SepiaFilter());
        editor.applyFilter("foto_keluarga.png");

        editor.setFilterStrategy(new BrightFilter());
        editor.applyFilter("selfie.jpg");
    }
}
