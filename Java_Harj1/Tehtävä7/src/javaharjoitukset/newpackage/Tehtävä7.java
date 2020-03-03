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
        System.out.println("Are you old? true or false:");
        boolean old = Reader.readBoolean();
        System.out.println("Are you rich? true or false:");
        boolean rich = Reader.readBoolean();
        
        if (old == true && rich == true) {
            System.out.println("Rich oldtimer.");
        } else if (old == true && rich == false) {
            System.out.println("Poor oldtimer.");
        } else if (old == false && rich == true) {
            System.out.println("Rich youngster.");
        } else if (old == false && rich == false) {
            System.out.println("Poor youngster.");
        } else {
            System.out.println("Doing good.");
        }
    }
    
}
