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
public class Ylimääräiset3 {
    
    public static void main(String[] args) {
    
        System.out.println("Type in a number:");
        int x = Reader.readInt();
        boolean odd;
        
        if (x%2 != 0) {
            System.out.println("The number " + x + " is odd.");
            odd = true;
        } else {
            System.out.println("The number " + x + " is not odd.");
            odd = false;
        }
        
    }
    
}
