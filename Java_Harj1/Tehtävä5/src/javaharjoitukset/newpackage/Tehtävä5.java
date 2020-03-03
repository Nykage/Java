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
public class Tehtävä5 {
    
    public static void main(String[] args) {
        System.out.println("Anna luku a:");
        int a = Reader.readInt();
        System.out.println("Anna luku b:");
        int b = Reader.readInt();
        int c;
        c = b;
        b = a;
        a = c;
        System.out.println(
                "(Vaihdan lukujen paikat)" + "\n" + "Luku a: " + a + "\n" + "Luku b: " + b
        );
    }
    
}
