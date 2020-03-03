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
public class Tehtävä6 {
    
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        for(int i = 0; i < 100; i++)
        {
        numbers.add(i + (int)(100*Math.random()));
        }
        Collections.sort(numbers);
        for(int j =0; j < 100; j++)
        {
        System.out.print(numbers.get(j) + " ");
        }
    }
    
}
