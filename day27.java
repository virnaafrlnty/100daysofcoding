package pkg100dayss;

public class day27 {
    public static void main(String[] args) {
        // Mendeklarasikan array 1D dengan tipe data String dan ukuran 5
        String [] buah = new String[5];

        // Menginisialisasi nilai elemen-elemen array
        buah[0] = "apel";
        buah[1] = "semangka";
        buah[2] = "durian";
        buah[3] = "kiwi";
        buah[4] = "alpukat";

        // Menampilkan elemen-elemen array
        System.out.println("Isi dari array buah:");
        for (int i = 0; i < buah.length; i++) {
            System.out.println("buah ke-" + i + ": " + buah[i]);
        }
    }
}

