package pkg100dayss;

import java.util.Scanner;

public class day69 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan satu kata: ");
        String kata = input.nextLine();
        int jumlahVokal = 0;
        
        for (int i = 0; i < kata.length(); i++) {
            char huruf = Character.toLowerCase(kata.charAt(i));
            
            if (huruf == 'a' || huruf == 'i' || huruf == 'u' || huruf == 'e' || huruf == 'o'){ {
                jumlahVokal++;
            }
        }
        }
        System.out.println("Jumlah huruf vokal dalam kata " + kata + " adalah: " + jumlahVokal);
    }    
}
