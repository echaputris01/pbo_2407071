package latihan_pbo.latihan4;

public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisiMiring;

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setSisiMiring(double sisiMiring) {
        this.sisiMiring = sisiMiring;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getSisiMiring() {
        return sisiMiring;
    }

    public void hitung() {
        luas = 0.5 * alas * tinggi;
        keliling = alas + tinggi + sisiMiring;
    }
}