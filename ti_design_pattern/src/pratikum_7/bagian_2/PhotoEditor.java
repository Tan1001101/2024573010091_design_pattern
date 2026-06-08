package pratikum_7.bagian_2;

public class PhotoEditor {
    private FilterStrategy filterStrategy;

    public PhotoEditor(FilterStrategy filterStrategy) {
        this.filterStrategy = filterStrategy;
    }

    public void setFilterStrategy(FilterStrategy filterStrategy) {
        this.filterStrategy = filterStrategy;
    }

    public void applyFilter(String fileName) {
        filterStrategy.applyFilter(fileName);
    }
}
