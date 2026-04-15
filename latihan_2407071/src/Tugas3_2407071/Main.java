package Tugas3_2407071;

public class Main {
    public static void main(String[] args) {

        // Array objek BangunDatar
        BangunDatar[] bangun = new BangunDatar[3];

        bangun[0] = new Persegi(5);
        bangun[1] = new PersegiPanjang(6, 4);
        bangun[2] = new Segitiga(8, 3);

        // Tampilkan semua
        for (BangunDatar b : bangun) {
            b.tampilkan();
        }
    }
}