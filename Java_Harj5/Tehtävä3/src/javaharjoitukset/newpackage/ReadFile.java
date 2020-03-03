/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaharjoitukset.newpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author piia.laine
 */
public class ReadFile {
  public static void main(String[] args) {
    System.out.println("Write the path of your file:");
    String file_path = Reader.readString();
    System.out.println("Write the name of your file:");
    String file_name = Reader.readString();
    
    try {
      File myObj = new File(file_path + "//" + file_name);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
