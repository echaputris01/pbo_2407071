package latihan_pbo.latihan4;

public class BangunDatar {
    protected double luas;
    protected double keliling;

    // Getter
    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }

    // Method untuk menampilkan hasil
    public void tampilkanHasil() {
        System.out.println("Luas     : " + luas);
        System.out.println("Keliling : " + keliling);
    }
}