package latihan_pbo.latihan4;

public class Lingkaran extends BangunDatar {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void hitung() {
        luas = Math.PI * radius * radius;
        keliling = 2 * Math.PI * radius;
    }
}