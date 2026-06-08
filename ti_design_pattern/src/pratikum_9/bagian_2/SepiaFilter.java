package pratikum_9.bagian_2;

public class SepiaFilter implements FilterStrategy {
    @Override
    public void applyFilter(String fileName) {
        System.out.println("Menerapkan filter Sepia pada gambar: " + fileName);
    }
}