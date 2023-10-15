package pkg100dayss;

public class day7 {
    public static void main(String[] args) {
        //deklarasi variabel
        int pilihan = 2; //variabel pilihan dengan nilai 2
        
        //struktur percabangan switch
        switch (pilihan) {
            // Kasus pertama
            case 1: //label CASE -> untuk mencocokkan nilai variabel yang diberikan dalam pernyataan switch
                System.out.println("Anda memilih opsi 1");
                break; // 'break' digunakan untuk menghentikan eksekusi setelah kasus ini terpenuhi
            case 2: // Kasus kedua
                System.out.println("Anda memilih opsi 2");
                break;
            case 3: // Kasus ketiga
                System.out.println("Anda memilih opsi 3");
                break;
            default: // kasus(case) yang akan dijalankan jika nilai pilihan tidak cocok dengan kasus di atas
                System.out.println("Pilihan tidak valid");
                break;
        }
    }
}
