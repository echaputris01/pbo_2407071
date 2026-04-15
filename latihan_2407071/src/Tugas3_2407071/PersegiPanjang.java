package Tugas3_2407071;

public class PersegiPanjang extends BangunDatar {

    // Constructor
    public PersegiPanjang(double panjang, double lebar) {
        super(panjang, lebar);
    }

    // HitungLuas
    @Override
    public double hitungLuas() {
        return getVarA() * getVarB();
    }

    // Tampilkan
    @Override
    public void tampilkan() {
        System.out.println("Persegi Panjang");
        System.out.println("=====================");
        System.out.println("Panjang: " + getVarA());
        System.out.println("Lebar: " + getVarB());
        System.out.println("Luas: " + hitungLuas());
        System.out.println("=====================");
    }
}