/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author maarchyl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tablica = new int[100];
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            tablica[i] = r.nextInt(100);
        }
        Arrays.sort(tablica);
        System.out.println(Arrays.toString(tablica));
        for (int i = 0; i < 100; i++) {
            System.out.println(tablica[i]);
        }
        

    }

}
