package pkg100dayss;

public class day84 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("TV");
            }else if (i % 5 == 0) {
                System.out.println("Kulkas");
            }else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Sepeda Motor");
            }
        }
    }
}
