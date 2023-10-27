/*
MELATIH LOGIKA
Program ini meminta kita untuk memasukkan sebuah nilai 1-10.
Kemudian, program melakukan dua tingkat percabangan.
Pertama, program memeriksa apakah nilai berada dalam rentang 1-10 menggunakan operator logika && (dan).
Jika nilai berada dalam rentang tersebut, program akan memeriksa apakah nilai tersebut genap atau ganjil dengan operator modulus (%).
Hasil dari pemeriksaan akan dicetak ke layar.
Jika nilai tidak berada dalam rentang 1-10, program akan mengeluarkan pesan bahwa nilai tidak valid.
*/
package pkg100dayss;
import java.util.Scanner;

public class day19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai (1-10): ");
        int nilai = input.nextInt();

        if (nilai >= 1 && nilai <= 10) {
            if (nilai % 2 == 0) {
                System.out.println("Nilai " + nilai + " adalah angka genap.");
            } else {
                System.out.println("Nilai " + nilai + " adalah angka ganjil.");
            }
        } else {
            System.out.println("Nilai tidak valid. Harus antara 1 hingga 10.");
        }

        input.close();
    }
}



