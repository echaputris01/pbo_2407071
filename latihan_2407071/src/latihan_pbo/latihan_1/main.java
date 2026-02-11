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
}
public class main { 
    public static void main(String[] args) {

    cafe cafe1 = new cafe ("Kenangan", "Indramayu");
    cafe cafe2 = new cafe ("Kopi Tuku", "Bandung");
    cafe cafe3 = new cafe ("Kopi Klotok", "Yogyakarta");
    
 }
}