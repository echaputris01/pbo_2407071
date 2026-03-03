package Tugas1_2407071;

import java.util.Scanner;

// Superclass
class BangunDatar {
    protected double luas;
    protected double keliling;

    public void tampilkanHasil() {
        System.out.println("Luas     : " + luas);
        System.out.println("Keliling : " + keliling);
    }
}

// Persegi
class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public void hitung() {
        luas = sisi * sisi;
        keliling = 4 * sisi;
    }
}

// Lingkaran
class Lingkaran extends BangunDatar {
    private double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    public void hitung() {
        luas = Math.PI * r * r;
        keliling = 2 * Math.PI * r;
    }
}

// Persegi Panjang
class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void hitung() {
        luas = panjang * lebar;
        keliling = 2 * (panjang + lebar);
    }
}

// Segitiga (rumus keliling = jumlah semua sisi)
class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisiMiring;

    public Segitiga(double alas, double tinggi, double sisiMiring) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    public void hitung() {
        luas = 0.5 * alas * tinggi;
        keliling = alas + tinggi + sisiMiring;
    }
}

// Main Class
public class KalkulatorBangunDatar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== KALKULATOR BANGUN DATAR ===");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Segitiga");
        System.out.print("Pilih (1-4): ");
        int pilih = input.nextInt();

        if (pilih == 1) {
            System.out.print("Masukkan sisi: ");
            double s = input.nextDouble();
            Persegi p = new Persegi(s);
            p.hitung();
            p.tampilkanHasil();

        } else if (pilih == 2) {
            System.out.print("Masukkan jari-jari: ");
            double r = input.nextDouble();
            Lingkaran l = new Lingkaran(r);
            l.hitung();
            l.tampilkanHasil();

        } else if (pilih == 3) {
            System.out.print("Masukkan panjang: ");
            double p = input.nextDouble();
            System.out.print("Masukkan lebar: ");
            double l = input.nextDouble();
            PersegiPanjang pp = new PersegiPanjang(p, l);
            pp.hitung();
            pp.tampilkanHasil();

        } else if (pilih == 4) {
            System.out.print("Masukkan alas: ");
            double a = input.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double t = input.nextDouble();
            System.out.print("Masukkan sisi miring: ");
            double sm = input.nextDouble();
            Segitiga s = new Segitiga(a, t, sm);
            s.hitung();
            s.tampilkanHasil();

        } else {
            System.out.println("Pilihan tidak tersedia!");
        }

        input.close();
    }
}