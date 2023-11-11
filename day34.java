package pkg100dayss;
import java.util.Scanner;

public class day34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka pertama:");
        int a = scanner.nextInt();
        
        System.out.print("Masukkan angka kedua:");
        int b = scanner.nextInt();
        
        int c = a+b;
        
        if (c % 2 == 0){
            System.out.println(c +" "+"adalah bilangan genap");
        }else{
            System.out.println(c +" " + "adalah bilangan ganjil");
        }
    }
    
}
