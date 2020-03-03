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
        int j;
        int[] table = new int[20];
        int[] table2 = new int[20];
        for (j = 0; j < table.length; j++) {
            table[j] = (int) (10*Math.random());
            table2[j] = (int) (10*Math.random());
        }
        for (i = 0; i < table.length; i++) {
            //Table 1
            System.out.println(
                    "indeksillä " + (i+1) + " taulun1 arvo = " + table[i]
            );
            //Table 2
            System.out.println(
                    "indeksillä " + (19-i+1) + " taulun2 arvo = " + table2[19-i]
            );
            System.out.println("\n");
        }
    }
    
}
