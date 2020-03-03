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
public class Tehtävä4 {
    
    public static void main(String[] args) {
        int i;
        System.out.println("Write a number between 1 and 5:");
        int number = Reader.readInt();
        for (i = number; i < 1 || i > 5;) {
            System.out.println("Wrong. Number between 1 and 5:");
            i = Reader.readInt();
        }
    }
    
}
