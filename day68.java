package pkg100dayss;

import java.util.Scanner;

public class day68 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas: ");
        int batas = input.nextInt();
        for (int i = 0; i <= batas; i++) {
            System.err.println(i);            
        }        
    }    
}
