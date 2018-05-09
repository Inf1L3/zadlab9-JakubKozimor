/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

import java.util.ArrayList;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Samochod> arlist = new ArrayList<Samochod>();
        Samochod nr1 = new Samochod("dfsad", "fas", 100, 23);
        Samochod nr2 = new Samochod("dffassad", "ffgfgas", 200, 13);
        Samochod nr3 = new Samochod("dad", "fa", 130, 123);
        arlist.add(nr1);
        arlist.add(nr2);
        arlist.add(nr3);
        for (int i = 0; i < arlist.size(); i++) {
            System.out.println("ArrayList Element " + i + " :" + arlist.get(i));
        }

    }
    
}
