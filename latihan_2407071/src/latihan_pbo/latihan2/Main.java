package latihan_pbo.latihan2;

// encapsulation - Persegi Panjang
class PersegiPanjang {

    private int panjang;
    private int lebar;

    // setter panjang
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    // getter panjang
    public int getPanjang() {
        return panjang;
    }

    // setter lebar
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    // getter lebar
    public int getLebar() {
        return lebar;
    }

    // method luas
    public int hitungLuas() {
        return panjang * lebar;
    }

    // method keliling
    public int hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}

public class Main {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();

        pp.setPanjang(10);
        pp.setLebar(5);

        System.out.println("Panjang : " + pp.getPanjang());
        System.out.println("Lebar   : " + pp.getLebar());
        System.out.println("Luas    : " + pp.hitungLuas());
        System.out.println("Keliling: " + pp.hitungKeliling());
    }
}