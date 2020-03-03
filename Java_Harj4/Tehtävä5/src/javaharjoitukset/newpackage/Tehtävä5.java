/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaharjoitukset.newpackage;
import java.util.Collections;
import java.util.ArrayList;

/**
 *
 * @author piia.laine
 */
public class Tehtävä5 {
    
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        for(int i = 0; i < 40; i++)
        {
        numbers.add(i+1);
        }
        System.out.println("How many lottery lines do you want?");
        int lines = Reader.readInt();
        System.out.println("\n");
        for (int k = 0; k < lines; k++) {
            Collections.shuffle(numbers);
            for(int j =0; j < 6; j++)
            {
            System.out.print(numbers.get(j) + " ");
            }
            System.out.println("\n");
        }
    }
    
}
