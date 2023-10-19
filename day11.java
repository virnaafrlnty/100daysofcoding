
package pkg100dayss;
/*
Membuat game sederhana di mana pengguna harus menebak kata yang benar
Program meminta pengguna untuk menebak kata dan membandingkan tebakan dengan kata benar 
Jika tebakan sesuai dengan kata benar, pengguna mendapat jawaban yang benar.
Penggunaan .equalsIgnoreCase digunakan untuk memungkinkan jawaban pengguna yang tidak bersifat case-sensitive.
*/
// Mengimpor kelas Scanner dari paket java.util
import java.util.Scanner;

// Deklarasi dan definisi kelas day11
public class day11 {
    public static void main(String[] args) {
        // Membuat objek Scanner dengan nama 'input' untuk menerima inputan
        Scanner input = new Scanner(System.in);
        
        // Kata benar yang harus ditebak
        String kataBenar = "sepeda";

        // Variabel untuk menyimpan tebakan pengguna
        String tebakan;

        // Menampilkan pesan kepada pengguna untuk menebak kata
        System.out.print("Tebak kata (clue: alat transportasi): ");

        // Menerima input dari pengguna dan menyimpannya di variabel 'tebakan'
        tebakan = input.nextLine();//metode yang digunakan untuk menerima input teks dari pengguna/ mengambil baris teks yang dimasukkan pengguna melalui keyboard

        // Memeriksa apakah tebakan pengguna sama dengan kata benar, tanpa memperhatikan huruf besar atau kecil
        if (tebakan.equalsIgnoreCase(kataBenar)) {
            // Jika benar, mencetak pesan "Selamat, Anda benar!"
            System.out.println("Selamat, Anda benar!");
        } else {
            // Jika salah, mencetak pesan "Maaf, tebakan Anda salah."
            System.out.println("Maaf, tebakan Anda salah.");
        }

        // Menutup objek Scanner setelah penggunaan
        input.close();
    }
}
