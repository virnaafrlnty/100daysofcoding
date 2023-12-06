package pkg100dayss;

import java.util.Scanner;

public class day60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat datang di Aplikasi Pendaftaran Event!");
        
        System.err.println("**********************************************");
        
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();
        System.out.print("Masukkan usia Anda: ");
        int umur = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan jenis kelamin (Pria/Wanita): ");
        String jenisKelamin = input.nextLine();
        
        System.err.println("**********************************************");
        
        if ((umur >= 18 && umur <= 30)&&(jenisKelamin.equalsIgnoreCase("Wanita"))) {
            System.out.println("Pendaftaran diterima! Selamat datang, " + nama + "!");
        }else{
            System.out.println("Maaf, Anda tidak memenuhi kriteria.");
        }
    }    
}
