package pkg100dayss;

import java.util.Scanner;

public class day62 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat datang di Kalkulator BMI!");
        System.out.println("--------------------------------");
        System.out.print("Masukkan berat badan (kg): ");
        double bb = input.nextDouble();
        System.out.print("Masukkan tinggi badan (m): ");
        double tb = input.nextDouble();
        double BMI = bb / (tb * tb);
        System.out.println("BMI Anda: " + BMI);

        if (BMI < 18.5) {
            System.out.println("Kategori BMI: Berat badan kurang.");

        } else if (BMI >= 18.5 && BMI < 24.9) {
            System.out.println("Kategori BMI: Berat badan normal.");

        } else if (BMI >= 25 && BMI < 29.9) {
            System.out.println("Kategori BMI: Berat badan berlebih.");

        } else {
            System.out.println("Kategori BMI: Obesitas");
        }
    }
}
