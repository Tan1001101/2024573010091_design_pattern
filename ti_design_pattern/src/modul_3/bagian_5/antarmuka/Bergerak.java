package modul_3.bagian_5.antarmuka;

interface Bergerak {

    void bergerak();

    default void berhenti(){
        System.out.println("Berhenti bergerak");
    }

    static void info(){
        System.out.println("ini adalah interface bergerak");
    }
}
