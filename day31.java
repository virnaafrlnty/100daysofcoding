package pkg100dayss;

public class day31 {
    public static void main(String[] args) {
        // Mendeklarasikan array 1D dengan tipe data double dan sizenya 3
        double [] angka = new double[10];

        // Menginisialisasi nilai elemen-elemen array
        angka[0] = 1;
        angka[1] = 2;
        angka[2] = 3;
       

        // Menampilkan elemen-elemen array
        System.out.println("Isi dari array:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("index ke-" + i + ": " + angka[i]);
        }
    }
}

