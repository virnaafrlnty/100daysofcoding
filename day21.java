package pkg100dayss;
import java.util.Scanner;

public class day21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = input.nextDouble();

        System.out.println("Pilih operasi:");
        System.out.println("1. Hitung luas");
        System.out.println("2. Hitung keliling");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = input.nextInt();

        double hasil = 0;

        if (pilihan == 1) {
            hasil = panjang * lebar; // Menghitung luas persegi panjang
            System.out.println("Luas dari persegi panjang adalah: " + hasil);
        } else if (pilihan == 2) {
            hasil = 2 * (panjang + lebar); // Menghitung keliling persegi panjang
            System.out.println("Keliling dari persegi panjang adalah: " + hasil);
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}

