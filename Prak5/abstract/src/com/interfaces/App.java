package com.interfaces;

import java.util.Scanner; // library untuk input data dari console

public class App {
    public static void main(String[] args) throws Exception {
        Handphone redmiNote8 = new Xiaomi();
        Pengguna dian = new Pengguna(redmiNote8);

        dian.nyalakanHP();
        boolean isHpOn = true; // Penanda status HP (true = nyala, false = mati)

        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("[1] Besarkan Volume");
            System.out.println("[2] Kecilkan Volume");
            
            // Pengondisian if untuk mengubah menu pilihan [3]
            if (isHpOn) {
                System.out.println("[3] Matikan HP");
            } else {
                System.out.println("[3] Nyalakan HP");
            }

            System.out.println("[0] Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1 -> dian.besarkanSuaraHP();
                case 2 -> dian.kecilkanSuaraHP();
                case 3 -> {
                    // Pengondisian if untuk mematikan atau menyalakan kembali HP
                    if (isHpOn) {
                        dian.matikanHP();
                        isHpOn = false; // Mengubah status HP menjadi mati
                    } else {
                        dian.nyalakanHP();
                        isHpOn = true;  // Mengubah status HP menjadi nyala kembali
                    }
                }
                case 0 -> System.out.println("Keluar dari program...");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        
        input.close();
    }
}