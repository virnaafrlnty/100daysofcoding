package pkg100dayss;

import java.util.Scanner;

public class day65 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        int ganjil;
        int jumlahGanjil = 0;
        
        for (int i = 01; i <= n; i++) {
            if (i % 2 != 0) {
                ganjil = i;
                jumlahGanjil += ganjil;
                
            }
            
        }
        System.out.println("Jumlah bilangan ganjil dari 1 hingga " + n + " adalah: " + jumlahGanjil );
    }   
}
