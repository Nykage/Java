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
public class Ylimääräiset1 {
    
    public static void main(String[] args) {
        int count = 0;
        ArrayList numbers = new ArrayList();
        for(int i = 0; i < 40; i++)
        {
            numbers.add(i+1);
        }
        Collections.shuffle(numbers);
        ArrayList user = new ArrayList();
        for (int k = 0; k < 6; k++) {
            System.out.println("Type in the number:");
            user.add(Reader.readInt());
        }
        for(int j =0; j < 6; j++)
        {
            if (numbers.get(j) == user.get(j)) {
                count++;
            }
        }
        System.out.println("Lotto numbers: " + numbers.get(0) + " " + numbers.get(1) + " " + numbers.get(2) + " " + numbers.get(3) + " " + numbers.get(4) + " " + numbers.get(5));
        System.out.println("Your numbers: " + user.get(0) + " " + user.get(1) + " " + user.get(2) + " " + user.get(3) + " " + user.get(4) + " " + user.get(5));
        System.out.println("Correct numbers: " + count);
    }
    
}
