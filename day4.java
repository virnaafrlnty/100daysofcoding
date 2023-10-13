package pkg100dayss;

public class day4 {
    public static void main(String[] args) {
        int angka1 = 5;
        int angka2 = 2;
        double hasilPembagianDesimal = (double) angka1/angka2;
        int sisaPembagian = angka1 % angka2;
        
        //decrement
        angka1++;
        
        //increment
        angka2--;
        
        System.out.println("hasil pembagian (dengan desimal)    :" + hasilPembagianDesimal);
        System.out.println("sisa pembagian  :" +sisaPembagian);
        System.out.println("hasil increment (penambahan satu angka)    :" + angka1);
        System.out.println("hasil decrement (pengurangan satu angka)    :" + angka2);
        
        
        
    }
    
}
