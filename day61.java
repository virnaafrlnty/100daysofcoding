package pkg100dayss;

import java.util.Scanner;

public class day61 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan usia orang pertama: ");
        int umurPertama = input.nextInt();
        System.out.print("Masukkan usia orang kedua: ");
        int umurKedua = input.nextInt();
        System.out.println("Perbandingan usia:");
        if (umurPertama < umurKedua) {
            System.out.println("Usia orang pertama lebih muda dari usia orang kedua.");            
        }else{
            System.out.println("Usia orang pertama lebih tua dari orang kedua.");
        }
        
    }
    
}
