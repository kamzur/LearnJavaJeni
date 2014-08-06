/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jeni;

/**
 *
 * @author yanwar
 */
public class TampilNilaiBesar {
    
    public static void main(String args[]){
        
        int number1 = 10;
        int number2 = 23;
        int number3 = 5;
        int nilai_tertinggi = 0;
        
        
        // operasi pertama
        nilai_tertinggi = (number1>number2)? number1:number2;
        
        // operasi kedua
        nilai_tertinggi = (nilai_tertinggi > number3)? nilai_tertinggi:number3;
                
        System.out.println("number 1 = " + number1);
        System.out.println("number 2 = " + number2);
        System.out.println("number 3 = " + number3);
        System.out.println("Nilai tertingginya adalah angka = " + 
                nilai_tertinggi);
    }
}
