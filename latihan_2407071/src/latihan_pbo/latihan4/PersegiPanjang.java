package latihan_pbo.latihan4;

public class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void hitung() {
        luas = panjang * lebar;
        keliling = 2 * (panjang + lebar);
    }
}