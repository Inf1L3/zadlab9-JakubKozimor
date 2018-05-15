/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad4;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Jakub
 */
public class Main {

    public static void main(String[] args) {
        Scanner pobierz = new Scanner(System.in);

        HashMap<String, String> map = new HashMap<>(20);
        Slownik s1 = new Slownik();

        s1.setMap(map);
        String x = " ";
        while (!x.equals("koniec")) {

            System.out.println("Podaj słowo koniec - zakoncz");
            x = pobierz.nextLine();

            if (!map.containsKey(x)) {
                System.out.println("nie ma slowa");
            } else {
                System.out.println(map.get(x));
            }

        }
    }
}
