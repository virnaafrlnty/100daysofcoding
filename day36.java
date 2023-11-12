package pkg100dayss;

import java.util.Scanner;

public class day36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka:");

        int angka = scanner.nextInt();
        int totalJumlah = 0;

        for (int i = 1; i <= angka; i++) {
            System.out.println(i);
            if (i % 3 == 0) {
                totalJumlah += i;
            }
        }

        System.out.println("total jumlah: " + totalJumlah);
    }

}
