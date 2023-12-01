package pkg100dayss;

import java.util.Scanner;

public class day55 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();

        if (umur < 0) {
            System.out.println("Umur perlu dicek kembali.");
        } else if (umur < 6) {
            System.out.println("Umur anda termasuk kategori anak-anak.");
        } else if (umur < 18) {
            System.out.println("Umur anda termasuk kategori Remaja.");
        } else if (umur < 60) {
            System.out.println("Umur anda termasuk kategori Dewasa.");
        } else {
            System.out.println("Umur anda termasuk kategori Manula.");
        }
    }
}
