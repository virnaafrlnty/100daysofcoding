package pkg100dayss;

public class day96 {
    public static void tampilkanBilanganGanjil(int awal, int akhir) {
        for (int i = awal; i <= akhir; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        tampilkanBilanganGanjil(1, 100);
    }
}
