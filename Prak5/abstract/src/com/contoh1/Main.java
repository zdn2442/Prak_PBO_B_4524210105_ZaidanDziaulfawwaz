package com.contoh1;

public class Main {
    public static void main(String[] args) throws Exception {
        Segitiga s1 = new Segitiga(10, 6, "merah");
        Lingkaran l1 = new Lingkaran(10, "biru");
        s1.luas();
        l1.luas();
        s1.warnaBangunan();
        l1.warnaBangunan();
    }
}
