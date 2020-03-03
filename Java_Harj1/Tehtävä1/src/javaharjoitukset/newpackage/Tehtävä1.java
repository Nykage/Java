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
public class Tehtävä1 {
    
    public static void main(String[] args) {
        // esimerkki Lukijan käytöstä:
        System.out.println("Nimi?");
        String nimi = Reader.readString();
        System.out.println("Ikä?");
        int ikä = Reader.readInt();
        System.out.println("Osoite?");
        String osoite = Reader.readString();
        System.out.println(
                "\n" + "Ikä = " + ikä + "\n" + "Nimi = " + nimi + "\n" + "Osoite = " + osoite
        );
    }
    
}
