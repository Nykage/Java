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
public class Tehtävä1 {
    
    public static void main(String[] args) {
        System.out.println("What is the biggest city in Pirkanmaa?");
        String answer = Reader.readString();
        String answer2 = answer.toUpperCase();
        while (!"TAMPERE".equals(answer2)) {
            System.out.println("Wrong. Please write the correct answer:");
            answer = Reader.readString();
            answer2 = answer.toUpperCase();
        }
        System.out.println("Correct!");
    }
}
