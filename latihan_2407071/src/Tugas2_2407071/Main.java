package Tugas2_2407071;

public class Main {
    public static void main(String[] args) {
        double panjang = 10;
        double lebar = 5;
        double tinggi = 4;

        BangunRuang balok = new BangunRuang(panjang, lebar, tinggi);

        System.out.println("Luas alas: " + balok.hitungLuas());
        System.out.println("Volume: " + balok.hitungVolume());
    }
}