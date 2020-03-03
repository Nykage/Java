/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaharjoitukset.newpackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author piia.laine
 */
public class CreateFile {
  public static void main(String[] args) {
    System.out.println("Write the path you want to save your file to:");
    String file_path = Reader.readString();
    System.out.println("Write the name of the file that you want:");
    String file_name = Reader.readString();
    System.out.println("Write your name:");
    String username = Reader.readString();
    System.out.println("Write your address:");
    String address = Reader.readString();
    System.out.println("Write your phone number:");
    String phone = Reader.readString();
    try {
      File myObj = new File(file_path + "//" + file_name);
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
      FileWriter myWriter = new FileWriter(file_path + "//" + file_name);
      myWriter.write(
        "Name: " + username + "\nAddress: " + address + "\nPhone: " + phone
      );
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
