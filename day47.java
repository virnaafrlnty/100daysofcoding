package pkg100dayss;
import java.util.Scanner;

public class day47 {
    public static void main(String[] args) {
         java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Masukkan nama: ");
        
        String nama = sc.nextLine();
        for (int i = 0; i < nama.length(); i++) {
            System.out.println(nama.charAt(i));
            
        }
    }
}
