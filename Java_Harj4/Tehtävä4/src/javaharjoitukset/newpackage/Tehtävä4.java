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
        int k;
        int count = 0;
        int[] user = new int[7];
        int[] right = new int[7];
        //User Input
        for (j = 0; j < user.length; j++) {
            System.out.println("Number " + (j+1) + ":");
            user[j] = Reader.readInt();
        }
        //Right Row
        for (j = 0; j < right.length; j++) {
            right[j] = (int) (9*Math.random());
        }
        //Comparing
        System.out.println("\n");
        for (k = 0; k < user.length; k++) {
            if (user[k] == right[k]) {
                count++;
            }
        }
        System.out.println("Käyttäjän rivi : " + user[0] + user[1] + user[2] + user[3] + user[4] + user[5] + user[6]);
        System.out.println("Oikea rivi     : " + right[0] + right[1] + right[2] + right[3] + right[4] + right[5] + right[6]);
        System.out.println("Oikein oli     : " + count);
    }
    
}
