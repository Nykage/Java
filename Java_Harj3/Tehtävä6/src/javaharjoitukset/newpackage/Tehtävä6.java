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
public class Tehtävä6 {
    
    public static void main(String[] args) {
        int i;
        String[] table;
        table = new String[7];
        table[0] = "ma";
        table[1] = "ti";
        table[2] = "ke";
        table[3] = "to";
        table[4] = "pe";
        table[5] = "la";
        table[6] = "su";
        System.out.println("Write a number between 0 and 6:");
        System.out.println(
            table[Reader.readInt()]
        );
    }
    
}
