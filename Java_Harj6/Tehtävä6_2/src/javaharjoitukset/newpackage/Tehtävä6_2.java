/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaharjoitukset.newpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author piia.laine
 */
public class Tehtävä6_2 {
  public static void main(String[] args) {
    System.out.println("Write the path of the file to read:");
    String file_path = Reader.readString();
    System.out.println("Write the name of the file to read:");
    String file_name = Reader.readString();
    String text = null;
    
    //Read
    try {
      File myObj = new File(file_path + "//" + file_name);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
        text = data;
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    
    //Encryption
    String salattava = text;
    String salattu = "";
    for (int i = 0; i < salattava.length(); i++) {
        char merkki = salattava.charAt(i);
	merkki--;
	salattu = salattu + merkki;
    }
    
    //Create and write
    System.out.println("Write the name of your new file:");
    String newfile_name = Reader.readString();
    
    try {
      File myObj = new File(file_path + "//" + newfile_name);
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    try {
      FileWriter myWriter = new FileWriter(file_path + "//" + newfile_name);
      myWriter.write(
        salattu
      );
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
