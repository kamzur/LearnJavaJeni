/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bab4.latihanjeni;

/**
 *
 * @author yanwar
 */
public class NilaiTerbesar {
    
    public static void main(String[] args){
        // deklarasi variabel
        int number1 = 10;
        int number2 = 23;
        int number3 = 5;
        int nilaiTinggi = 0;

        // operasi pencarian nilai tertinggi
        nilaiTinggi = (number1 > number2)? number1:number2;
        nilaiTinggi = (nilaiTinggi > number3)? nilaiTinggi:number3;

        // print number & hasil nilai tertinggi
        System.out.println("number 1 = " + number1);
        System.out.println("number 2 = " + number2);
        System.out.println("number 3 = " + number3);
        System.out.println("Nilai tertingginya adalah angka = " + nilaiTinggi);
    }
}
