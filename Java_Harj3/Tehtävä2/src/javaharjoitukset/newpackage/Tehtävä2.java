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
        int j;
        int[] table = new int[20];
        for (j = 0; j < table.length; j++) {
            table[j] = (int) (10*Math.random());
        }
        for (i = 0; i < table.length; i++) {
            System.out.println(
                    "indeksillä " + (i+1) + " taulun arvo = " + table[i]
            );
        }
        int sum = 0;
        for (i = 0; i < table.length; i++) {
            sum += table[i];
        }
        int average = sum/20;
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }
    
}
