package pkg100dayss;

public class day89 {
    public static void main(String[] args) {
        int jumlah = 0;
        for (int i = 2; i <= 100; i++) {
            boolean prima = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }
            if (prima) {
                jumlah++;
            }
        }
        System.out.println("Jumlah bilangan prima dari 1 hingga 100 adalah: " + jumlah);
    }
}


