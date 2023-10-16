package pkg100dayss;
import java.util.Scanner;

public class day8 {
    public static void main(String[] args) {
        //membuat objek Scanner untuk menerima inputan dari pengguna
        Scanner input = new Scanner(System.in);//keywoard Scanner -> class untuk membaca inputan
        /*bagian dari libraryjava yang disediakan untuk mengolah input
        input -> objek dari kelas 'Scanner' -> membaca input dari 'System,in'
        metode 'nextIn()' -> membaca nilai yang diinputkan
        */
        
        
        //meminta pengguna memasukkan usia
        System.out.println("Masukkan usia mu Puh    :");
        int usia = input.nextInt();
        
        //menentukan kategori usia berdasarkan rentang usia
        if (usia < 0){
            System.out.println("Jangan ngadi-ngadi Puh!");
        } else if (usia < 18){
            System.out.println("Kamu ternyata belum Sepuh hehe");
        }else if (usia < 65){
            System.out.println("Kamu OTW Sepuh HAHAHA");
        }else{
            System.out.println("Sepertinya kamu sudah alm/almh ");
        }
        
        //menutup objek Scanner
        input.close();
        
    }
    
}
