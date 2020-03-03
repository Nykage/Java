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
        System.out.println("First Word:");
        String a = Reader.readString();
        System.out.println("Second Word:");
        String b = Reader.readString();
        char[] c1;
        c1 = a.toCharArray();
        char[] c2;
        c2 = b.toCharArray();
        System.out.println("\nCompare:");
        int i;
        if (c1.length == c2.length) {
            for (i = 0; i < c1.length; i++) {
                if (c1[i] == c2[i]) {
                    System.out.println(c1[i]);
                } else {
                    System.out.println("*");
                    System.out.println("\nWords are different!");
                }
            }
        } else {
            System.out.println("\nWords are not the same length!");
        }
    }
    
}
