package pkg100dayss;
import java.util.Scanner;

public class day16 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan angka
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        // Menggunakan kondisi if-else untuk menentukan apakah angka positif, negatif, atau nol
        if (angka > 0) {
            System.out.println("Angka ini adalah positif.");
        } else if (angka < 0) {
            System.out.println("Angka ini adalah negatif.");
        } else {
            System.out.println("Angka ini adalah nol.");
        }
        input.close();
    }
}



    
    
