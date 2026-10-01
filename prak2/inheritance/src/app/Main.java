package app;

public class Main {
    public static void main(String[] args) throws Exception{
        Karyawan Waltz = new Karyawan("828773", "Waltz");
        Waltz.absenPagi();
        Waltz.absenPulang();
        Waltz.kerja();
        Waltz.getInfo();
        System.out.println();
        Dosen Sussuro = new Dosen("983873848", "Sussuro", "0000");
        Sussuro.absenPagi();
        Sussuro.absenPulang();
        Sussuro.ngajar ();
        Sussuro.getInfo();
        System.out.println();

    }
}
