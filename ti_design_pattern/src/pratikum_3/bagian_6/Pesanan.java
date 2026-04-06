package pratikum_3.bagian_6;

class Pesanan {
    private final String namaPemesan;
    private final Tiket tiket;
    private final int jumlah;

    public Pesanan(String namaPemesan, Tiket tiket, int jumlah){
        this.namaPemesan = namaPemesan;
        this.tiket = tiket;
        this.jumlah = jumlah;
    }

    public String getNamaPemesan(){
        return namaPemesan;
    }

    public Tiket getTiket(){
        return tiket;
    }

    public int getJumlah(){
        return jumlah;
    }

    public double hitungTotal(){
        double total = tiket.getHarga() * jumlah;
        double diskon = tiket.hitungDiskon();
        return total - diskon;
    }

    public void displayDetail(){
        System.out.println("\nDetail pesanan:");
        System.out.println("nama pemesan: " + namaPemesan);
        System.out.println("jenis tiket: " + tiket.getJenis());
        System.out.println("jumlah: " + jumlah);
        System.out.println("total harga: Rp" + hitungTotal());
    }
}
