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
public class Tehtävä8 {
    
    public static void main(String[] args) {
        System.out.println("Your points:");
        int points = Reader.readInt();
        
        if (points < 0 || points > 40) {
            System.out.println("Incorrect input.");
        } else if (points < 11) {
            System.out.println("Your grade is 0.");
        } else if (points < 21) {
            System.out.println("Your grade is 1.");
        } else if (points < 31) {
            System.out.println("Your grade is 2.");
        } else if (points < 41) {
            System.out.println("Your grade is 3.");
        }
    }

}
