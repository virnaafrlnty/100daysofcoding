package pkg100dayss;

import java.util.Scanner;

public class day78 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan username: ");
        String usernameInput = input.nextLine();
        System.out.print("Masukkan password: ");
        String passwordInput = input.nextLine();
        
        String username = "virna123";
        String password = "12345678";
        
        if (usernameInput.equals(username)&&passwordInput.equals(password)) {
            System.out.println("Login berhasil.");
        }else{
            System.out.println("Lagin gagal.");
        }
    }
    
}

