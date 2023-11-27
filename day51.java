package pkg100dayss;

import java.util.Scanner;

public class day51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah sepatu yang dibeli: ");
        int jumlahBeli = input.nextInt();
        
        System.out.print("Masukkan harga per pasang sepatu: ");
        int harga = input.nextInt();
        
        int totalHarga = jumlahBeli * harga;
        System.out.println("Total harga belanja sebelum diskon: " + totalHarga);
        
        double diskon = 0;
        
        if (jumlahBeli < 5) {
            System.out.println("Tidak mendapatkan diskon.");
            
        }else if (jumlahBeli >= 5 && jumlahBeli <=10) {
            diskon = totalHarga * 0.05;
            System.out.println("Pembeli mendapatkan diskon sebesar Rp. " + diskon);
            
        }else if (jumlahBeli >= 11 && jumlahBeli <=20) {
            diskon = totalHarga * 0.10;
            System.out.println("Pembeli mendapatkan diskon sebesar Rp. " + diskon);
            
        }else if (jumlahBeli >= 20) {
            diskon = totalHarga * 0.15;
            System.out.println("Pembeli mendapatkan diskon sebesar Rp. " + diskon);
            
        }
        
        double totalHargaSetelahDiskon = totalHarga - diskon;
        System.out.println("Total harga setelah diskon: " + totalHargaSetelahDiskon);
    }
    
}
