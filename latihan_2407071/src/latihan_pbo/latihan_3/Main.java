package latihan_pbo.latihan_3;

import java.util.Scanner;

class Cafe {
    String nama;
    String bahan1;
    String bahan2;
    String bahan3;

    void racikMinuman() {

        if (bahan1.equalsIgnoreCase("espresso") &&
            bahan2.equalsIgnoreCase("susu") &&
            bahan3.equalsIgnoreCase("foam")) {

            nama = "Cappuccino";
            System.out.println("Minuman: " + nama);
            System.out.println("Takaran: 1 shot espresso, 2 slot susu, 1/2 slot foam");
        }

        else if (bahan1.equalsIgnoreCase("espresso") &&
                 bahan2.equalsIgnoreCase("susu") &&
                 bahan3.equalsIgnoreCase("coklat")) {

            nama = "Mocaccino";
            System.out.println("Minuman: " + nama);
            System.out.println("Takaran: 1 shot espresso, 2 slot susu, 1 slot coklat");
        }

        else if (bahan1.equalsIgnoreCase("espresso") &&
                 bahan2.equalsIgnoreCase("air")) {

            nama = "Americano";
            System.out.println("Minuman: " + nama);
            System.out.println("Takaran: 1 shot espresso, 3 slot air");
        }

        else {
            System.out.println("Campuran tidak tersedia.");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Cafe cafe = new Cafe();

        System.out.print("Masukkan bahan 1: ");
        cafe.bahan1 = input.nextLine();

        System.out.print("Masukkan bahan 2: ");
        cafe.bahan2 = input.nextLine();

        System.out.print("Masukkan bahan 3: ");
        cafe.bahan3 = input.nextLine();

        cafe.racikMinuman();
    }
}