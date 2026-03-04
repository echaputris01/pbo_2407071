package latihan_pbo.latihan_3;

import java.util.Scanner;

class Cafe {

    // Identitas Cafe
    String namaCafe = "Cafe Senja";
    String alamatCafe = "Jl. Mawar No. 123";

    String namaMinuman;
    String bahan1;
    String bahan2;
    String bahan3;

    void tampilkanInfoCafe() {
        System.out.println("=================================");
        System.out.println("          " + namaCafe);
        System.out.println("      " + alamatCafe);
        System.out.println("=================================\n");
    }

    void racikDariBahan() {

        // Bahan
        String semuaBahan = (bahan1 + " " + bahan2 + " " + bahan3).toLowerCase();

        if (semuaBahan.contains("espresso") &&
            semuaBahan.contains("susu") &&
            semuaBahan.contains("foam")) {

            namaMinuman = "Cappuccino";
            tampilkanMinuman("1 shot espresso, 2 slot susu, 1/2 slot foam");
        }

        else if (semuaBahan.contains("espresso") &&
                 semuaBahan.contains("susu") &&
                 semuaBahan.contains("coklat")) {

            namaMinuman = "Mocaccino";
            tampilkanMinuman("1 shot espresso, 2 slot susu, 1 slot coklat");
        }

        else if (semuaBahan.contains("espresso") &&
                 semuaBahan.contains("air")) {

            namaMinuman = "Americano";
            tampilkanMinuman("1 shot espresso, 3 slot air");
        }

        else {
            System.out.println("\nCampuran tidak tersedia.");
        }
    }

    void racikDariNama() {

        if (namaMinuman.equalsIgnoreCase("Cappuccino")) {
            tampilkanMinuman("1 shot espresso, 2 slot susu, 1/2 slot foam");
        }

        else if (namaMinuman.equalsIgnoreCase("Mocaccino")) {
            tampilkanMinuman("1 shot espresso, 2 slot susu, 1 slot coklat");
        }

        else if (namaMinuman.equalsIgnoreCase("Americano")) {
            tampilkanMinuman("1 shot espresso, 3 slot air");
        }

        else {
            System.out.println("\nMenu tidak tersedia.");
        }
    }

    void tampilkanMinuman(String takaran) {
        System.out.println("\nMinuman: " + namaMinuman);
        System.out.println("Takaran: " + takaran);
    }
}

public class RacikBahan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Cafe cafe = new Cafe();

        cafe.tampilkanInfoCafe();

        System.out.println("Pilih cara pemesanan:");
        System.out.println("1. Input berdasarkan bahan");
        System.out.println("2. Input berdasarkan nama minuman");
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine(); 

        switch (pilihan) {

            case 1:
                System.out.print("Masukkan bahan 1: ");
                cafe.bahan1 = input.nextLine();

                System.out.print("Masukkan bahan 2: ");
                cafe.bahan2 = input.nextLine();

                System.out.print("Masukkan bahan 3: ");
                cafe.bahan3 = input.nextLine();

                cafe.racikDariBahan();
                break;

            case 2:
                System.out.print("Masukkan nama minuman: ");
                cafe.namaMinuman = input.nextLine();

                cafe.racikDariNama();
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}