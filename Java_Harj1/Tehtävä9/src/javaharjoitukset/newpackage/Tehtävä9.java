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
public class Tehtävä9 {
    
    public static void main(String[] args) {
        System.out.println("First number:");
        int a = Reader.readInt();
        System.out.println("Second number:");
        int b = Reader.readInt();
        System.out.println("Write 'true' for the larger number, write 'false' for the smaller number:");
        boolean larger = Reader.readBoolean();

        if (larger == true) {
            if (a > b) {
                System.out.println("\n" + a);
            } else if (a < b) {
                System.out.println("\n" + b);
            } else {
                System.out.println("\n" + "The numbers are the same.");
            }
        } else if (larger == false) {
            if (a > b) {
                System.out.println("\n" + b);
            } else if (a < b) {
                System.out.println("\n" + a);
            } else {
                System.out.println("\n" + "The numbers are the same.");
            }
        }
    }
    
}
