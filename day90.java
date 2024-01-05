package pkg100dayss;

public class day90 {
    public static void main(String[] args) {
        int [] bilangan = {1, 2, 3, 4, 5};
        int terbesar = bilangan[0];
        
        for (int i = 0; i < bilangan.length; i++){
            if (bilangan[i] > terbesar) {
                terbesar = bilangan[i];
            }   
        }
        System.out.println("Bilangan terbesar adalah: " + terbesar);
    }
}
