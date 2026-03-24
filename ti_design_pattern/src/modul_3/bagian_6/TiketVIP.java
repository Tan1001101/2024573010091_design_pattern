package modul_3.bagian_6;

public class TiketVIP extends Tiket{
    public TiketVIP(){
        super("VIP", 250000);
    }

    @Override
    public double hitungDiskon(){
        return 0.1 * getHarga(); // 0.1 berarti diskon 10%
    }
}
