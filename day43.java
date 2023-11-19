package pkg100dayss;

import java.util.Scanner;

public class day43 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();

        System.out.println("Tabel perkalian untuk angka " + angka + ":");
        for (int i = 1; i <= 10; i++) {
            int perkalian = i * angka;
            System.out.println(i + " x " + angka + " = " + perkalian);
        }
    }
}
