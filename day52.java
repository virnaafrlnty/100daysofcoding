package pkg100dayss;

import java.util.Scanner;

public class day52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat paket: ");
        int berat = input.nextInt();

        System.out.print("Masukkan jenis pengiriman (lokal/internasional): ");
        String jenisPengiriman = input.next();

        int biayaPengiriman = 0;

        if (berat < 1) {
            biayaPengiriman = 10000;
        } else if (berat >= 1 && berat <= 3) {
            biayaPengiriman = 20000;
        } else if (berat > 3) {
            biayaPengiriman = 30000;
        }

        // Tambahan biaya untuk pengiriman internasional
        if (jenisPengiriman.equalsIgnoreCase("internasional")) {
            biayaPengiriman += 15000;
        }

        System.out.println("Biaya pengiriman adalah: Rp. " + biayaPengiriman);
    }
}
