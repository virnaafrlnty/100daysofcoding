package pkg100dayss;
import java.util.Scanner;

public class day14 {
    public static void main(String[] args) {
        //membuat object Scanner
        Scanner input = new Scanner(System.in);
        
        //meminta memasukkan angka pertama
        System.out.println("masukkan angka pertamamu:");
        int angka1 = input.nextInt();
        
        //meminta pengguna memasukkan angka kedua
        System.out.println("masukkan angka keduamu:");
        int angka2 = input.nextInt();

        // Operasi penjumlahan
        int hasilPenjumlahan = angka1 + angka2;
        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);
        
        //menutup object Scanner
        input.close();
        
    }
}