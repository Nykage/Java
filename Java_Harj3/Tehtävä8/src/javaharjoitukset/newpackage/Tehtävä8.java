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
        int i;
        int j;
        int[] codes;
        codes = new int[4];
        String[] products;
        products = new String[4];
        codes[0] = 101;
        codes[1] = 102;
        codes[2] = 103;
        codes[3] = 104;
        products[0] = "Product 1";
        products[1] = "Product 2";
        products[2] = "Product 3";
        products[3] = "Product 4";
        System.out.println(codes[0] + " " + codes[1] + " " + codes[2] + " " + codes[3]);
        System.out.println("Please write one of these product codes:");
        j = Reader.readInt();
        for (i = 0; i < codes.length; i++) {
            if (j == codes[i]) {
                System.out.println("You chose " + products[i]);
            }
        }
    
    }
}
