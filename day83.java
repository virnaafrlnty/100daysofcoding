package pkg100dayss;

import java.util.Scanner;

public class day83 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int  b= input.nextInt();
        
        int hasil = a / b;
        
        if (hasil % 2 == 0) {
            hasil += 2;
            System.out.println("hasilnya = " + hasil);
        }else if (hasil % 2 != 0) {
            hasil -= 2;
            System.out.println("hasilnya = " + hasil);
        }     
    }
}
