package pkg100dayss;
import java.util.Scanner;


public class day32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai x:");
        int x = scan.nextInt();
        
        System.out.print("Masukkan nilai y:");
        int y = scan.nextInt();
        
        int q;
        
        int p = x + y;
            if (p >= 4){
                q = x*y;
            }else{
                q = x/y;
            }
            System.out.println("hasil:" + q);
        
    }
    
}


    

