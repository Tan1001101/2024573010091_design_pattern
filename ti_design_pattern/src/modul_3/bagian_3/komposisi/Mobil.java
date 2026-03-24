package modul_3.bagian_3.komposisi;

public class Mobil {
    private final Mesin mesin;

    public Mobil(){
        this.mesin = new Mesin();
    }

    void mulai(){
        mesin.hidupkan();
        System.out.println("Mobil siap digunakan");
    }

    void berhenti(){
        mesin.matikan();
        System.out.println("Mobil berhenti");
    }
}
