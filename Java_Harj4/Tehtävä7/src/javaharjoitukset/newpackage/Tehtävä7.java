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
        int i;
        String j;
        double[] codes;
        codes = new double[5];
        String[] products;
        products = new String[5];
        codes[0] = 3.95;
        codes[1] = 1.25;
        codes[2] = 0.95;
        codes[3] = 1.95;
        codes[4] = 2.5;
        products[0] = "Omena";
        products[1] = "Peruna";
        products[2] = "Sipuli";
        products[3] = "Kurkku";
        products[4] = "Tomaatti";
        System.out.println(products[0] + " " + products[1] + " " + products[2] + " " + products[3] + " " + products[4]);
        System.out.println("Please write one of these product codes:");
        j = Reader.readString();
        for (i = 0; i < products.length; i++) {
            if (j.equals(products[i])) {
                System.out.println("You chose " + codes[i]);
                i = 0;
                j = Reader.readString();
            }
        }
    }
    
}
