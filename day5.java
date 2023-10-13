package pkg100dayss;

public class day5 {
    public static void main(String[] args) {
        
        /*mengimplementasikan rumus matematika
        langkah-langkah:
        1. deklarasikan variabel
        2. impelemtasi rumus
        3. mencetak hasil
        */
        
        //mencari LUAS persegi, lingkaran, segitiga
        //deklarasi vriabel
        int panjangPersegi = 10; //bisa memakai tipe data double jika nilainya desimal (bilangan pecahan)
        int lebarPersegi = 13;
        
        double radius = 5.0; //variabel untuk menyimpan jari-jari lingkaran
        double pi = 3.14159; //nilai  π
        
        int tinggiSegitiga = 20; //variabel untuk menyimpan tinggi  dari segiiga sama kaki
        int alasSegitiga = 40; //variabel untuk menyimpan nilai alas
        
        //implementasi rumus
        int luasPersegi = panjangPersegi * lebarPersegi; //rumus mencari luas persegi (luas = panjang*lebar)
        double luasLingkaran = pi * (radius * radius); //rumus menghitung luas lingkaran 
        int luasSegitiga = (int)((1.0/2)*(alasSegitiga * tinggiSegitiga)); //rumus mencari luas segitiga sama kaki
        
        //mencetak hasil
        System.out.println("LUAS PERSEGI");
        System.out.println("panjang :" + panjangPersegi);
        System.out.println("lebar   :" + lebarPersegi);
        System.out.println("rumus  : P*L");
        System.out.println("luas dari persegi adalah    :" + luasPersegi);
        
        System.out.println("------------------------------------------");
        
        System.out.println("LUAS LINGKARAN");
        System.out.println("jari-jari   :" + radius);
        System.out.println("pi   :"+ pi);
        System.out.println("rumus : pi * r^2 ");
        System.out.println("luas dari lingkaran adalah  :" + luasLingkaran);      
       
        System.out.println("------------------------------------------");
        
        System.out.println("LUAS SEGITIGA");
        System.out.println("tinggi   :" + tinggiSegitiga);
        System.out.println("alas   :" + alasSegitiga);
        System.out.println("rumus : 1/2 * a * t ");
        System.out.println("luas dari segitiga adalah  :" + luasSegitiga);       
    }
}
