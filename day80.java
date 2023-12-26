package pkg100dayss;

import java.util.Scanner;

public class day80 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai x: ");
        int x = input.nextInt();
        System.out.print("Masukkan nilai y: ");
        int y = input.nextInt();
        int p = x + y;
        
        if (p >= 4) {
            int hasil = x * y;
            System.out.println("Hasil: " + hasil);
        }else{
            int hasil = x % y;
            System.out.println("Hasil: " + hasil);
        }
    }
    
}
