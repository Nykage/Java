/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaharjoitukset.newpackage;
import java.util.Collections;
import java.util.ArrayList;

/**
 *
 * @author piia.laine
 */
public class Ylimääräiset2 {
    
    public static void main(String[] args) {
    
        System.out.println("Type in a number:");
        int x = Reader.readInt();
        boolean even;
        
        if (x%2 == 0) {
            System.out.println("The number " + x + " is even.");
            even = true;
        } else {
            System.out.println("The entered number is not even.");
            even = false;
        }
        
    }
    
}
