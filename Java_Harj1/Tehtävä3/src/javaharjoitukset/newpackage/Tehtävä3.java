/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaharjoitukset.newpackage;

import static java.lang.Math.*;


/**
 *
 * @author piia.laine
 */
public class Tehtävä3 {
    
    public static void main(String[] args) {
        System.out.println("Radius?");
        int radius = Reader.readInt();
        int surface = (int) (PI*radius*radius);
        System.out.println(
                "\n" + "The surface of the circle is " + surface + "m^2."
        );
    }
    
}
