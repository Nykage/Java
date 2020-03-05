/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaharjoitukset.newpackage;
import java.lang.Math;

/**
 *
 * @author piia.laine
 */
public class Tehtävä3 {
    
  public static void main(String[] args) {
    
      System.out.println("Write a minimum number for your range:");
      int min = Reader.readInt();
      System.out.println("Write a maximum number for your range:");
      int max = Reader.readInt();
      
      int randomNumber = drawRandom(min, max);
      System.out.println("Your random number between " + min + " and " + max + " is:");
      System.out.println(randomNumber);
      
  }
  
  private static int drawRandom(int min, int max) {
      int range = max - min + 1;
      int randomNumber = (int)(Math.random() * range) + min;
      return randomNumber;
  }
  
}
