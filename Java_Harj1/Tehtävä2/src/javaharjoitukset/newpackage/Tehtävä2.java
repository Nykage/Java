/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaharjoitukset.newpackage;

import static java.lang.Math.round;


/**
 *
 * @author piia.laine
 */
public class Tehtävä2 {
    
    public static void main(String[] args) {
        System.out.println("How much money?");
        int money = Reader.readInt();
        double gasprice = 1.6;
        double gas = money/gasprice;
        System.out.println(
                "\n" + "You get " + round(gas) + " litres of gas."
        );
    }
    
}
