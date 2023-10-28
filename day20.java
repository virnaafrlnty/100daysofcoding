package pkg100dayss;
import java.util.Scanner;

public class day20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        System.out.println("Pilih operasi matematika:");
        System.out.println("1. Penambahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.print("Masukkan pilihan (1/2/3/4): ");
        int pilihan = input.nextInt();

        double hasil = 0;

        if (pilihan == 1) {
            hasil = angka1 + angka2;
        } else if (pilihan == 2) {
            hasil = angka1 - angka2;
        } else if (pilihan == 3) {
            hasil = angka1 * angka2;
        } else if (pilihan == 4) {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
            } else {
                System.out.println("Pembagian oleh nol tidak valid.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        if (pilihan >= 1 && pilihan <= 4) {
            System.out.println("Hasil operasi matematika: " + hasil);
        }

        input.close();
    }
}


