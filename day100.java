package pkg100dayss;

import java.util.Scanner;
import java.util.Calendar;

public class day100 {

    public static void main(String[] args) {
        int tahunLahir;
        int tahunSekarang;
        int umur;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tahun lahir: ");
        tahunLahir = Integer.parseInt(input.nextLine());
        Calendar calendar = Calendar.getInstance();
        tahunSekarang = calendar.get(Calendar.YEAR);
        umur = tahunSekarang - tahunLahir;
        System.out.println("Umur Anda adalah " + umur + " tahun.");
    }
}
