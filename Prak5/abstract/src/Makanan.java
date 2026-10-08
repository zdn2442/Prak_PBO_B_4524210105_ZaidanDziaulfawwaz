class Makanan extends Product {

    protected String nama;
    protected int harga;
    protected int qtt;

    public Makanan(String nama, int harga, int qtt){
        this.nama = nama;
        this.harga = harga;
        this.qtt = qtt;
    }

    @Override
    void itungHarga() {
        float total;

        total = this.harga * this.qtt;

        System.out.println("Totalnya : " + total);
    }
}
