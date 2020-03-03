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
        System.out.println("Please type in a password:");
        String answer = Reader.readString();
        int i;
        for (i = 0; !"1qwert2".equals(answer) && i < 2; i++) {
            System.out.println("Wrong. Please write the correct password:");
            answer = Reader.readString();
        }
        if (!"1qwert2".equals(answer) && i == 2) {
            System.out.println("Wrong. Your account is now locked.");
        } else {
            System.out.println("Correct!");
        }
    }
    
}
