package pkg100dayss;

public class day15 {
    int[][] angkaArray = {
        {1, 2, 3},
        {4, 5, 6},  // Membuat array 2D dengan 3 baris dan 3 kolom
        {7, 8, 9}
    };
    
    public static void main(String[] args) {
        // Membuat objek dari kelas Array2D
        day15 example = new day15();
        

        // Memanggil metode untuk mencetak elemen-elemen dari setiap array
        example.printIntArray(example.angkaArray); //membuat objek dari kelas 'day14' dengan pernyataan 'day14 example = new day14();' -> dilakukan untuk mengakses atribut dan metode dari kelas day14.
    }

    // Method untuk mencetak elemen-elemen array 2D
    public void printIntArray(int[][] array) {
        System.out.println("angkaArray:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
            
    /*
        Metode printIntArray digunakan untuk mencetak elemen-elemen dari array 2D
            Ini dilakukan dengan menggunakan dua perulangan bersarang (nested loops)
            Perulangan pertama (for luar) digunakan untuk mengakses baris-baris dalam array,
            sedangkan perulangan kedua (for dalam) digunakan untuk mengakses elemen-elemen dalam setiap baris
            Hasilnya adalah mencetak semua elemen dari array 2D ke layar dengan format yang sesuai
            */
        }
    }   
}

    

