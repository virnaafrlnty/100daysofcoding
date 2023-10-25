package pkg100dayss;
import java.util.Scanner;

public class day17 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian: ");
        int nilai = input.nextInt();

        if (nilai >= 70) {
            System.out.println("Selamat, Anda lulus!");
        } else {
            System.out.println("Maaf, Anda belum lulus.");

            // Percabangan dalam percabangan
            if (nilai >= 60) {
                System.out.println("Anda hampir lulus. Perlu belajar lebih giat lagi.");
            } else {
                System.out.println("Anda perlu belajar lebih keras lagi.");
            }
        }

        // Menutup objek Scanner
        input.close();
    }
}

