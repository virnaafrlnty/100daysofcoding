package pkg100dayss;
import java.util.Scanner;

public class day22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Berapa banyak angka yang akan diinput: ");
        int jumlahAngka = input.nextInt();

        // Membuat array untuk menyimpan angka-angka yang diinput
        int[] angka = new int[jumlahAngka];

        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        // Menghitung rata-rata dari angka-angka yang diinput
        int total = 0;
        for (int i = 0; i < jumlahAngka; i++) {
            total += angka[i];
        }
        double rataRata = (double) total / jumlahAngka;

        System.out.println("Rata-rata dari angka-angka tersebut adalah: " + rataRata);

        input.close();
    }
}

    

