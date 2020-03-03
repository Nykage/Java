/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaharjoitukset.newpackage;

/**
 *
 * @author piia.laine
 */
public class Tehtävä5 {
    
    public static void main(String[] args) {
        int i;
        System.out.println("Write a number:");
        int number = Reader.readInt();
        int count = 1;
        int n = 0;
        for (i = number; i != -1;) {
            n = n + i;
            System.out.println("Sum = " + n + " Count = " + count);
            System.out.println("Write another number:");
            i = Reader.readInt();
            count++;
        }
        System.out.println("-1 is the correct answer.");
    }
    
}
