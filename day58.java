package pkg100dayss;

import java.util.Scanner;

public class day58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan total belanja: ");
        int totalBelanja = sc.nextInt();
        int poin = 0;
        
        if (totalBelanja < 100_000) {
            System.out.println("Pelggan tidak mendapatkan poin.");            
        }else if (totalBelanja >= 100_000 && totalBelanja < 500_000) {
            poin = (totalBelanja/10_000)*5;
            System.out.println("Pelggan mendapatkan poin sebanyak " + poin + " poin");            
        }else if (totalBelanja >= 500_000) {
            poin = (totalBelanja/10_000)*10;
            System.out.println("Pelggan mendapatkan poin sebanyak " + poin + " poin");            
        }        
    }    
}
