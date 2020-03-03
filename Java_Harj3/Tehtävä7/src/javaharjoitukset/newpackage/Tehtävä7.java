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
public class Tehtävä7 {
    
    public static void main(String[] args) {
        System.out.println("Write a Word:");
        String a = Reader.readString();
        char[] c;
        c = a.toCharArray();
        System.out.println("\n");
        int i;
        for (i = 0; i < c.length; i++) {
            System.out.println(
                    c[c.length-i-1]
            );
        }
    }
    
}
