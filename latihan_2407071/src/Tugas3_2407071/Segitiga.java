package Tugas3_2407071;

public class Segitiga extends BangunDatar {

    // Constructor
    public Segitiga(double alas, double tinggi) {
        super(alas, tinggi);
    }

    // Override hitungLuas
    @Override
    public double hitungLuas() {
        return 0.5 * getVarA() * getVarB();
    }

    // Override tampilkan
    @Override
    public void tampilkan() {
        System.out.println("Segitiga");
        System.out.println("=====================");
        System.out.println("Alas: " + getVarA());
        System.out.println("Tinggi: " + getVarB());
        System.out.println("Luas: " + hitungLuas());
        System.out.println("=====================");
    }
}