package pkg100dayss;

import java.util.Scanner;

public class day66 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan suhu: ");
        double suhu = input.nextDouble(); // Menggunakan nextDouble() untuk membaca bilangan desimal
        System.out.print("Masukkan satuan suhu (C untuk Celcius, F untuk Fahrenheit): ");
        input.nextLine();
        String satuanSuhu = input.nextLine();
        double konversi;

        if (satuanSuhu.equalsIgnoreCase("C")) {
            konversi = (9.0 / 5.0) * suhu + 32; // Menggunakan rumus yang benar
            System.out.println(suhu + " " + satuanSuhu + " = " + konversi + " Fahrenheit");
        } else if (satuanSuhu.equalsIgnoreCase("F")) {
            konversi = (5.0 / 9.0) * (suhu - 32);
            System.out.println(suhu + " " + satuanSuhu + " = " + konversi + " Celcius");
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}
