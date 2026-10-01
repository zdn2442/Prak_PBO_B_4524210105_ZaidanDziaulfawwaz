package com.univ;

public class Mahasiswa {
    // Properti
    private String npm;
    private String namaDepan;
    private String namaBelakang;
    private String prodi;
    private String tanggalLahir;
    private String alamat;
    private int umur;

    // Constructor
    public Mahasiswa(String npm, String namaDepan, String namaBelakang, String prodi, String tanggalLahir, String alamat, int umur) {
        this.npm = npm;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.prodi = prodi;
        this.tanggalLahir = tanggalLahir;
        this.alamat = alamat;
        this.umur = umur;
    }

    // Getter dan Setter
    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public String getProdi() {
        return prodi;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Method tambahan
    public void belajar() {
        System.out.println(namaDepan + " sedang belajar");
    }

    public void ujian() {
        System.out.println(namaDepan + " sedang ujian");
    }

    // Method untuk menampilkan informasi
    public void displayInfo() {
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("NPM             : " + npm);
        System.out.println("Nama Depan      : " + namaDepan);
        System.out.println("Nama Belakang   : " + namaBelakang);
        System.out.println("Prodi           : " + prodi);
        System.out.println("Tanggal Lahir   : " + tanggalLahir);
        System.out.println("Alamat          : " + alamat);
        System.out.println("Umur            : " + umur);
        System.out.println();
    }
}