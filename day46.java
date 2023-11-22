package pkg100dayss;

import java.util.Scanner;

public class day46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan batas: ");
        
        int batas = sc.nextInt();
        
        String pesan;
        if (batas % 2 == 0) {
            pesan = "genap";           
        }else{
            pesan = "ganjil";
        }
        
        System.out.println("Menampilkan " + batas + " angka " + pesan + ":");
        for (int i = 0; i < batas; i++) {
            System.out.println(i);           
        }        
    }    
}
