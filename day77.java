package pkg100dayss;

import java.util.Scanner;

public class day77 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang tanah: ");
        int panjangTanah = input.nextInt();
        System.out.print("Masukkan lebar tanah: ");
        int lebarTanah = input.nextInt();
        
        int hargaTanahPermeter = 500_000;
        int hargaTanah = (panjangTanah*hargaTanahPermeter)+(lebarTanah*hargaTanahPermeter);
        System.out.println("Harga tanah adalah: " + hargaTanah );
    }
    
}

