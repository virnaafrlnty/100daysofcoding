package pkg100dayss;

import java.util.Scanner;

public class day56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        String kondisi = (angka % 2 == 0)? "Genap":"Ganjil";
        System.out.println("Angka " + angka + " adalah angka " + kondisi );
    }   
}
