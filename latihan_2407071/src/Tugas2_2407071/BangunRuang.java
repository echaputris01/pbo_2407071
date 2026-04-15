package Tugas2_2407071;

public class BangunRuang extends BangunDatar {
    private double tinggi;

    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        System.out.println("HitungLuas");
        return super.hitungLuas();
    }

    public double hitungVolume() {
        return hitungLuas() * tinggi; 
    }

    public double hitungVolume2() {
        return super.hitungLuas() * tinggi;
    }
}