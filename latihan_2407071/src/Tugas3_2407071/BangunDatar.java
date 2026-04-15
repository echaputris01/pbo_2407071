package Tugas3_2407071;
public class BangunDatar {
    private double varA;
    private double varB;

    // Constructor 2 parameter
    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    // Constructor 1 parameter
    public BangunDatar(double varA) {
        this.varA = varA;
        this.varB = 0;
    }

    // Getter
    public double getVarA() {
        return varA;
    }

    public double getVarB() {
        return varB;
    }

    // Method hitungLuas
    public double hitungLuas() {
        return 0;
    }

    // Method tampilkan
    public void tampilkan() {
        System.out.println("Bangun Datar");
        System.out.println("=====================");
        System.out.println("varA: " + varA);
        System.out.println("varB: " + varB);
        System.out.println("=====================");
    }
}