package pkg100dayss;

import java.util.Arrays;

public class day97 {
    public static void main(String[] args) {
        int[] bilangan = {10, 20, 30, 40, 50};
        double rataRata = hitungRataRata(bilangan);
        System.out.println("Rata-rata dari bilangan: " + Arrays.toString(bilangan) + " adalah " + rataRata);
    }

    public static double hitungRataRata(int[] bilangan) {
        double total = 0;
        for (int bilanganItem : bilangan) {
            total += bilanganItem;
        }
        return total / bilangan.length;
    }
}
