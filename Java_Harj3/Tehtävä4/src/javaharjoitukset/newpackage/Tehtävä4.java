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
        int j;
        int[] table = new int[5];
        //User Input
        for (j = 0; j < table.length; j++) {
            System.out.println("Please type in a number:");
            table[j] = Reader.readInt();
        }
        //Display Table
        System.out.println("\n");
        for (i = 0; i < table.length; i++) {
            System.out.println(
                    "Number" + (i+1) + " = " + table[i]
            );
        }
    }
    
}
