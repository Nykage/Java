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
      
    System.out.println("Type in a text that you want to encrypt:");
    String salattava = Reader.readString();
    String salattu = "";
    for (int i = 0; i < salattava.length(); i++) {
        char merkki = salattava.charAt(i);
	merkki++;
	salattu = salattu + merkki;
    }
		
    System.out.println("Salattu: " + salattu);
    }
  
}
