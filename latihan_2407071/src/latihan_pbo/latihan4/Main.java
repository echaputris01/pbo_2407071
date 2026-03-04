package latihan_pbo.latihan4;

public class Main {
    public static void main(String[] args) {

        // Persegi
        Persegi persegi = new Persegi();
        persegi.setSisi(5);
        persegi.hitung();
        System.out.println("Persegi:");
        persegi.tampilkanHasil();

        // Persegi Panjang
        PersegiPanjang pp = new PersegiPanjang();
        pp.setPanjang(6);
        pp.setLebar(3);
        pp.hitung();
        System.out.println("\nPersegi Panjang:");
        pp.tampilkanHasil();

        // Lingkaran
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setRadius(7);
        lingkaran.hitung();
        System.out.println("\nLingkaran:");
        lingkaran.tampilkanHasil();

        // Segitiga
        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(4);
        segitiga.setTinggi(5);
        segitiga.setSisiMiring(6);
        segitiga.hitung();
        System.out.println("\nSegitiga:");
        segitiga.tampilkanHasil();
    }
}