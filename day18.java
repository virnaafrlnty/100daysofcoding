package pkg100dayss;
import java.util.Scanner;

public class day18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input nilai ujian dan jumlah absensi
        System.out.print("Masukkan nilai ujian (0-100): ");
        int nilaiUjian = input.nextInt();
        System.out.print("Masukkan jumlah absensi: ");
        int jumlahAbsensi = input.nextInt();

        // Inisialisasi variabel grade
        String grade;

        // Percabangan pertama: Apakah nilai ujian di atas 60?
        if (nilaiUjian > 60) {
            // Percabangan kedua: Apakah jumlah absensi kurang dari 5?
            if (jumlahAbsensi < 5) {
                grade = "A"; // Jika nilai ujian di atas 60 dan absensi kurang dari 5, grade A.
            } else {
                grade = "B"; // Jika nilai ujian di atas 60 tetapi absensi 5 atau lebih, grade B.
            }
        } else {
            // Jika nilai ujian 60 atau kurang, siswa gagal (tidak mendapat grade).
            grade = "Gagal";
        }

        // Menampilkan hasil grade
        System.out.println("Grade yang Anda dapatkan: " + grade);

        input.close();
    }
}
