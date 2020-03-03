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
        System.out.println("Your age:");
        int age = Reader.readInt();
        System.out.println("Your monthly salary:");
        int salary = Reader.readInt();
        
        if (age > 39 && salary > 9999) {
            System.out.println("Rich oldtimer.");
        } else if (age > 39 && salary < 1301) {
            System.out.println("Poor oldtimer.");
        } else if (age < 30 && salary > 9999) {
            System.out.println("Rich youngster.");
        } else if (age < 30 && salary < 1301) {
            System.out.println("Poor youngster.");
        } else {
            System.out.println("Doing good.");
        }
    }
    
}
