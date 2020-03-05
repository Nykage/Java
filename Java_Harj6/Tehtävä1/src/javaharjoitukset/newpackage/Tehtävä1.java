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
    
      System.out.println("How many stars do you want?");
      piirraTahtia(Reader.readInt());
      
  }
  
  private static void piirraTahtia(int n) {
      System.out.println("Number of stars: " + n);
  }
  
}
