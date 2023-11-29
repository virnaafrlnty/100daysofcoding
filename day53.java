package pkg100dayss;

import java.util.Scanner;

public class day53 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama depan: ");
        String namaDepan = input.next();

        System.out.print("Masukkan nama belakang: ");
        String namaBelakang = input.next();

        System.out.println("Nama panjang anda adalah: " + namaDepan + " " + namaBelakang);
    }
}
