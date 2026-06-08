package pratikum_9.bagian_2;

public class BrightFilter implements FilterStrategy {
    @Override
    public void applyFilter(String fileName) {
        System.out.println("Menerapkan filter Cerah (Brightness) pada gambar: " + fileName);
    }
}
