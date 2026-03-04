package latihan_pbo.latihan_1;

class Cafe {
    private String nama;
    private String alamat;

    // Constructor
    public Cafe(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        System.out.println("Nama Cafenya adalah : " + nama);
        System.out.println("Alamatnya di : " + alamat);
        System.out.println("===============================");
    }

    // Method buka
    public void buka() {
        System.out.println("===============================");
        System.out.println("Cafe buka setiap hari");
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

public class Main {
    public static void main(String[] args) {
        Cafe cafe1 = new Cafe("Kenangan", "Indramayu");
        Cafe cafe2 = new Cafe("Kopi Tuku", "Bandung");
        Cafe cafe3 = new Cafe("Kopi Klotok", "Yogyakarta");

        // Panggil method buka
        cafe1.buka();
    }
}