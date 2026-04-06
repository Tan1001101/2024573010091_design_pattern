package pratikum_3.bagian_6;

public class TiketReguler extends Tiket{
    public TiketReguler(){
        super("Reguler",100000);
    }

    @Override
    public double hitungDiskon(){
        return 0;
    }
}
