package pkg100dayss;

import java.util.Scanner;

public class day73 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5};
        System.out.print("Masukkan index yang ingin diakses: ");
        int index = input.nextInt();

        if (index >= 0 && index < array.length) {
            System.out.println("Nilai pada index " + index + ": " + array[index]);
        } else {
            System.out.println("Index tidak valid.");
        }
    }
}
