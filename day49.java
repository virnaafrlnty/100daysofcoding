package pkg100dayss;

import java.util.Scanner;

public class day49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah apel yang dibeli: ");
        int apel = input.nextInt();
        System.out.println("Masukkan jumlah jeruk yang dibeli: ");
        int jeruk = input.nextInt();
        
        int hargaApel = 5_000;
        int hargaJeruk = 8_000;

        System.out.println("Total harga belanja: Rp. " + ((apel*hargaApel)+(jeruk*hargaJeruk)));       
    }    
}
