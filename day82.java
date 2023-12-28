package pkg100dayss;

import java.util.Scanner;

public class day82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angkaPertama = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angkaKedua = scanner.nextInt();

        System.out.print("Masukkan angka ketiga: ");
        int angkaKetiga = scanner.nextInt();

        // Menghitung hasil pembagian
        double hasilPembagian1 = (double) angkaPertama / angkaKetiga;
        double hasilPembagian2 = (double) angkaPertama / angkaKedua;

        // Mengecek apakah hasil pembagian adalah pecahan
        if (isPecahan(hasilPembagian1)) {
            hasilPembagian1 += 2;
        }

        if (isPecahan(hasilPembagian2)) {
            hasilPembagian2 -= 2;
        }

        // Menampilkan hasil
        System.out.println("Hasil pembagian 1: " + hasilPembagian1);
        System.out.println("Hasil pembagian 2: " + hasilPembagian2);
    }

    // Fungsi untuk mengecek apakah suatu bilangan adalah pecahan
    private static boolean isPecahan(double angka) {
        return angka % 1 != 0;
    }
}

