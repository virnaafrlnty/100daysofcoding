package pkg100dayss;

import java.util.Scanner;

public class day72 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang array: ");
        int panjangArray = input.nextInt();
        int[] array = new int[panjangArray];

        for (int i = 0; i < panjangArray; i++) {
            System.out.print("Masukkan nilai ke-" + i + ":");
            array[i] = input.nextInt();
        }

        System.out.println("Nilai array yang dimasukkan:");
        for (int i = 0; i < panjangArray; i++) {
            System.out.println("Nilai ke-" + i + ":" + array[i]);
        }
    }
}
