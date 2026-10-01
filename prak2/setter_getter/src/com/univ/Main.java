package com.univ;

public class Main {
    public static void main(String[] args) {
        // Objek pertama: lemuen
        Mahasiswa lemuen = new Mahasiswa(
            "4524210001",
            "Lemuen",
            "Sankta",
            "Teknik Informatika",
            "25 Juni 2002",
            "Jl. Cendana No.12",
            22
        );

        // Objek kedua: zaidan
        Mahasiswa zaidan = new Mahasiswa(
            "4524210105",
            "Zaidan",
            "Dziaulfawwaz",
            "Teknik Informatika",
            "10 Mei 2001",
            "Jl. Melati No.8",
            23
        );

        // Tampilkan info
        lemuen.displayInfo();
        zaidan.displayInfo();

        // Panggil method belajar dan ujian
        lemuen.belajar();
        zaidan.ujian();
    }
}