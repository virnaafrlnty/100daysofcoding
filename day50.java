package pkg100dayss;

import java.util.Scanner;

public class day50 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tahun kerja karyawan: ");
        int tahun = input.nextInt();

        System.out.print("Masukkan gaji pokok karyawan: ");
        double gajiPokok = input.nextInt();

        double bonus;

        if (tahun < 5) {
            bonus = 0;
            System.out.println("Karyawan tidak mendapatkan bonus");

        } else if (tahun >= 5 && tahun <= 10) {
            bonus = 0.05 * gajiPokok;
            System.out.println("Bonus Karyawan = " + bonus);

        } else if (tahun >= 11 && tahun <= 15) {
            bonus = 0.10 * gajiPokok;
            System.out.println("Bonus Karyawan = " + bonus);

        } else if (tahun > 15) {
            bonus = 0.15 * gajiPokok;
            System.out.println("Bonus Karyawan = " + bonus);

        }
    }
}
