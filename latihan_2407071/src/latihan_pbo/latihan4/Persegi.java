package latihan_pbo.latihan4;

public class Persegi extends BangunDatar {
    private double sisi;

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void hitung() {
        luas = sisi * sisi;
        keliling = 4 * sisi;
    }
}