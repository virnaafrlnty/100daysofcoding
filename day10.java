package pkg100dayss;
import java.util.Scanner; //mengimpor kelas 'Scanner' dari library 'java.util'
//agarkita dapat menggunakan kelas 'Scanner' untuk menerima inputan

public class day10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//membuat objek 'Scanner' bernama 'input untuk menerima inputan
        //'System.in' -. untuk menghubungkan 'Scanner' dengan keyboard
        
        System.out.print("Masukkan nilai ujian: ");
        int nilai = input.nextInt();//menggunakan objek 'input' -> membaca nilai yang diinput -> disimpan dalam variabel 'nilai'
        
        if (nilai >= 70) {
            System.out.println("Selamat, Anda lulus!");
        } else {
            System.out.println("Maaf, Anda belum lulus.");
            
            // Pernyataan nested (bersarang) untuk memberikan informasi tambahan
            if (nilai >= 60) { 
                System.out.println("Anda hampir lulus. Perlu belajar lebih giat lagi.");
            } else {
                System.out.println("Anda perlu belajar lebih keras lagi.");
            }
        }
        
        input.close();
    }
}
