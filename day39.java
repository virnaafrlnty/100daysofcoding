package pkg100dayss;

import java.util.Scanner;

public class day39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Jumlah apel dalam keranjang: ");
        int apelDikeranjang = scan.nextInt();
        
        System.out.print("Masukkan jumlah apel yang diberikan: ");
        int apelKeluar = scan.nextInt() ;
        
        int sisaApel = apelDikeranjang - apelKeluar;
        System.out.println("Sisa apel di keranjang: " + sisaApel);
        
        if (sisaApel > 0) {
            System.out.println("Masih ada sisa apel dikeranjang sebanyak " + sisaApel);           
        }else{
             System.out.println("Apel dikeranjang habis.");
        }
    }
    
}
