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
public class Tehtävä2 {
    
    public static void main(String[] args) {
        System.out.println("Anna etunimi:");
        String etunimi = Reader.readString();
        System.out.println("Anna sukunimi:");
        String sukunimi = Reader.readString();
        System.out.println("Anna puhelin:");
        String puhelin = Reader.readString();
        System.out.println("\n");
        
        //INSERT
        System.out.println("INSERT INTO asiakkaat (etunimi,sukunimi,puhelin)");
        System.out.println("VALUES ('" + etunimi + "','" + sukunimi + "','" + puhelin + "');");
        System.out.println("\n");
        //SELECT
        System.out.println("SELECT puhelin FROM asiakkaat");
        System.out.println("WHERE ETUNIMI='" + etunimi + "' AND SUKUNIMI='" + sukunimi + "';");
        
    }
    
}
