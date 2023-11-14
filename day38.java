package pkg100dayss;

import java.util.Scanner;

public class day38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan jarak perjalanan (dalam kilometer): ");
        int jarakPerjalanan = scan.nextInt();
        
        //menggunakan double untuk tarif 
        double tarifPerKilometer = 3_000.0;
        System.out.println("Tarif/km: " + tarifPerKilometer);
        
//        int totalTarif = tarifPerKilometer * jarakPerjalanan;
//        System.out.println("Total tarif: " + totalTarif);
        
        int tarifDasar = 10_000;
        System.out.println("Tarif Dasar: " + tarifDasar);
        
        //menghitung total tarif sebelum diskon
        double totalTarifSebelumDiskon = tarifDasar + (tarifPerKilometer * jarakPerjalanan);
        System.out.println("Total Tarif Sebelum Diskon: " + totalTarifSebelumDiskon);
        
//        menggunakan double untuk mengakomodasi nilai
        double totalTarifPerjalanan;
        
//        melakukan diskon jika jarakPerjalanan lebih dari 10 kilometer
        if (jarakPerjalanan > 10 ) {
            double diskon = 0.1 * totalTarifSebelumDiskon;
            totalTarifPerjalanan = totalTarifSebelumDiskon - diskon;
            System.out.println("Diskon 10% diterapkan.");
            System.out.println("Jumlah total tarif yang dibayarkan penumpang adalah: " + totalTarifPerjalanan);
            
        }else{
//            jika jarakPerjalanan 10 kilometer atau kurang, tanpa diskon
            totalTarifPerjalanan = totalTarifSebelumDiskon;
            System.out.println("Tidak ada Diskon.");
            System.out.println("Jumlah total tarif yang dibayarkan penumpang adalah: " + totalTarifPerjalanan);
        }
    }
    
}
