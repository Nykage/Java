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
    
      System.out.println("Please write the length of the field:");
      double length = Reader.readInt();
      System.out.println("Please write the width of the field:");
      double width = Reader.readInt();
      
      double area = field(length, width);
      System.out.println("The size of your field is " + area + "m^2.");
      
  }
  
  private static double field(double length, double width) {
      double area = length*width;
      return area;
  }
  
}
