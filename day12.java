package pkg100dayss;

public class day12 {
    public static void main(String[] args) {
        // mendefinisikan dan menginisialisasikan array 1D dengan tipe data yang berbeda
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};

        // Mencetak elemen-elemen dari msaing-masing array
        System.out.println("intArray:");
        for (int num : intArray) { //perulangan for-each
            System.out.print(num + " ");
        }

        System.out.println("\ndoubleArray:");
        for (double num : doubleArray) { //deklarasi variabel 'num' yang digunakan sebagai variabel iterasi. 
            System.out.print(num + " ");
        }

        System.out.println("\ncharArray:");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }

        System.out.println("\nfloatArray:");
        for (float num : floatArray) {
            System.out.print(num + " ");
        }
    }
}

