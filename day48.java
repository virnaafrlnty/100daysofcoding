package pkg100dayss;

import java.util.Scanner;

public class day48 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan batas: ");
        int batas = sc.nextInt();

        System.out.print("Masukkan maksimal angka yang ditampilkan: ");
        int maks = sc.nextInt();

        String pesan;
        if (batas % 2 == 0) {
            pesan = "genap";
        } else {
            pesan = "ganjil";
        }

        System.out.println("Menampilkan " + batas + " angka " + pesan + ":");
        if (batas % 2 == 0) {
            for (int i = 2; i <= maks; i += 2) {
                System.out.println(i);
                batas--;
                if (batas == 0) {
                    break;
                }
            }
        } else {
            for (int i = 1; i <= maks; i += 2) {
                System.out.println(i);
                batas--;
                if (batas == 0) {
                    break;
                }
            }
        }
    }
}
