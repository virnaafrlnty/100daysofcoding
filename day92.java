package pkg100dayss;

import java.util.Scanner;

public class day92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Masukkan nilai N: ");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

