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
public class RerataTigaAngka {
    
    public static void main(String[] args){
        
        // deklarasi variabel
        int number1 = 10;
        int number2 = 20;
        int number3 = 45;
        int rerata = 0;
        
        // hitung rerata
        rerata = (number1 + number2 + number3) / 3;
        
        // print nilai number & rerata
        System.out.println("number 1 = " + number1);
        System.out.println("number 2 = " + number2);
        System.out.println("number 3 = " + number3);
        System.out.println("Rata-rata = " + rerata);
    }
}
