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
public class Tehtävä4 {
    
    public static void main(String[] args) {
        System.out.println("Anna kokonaisluku:");
        int luku = Reader.readInt();
        switch (luku) {
            case 1:
                System.out.println("Syotit luvun yksi.");
                break;
            case 2:
                System.out.println("Syotit luvun kaksi.");
                break;
            case 3:
                System.out.println("Syotit luvun kolme.");
                break;
            default:
                System.out.println("Muu luku.");
                break;
        }
    }
    
}
