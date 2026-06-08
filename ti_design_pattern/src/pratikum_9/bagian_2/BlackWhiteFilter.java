package pratikum_9.bagian_2;

public class BlackWhiteFilter implements FilterStrategy {
    @Override
    public void applyFilter(String fileName) {
        System.out.println("Menerapkan filter Hitam-Putih pada gambar: " + fileName);
    }
}
