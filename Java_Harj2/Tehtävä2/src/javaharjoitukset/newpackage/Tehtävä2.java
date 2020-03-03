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
public class Tehtävä2 {
    
    public static void main(String[] args) {
        int i;
        System.out.println("Write a text:");
        String text = Reader.readString();
        System.out.println("How many times do you want to repeat the text:");
        int count = Reader.readInt();
        System.out.println("\n");
        for (i = 0; i < count; i++) {
            System.out.println(text);
        }
    }
    
}
