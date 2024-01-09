package pkg100dayss;

public class day94 {
    public static int hitungLuasSegitiga(int alas, int tinggi) {
    int luas = alas * tinggi / 2;
    return luas;
    }
    public static void main(String[] args) {
        int luas = hitungLuasSegitiga(10, 20);
        System.out.println("Luas segitiga adalah: " + luas);
    }
}
