package pkg100dayss;

import java.util.Scanner;

public class day37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        
        int angka = scan.nextInt();
        
        if (angka < 0 ) {
            System.out.println(angka + " adalah bilangan negatif");
            
        }else{
            System.out.println(angka +" adalah bilangan positif");
        }
        
    }
    
}
