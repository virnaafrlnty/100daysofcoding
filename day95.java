package pkg100dayss;

public class day95 {
    public static void main(String[] args) {
        int panjang = 10;
        int lebar = 20;
        int luas = hitungLuasPersegiPanjang(panjang, lebar);
        System.out.println("Luas persegi panjang adalah: " + luas);
    }
    public static int hitungLuasPersegiPanjang(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }
}
