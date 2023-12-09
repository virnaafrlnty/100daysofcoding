package pkg100dayss;

import java.util.Scanner;

public class day63 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat datang di Kalkulator Pengeluaran Harian!");
        System.out.println("Hari 1");
        System.out.print("Masukkan pengeluaran harian: ");
        int hari1 = input.nextInt();
        System.out.println("Hari 2");
        System.out.print("Masukkan pengeluaran harian: ");
        int hari2 = input.nextInt();
        System.out.println("Hari 3");
        System.out.print("Masukkan pengeluaran harian: ");
        int hari3 = input.nextInt();
        System.out.println("Hari 4");
        System.out.print("Masukkan pengeluaran harian: ");
        int hari4 = input.nextInt();
        System.out.println("Hari 5");
        System.out.print("Masukkan pengeluaran harian: ");
        int hari5 = input.nextInt();
        System.out.println("Hari 6");
        System.out.print("Masukkan pengeluaran harian: ");
        int hari6 = input.nextInt();
        System.out.println("Hari 7");
        System.out.print("Masukkan pengeluaran harian: ");
        int hari7 = input.nextInt();
        System.out.println("---------------------------------------");
        double rata_rata = (hari1 + hari2 + hari3 + hari4 + hari5 + hari6 + hari7) / 7;
        System.out.println("Rata-rata pengeluaran harian: " + rata_rata);
        int total_pengeluaran = hari1 + hari2 + hari3 + hari4 + hari5 + hari6 + hari7;
        System.out.println("Total pengeluaran selama satu minggu: " + total_pengeluaran);
    }
}
