package pratikum_2.bagian_3;

public class AkeskModifier {
    public int publicVar = 1;
    private int privateVar = 2;
    protected int protectedVar = 3;
    int defaultVar = 4;

    public void tampilkan(){
        System.out.println("public: " + publicVar);
        System.out.println("private: " + privateVar);
        System.out.println("protected: " + protectedVar);
        System.out.println("default: " + defaultVar);
    }
}
