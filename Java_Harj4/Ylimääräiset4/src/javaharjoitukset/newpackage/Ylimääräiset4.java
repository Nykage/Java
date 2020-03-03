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
public class Ylimääräiset4 {
    
    public static void main(String[] args) {
    
        System.out.println("Type in a word:");
        String x = Reader.readString();
        
        char[] x_char;
        x_char = x.toCharArray();
        
        if (Character.isLowerCase(x_char[0])) {
            System.out.println(x.toUpperCase());
        } else {
            System.out.println(x.toLowerCase());
        }
        
    }
    
}
