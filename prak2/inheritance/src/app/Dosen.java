package app;

public class Dosen extends Karyawan{
    
    private String NIDN;

    public Dosen(String var1, String var2, String var3){
        super(var1, var2);
        this.NIDN = var3;
    }

    @Override 
    public void absenPagi(){
        System.out.println(this.nama + " : absen pagi");
    }

    public void ngajar(){
        System.out.println(this.nama + " : lagi ngajar");
    }
        
    @Override 
    public void absenPulang(){
        System.out.println(this.nama + " : udah pulang");
    }    

    @Override 
    public void getInfo(){
        System.out.println("Kode karyawan : " + this.kodeKaryawan);
        System.out.println("Nama  : " + this.nama);
        System.out.println("NIDN  : " + this.NIDN);
    }
}
