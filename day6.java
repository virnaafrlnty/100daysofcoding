package pkg100dayss;

public class day6 {
    public static void main(String[] args) {
       //deklarasi variabel
        int angka = 19; //variabel angka yang menyimpan nilai 20
        
        //pernyataan percabangan (if, else-if, dan else)
        if (angka > 20){
            System.out.println("Angka lebih dari 20");
        } else if (angka == 20 ){
            System.out.println("Angka lebih dari sama dengan 20");
        }else {
            System.out.println("Angka kurang dari 20");
        }
       /*
        jika kondisi (pernyataan) pertama memenuhi (benar) maka dia akan dieksekusi
        jika tidak maka akan lanjut ke kondisi selanjutnya (else-if)
        begitupun dengan kondisi else, dia akan dieksekusi jika 
        kondisi sebelumnya tidak ada yang memenuhi
        */
        
       //perulangan (for)
        for (int i = 0; i < 5; i++){
            System.out.println("Iterasi ke-" +i);
        }
        /*
        pengendalian yang digunakan untuk mengulang
        sejumlah pernyataan tertentu (mengulang sebanyak 5 kali)
        
        inisialisai (int i = 0) -> mendeklarasikan variabel i dengan nilai awal 0
        digunakan sebagai penghitung untuk mengontrol BERAPA KALI PERULANGAN DIJALANKAN
        
        kondisi (i < 5) -> selama kondisi benar (selama  kurang dari 5), maka
        perulangan akan terus berjalan
        
        ekspresi iterasi (i++) -> berarti tambahkan 1 e nilai i setelah iterasi saat ini selesai
        
        badan perulangan (System.out.println("Iterasi ke-" +i)) -> blok pernyataan yang akan
        dijalankan dalam setiap iterasi perulangan
        */
    }
    
}
