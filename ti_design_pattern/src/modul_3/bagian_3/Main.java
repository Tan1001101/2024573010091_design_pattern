package modul_3.bagian_3;

class Mesin {
    void hidupkan(){
        System.out.println("Mesin menyala");
    }

    void matikan(){
        System.out.println("Mesin dimatikan");
    }
}

class Kendaraan {
    void bergerak(){
        System.out.println("kendaraan sedang bergerak");
    }
}

class Mobil extends Kendaraan{
    private Mesin mesin;

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

public class Main {
    public static void main(String[] args){
        Mobil mobil = new Mobil();
        mobil.mulai();
        mobil.bergerak();
        mobil.berhenti();
    }
}
