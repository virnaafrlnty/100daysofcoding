/*
collab operator LOGIKA dan operator PERBANDINGAN 
dalam sebuah PERCABANGAN
*/

package pkg100dayss;
import java.util.Scanner;

public class day9 {
    public static void main(String[] args) {
        //buat dulu objek Scanner untuk menerima input dari user
        Scanner input = new Scanner(System.in);
        
        //meminta user menginputkan tahun
        System.out.println("Masukkan tahun: ");
        int tahun = input.nextInt();
        
        //mari cek apakah tahun yang diinputkan sebelumnya adalah tahun kabisat atau bukan?
        boolean iniKabisat = (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);
        /*
        sebuah kondisi/pernyataan -> menggunakan variabel dengan nama 'iniKabisat' dengan tipe data 'boolean'
        'tahun % 4 == 0' -> memeriksa apakah 'tahun' dapat dibagi 4?
        '&&' -> operator LOGIKA 'dan/AND' -> untuk menghubungkan dua kondisi
        'tahun % 100 != 0' ->memeriksa apakah 'tahun' TIDAK dapat dibagi oleh 100?
        '||' -> operator LOGIKA 'atau/OR' -> untuk menghubungkan dua kondisi
        'tahun % 400 == 0' ->memeriksa apakah 'tahun' dapat dibagi oleh 400 ?
        
        jika semua kondisi atau salah satunya terpenuhi, maka akan percabangan/pernyataan pertama akan dieksekusi
        atau maka akan dicetak "ternyata tahun kabisat"
        jika tidak ada yang memenuhi, maka kondisi else akan dieksekusi.
        */
        
        if (iniKabisat){
            System.out.println(tahun + " ternyata tahun kabisat");
        }else{
            System.out.println( tahun + " bukan tahun kabisat deng");
        }
        
        //penutup objek scanner
        input.close();
        
    }
    
}
