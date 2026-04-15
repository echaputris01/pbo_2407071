package Tugas3_2407071;

public class Persegi extends BangunDatar {

    // Constructor
    public Persegi(double sisi) {
        super(sisi);
    }

    // Override hitungLuas
    @Override
    public double hitungLuas() {
        return getVarA() * getVarA();
    }

    // Override tampilkan
    @Override
    public void tampilkan() {
        System.out.println("Persegi");
        System.out.println("=====================");
        System.out.println("Sisi: " + getVarA());
        System.out.println("Luas: " + hitungLuas());
        System.out.println("=====================");
    }
}