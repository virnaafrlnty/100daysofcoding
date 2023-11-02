package pkg100dayss;

public class day24 {
    public static void main(String[] args) {
        // Mendeklarasikan array 1D dengan tipe data integer
        int[] angka = new int[5];

        // Menginisialisasi nilai elemen-elemen array
        angka[0] = 10;
        angka[1] = 20;
        angka[2] = 30;
        angka[3] = 40;
        angka[4] = 50;

        // Menampilkan elemen-elemen array
        System.out.println("Isi dari array angka:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Angka ke-" + i + ": " + angka[i]);
        }
    }
}

