package latihan_pbo.latihan_1;
class cafe {
    String nama;
    String alamat;

    //construktor
    cafe(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
        System.out.println("Nama Cafenya adalah : " + nama);
        System.out.println("Alamatnya di : " + alamat);
        System.out.println("===============================");
    }

    //method
    void buka(){
        System.out.println("===============================");
        System.out.println("Cafe suka buka");
        
    }

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
public class main { 
    public static void main(String[] args) {

    cafe cafe1 = new cafe ("Kenangan", "Indramayu");
    cafe cafe2 = new cafe ("Kopi Tuku", "Bandung");
    cafe cafe3 = new cafe ("Kopi Klotok", "Yogyakarta");
    cafe3.setNama("")
    
 }
}