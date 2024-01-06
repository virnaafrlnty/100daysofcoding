package pkg100dayss;

public class day91 {
    public static void main(String[] args) {
        int baris = 5;

        for (int i = 1; i <= baris; i++) {
            // Mencetak spasi
            for (int j = 1; j <= baris - i; j++) {
                System.out.print(" ");
            }
            // Mencetak bintang
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

