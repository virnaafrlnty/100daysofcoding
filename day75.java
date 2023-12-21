package pkg100dayss;

import java.util.Scanner;

public class day75 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan penghasilan bulanan: ");
        int penghasilan = input.nextInt();
        
        double syarat = 5_240_000;
        double zakat;
        
        if (penghasilan >= syarat) {
            zakat = penghasilan * (2.5/100);
            System.out.println("total zakat adalah: " + zakat);
        }else{
            System.out.println("Maaf, penghasilan tidak memenuhi syarat untuk zakat profesi.");
        }
    }   
}
