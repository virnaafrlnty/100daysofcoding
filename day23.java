package pkg100dayss;
import java.util.Scanner;

public class day23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai Anda: ");
        int nilai = input.nextInt();

        char grade;

        if (nilai >= 90) {
            grade = 'A';
        } else if (nilai >= 80) {
            grade = 'B';
        } else if (nilai >= 70) {
            grade = 'C';
        } else if (nilai >= 60) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        System.out.println("Nilai/Grade Anda: " + grade);

        input.close();
    }
}

