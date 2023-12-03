package pkg100dayss;

import java.util.Scanner;

public class day57 {
    public static void main(String[] args) {
        
        double hargaHamburger = 25_000;
        double hargaPizza = 40_000;
        double hargaSpaghetti = 30_000;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah pesanan Hamburger: ");
        int pesananHamburger = sc.nextInt();
        
        System.out.print("Masukkan jumlah pesanan Pizza: ");
        int pesananPizza = sc.nextInt();
        
        System.out.print("Masukkan jumlah pesanan Spaghetti: ");
        int pesananSpaghetti = sc.nextInt();
        
        double totalPesanan = (pesananHamburger * hargaHamburger) + (pesananPizza * hargaPizza)  + (pesananSpaghetti * hargaSpaghetti) ;
        
        System.out.println("Total pesanan Anda adalah: Rp. " + totalPesanan);
    }
}
