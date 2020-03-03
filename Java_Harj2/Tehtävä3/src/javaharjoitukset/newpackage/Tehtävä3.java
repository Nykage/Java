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
public class Tehtävä3 {
    
    public static void main(String[] args) {
        int i;
        System.out.println("Write a number:");
        int number = Reader.readInt();
        System.out.println("\n" + "The next ten numbers are:");
        for (i = 0; i < 10; i++) {
            number++;
            System.out.println(number);
        }
    }
    
}
