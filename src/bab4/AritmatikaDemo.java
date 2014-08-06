package bab4;

public class AritmatikaDemo
{
    public static void main(String args[]){
        // sedikit angka
        int i = 37;
        int j = 42;
        double x = 27.475;
        double y = 7.22;
        
        System.out.println("Variable values...");
        System.out.println(" i = " + i);
        System.out.println(" j = " + j);
        System.out.println(" x = " + x);
        System.out.println(" y = " + y);
        
        // penjumlahan angka
        System.out.println("Penambahan Angka");
        System.out.println(" i + j = " + (i + j));      // 79
        System.out.println(" x + y = " + (x + y));      // 34.695
        
        // pengurangan angka
        System.out.println("Pengurangan Angka");
        System.out.println(" i - j = " + (i - j));      //
        System.out.println(" x - y = " + (x - y));      //
        
        // perkalian angka
        System.out.println("Perkalian Angka");
        System.out.println(" i * j = " + (i * j));
        System.out.println(" x * y = " + (x * y));
        
        // pembagian angka
        System.out.println("Pembagian Angka");
        System.out.println(" i / j = " + (i / j));
        System.out.println(" x / y = " + (x / y));
        
        // menghitung hasil modulus
        // dari pembagian
        System.out.println("Computing the remainder...");
        System.out.println(" i % j = " + (i % j));
        System.out.println(" x % y = " + (x % y));
        
        // tipe penggabungan
        System.out.println("Mixing tipes...");
        System.out.println(" j + y = " + (j + y));
        System.out.println(" i * x = " + (i * x));
    }
}
