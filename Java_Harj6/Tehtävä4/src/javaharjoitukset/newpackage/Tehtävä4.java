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
public class Tehtävä4 {
    
  public static void main(String[] args) {
    
      System.out.println("Write the first number:");
      int n1 = Reader.readInt();
      System.out.println("Write the second number:");
      int n2 = Reader.readInt();
      System.out.println("Write the third number:");
      int n3 = Reader.readInt();
      System.out.println("Write the fourth number:");
      int n4 = Reader.readInt();
      
      int sum = calculateSum(n1, n2, n3, n4);
      System.out.println("The sum of your numbers is: " + sum);
      
  }
  
  private static int calculateSum(int n1, int n2, int n3, int n4) {
      int[] table = new int[4];
      table[0] = n1;
      table[1] = n2;
      table[2] = n3;
      table[3] = n4;
      int i;
      int sum = 0;
      for (i = 0; i < table.length; i++) {
        sum += table[i];
      }
      return sum;
  }
  
}
