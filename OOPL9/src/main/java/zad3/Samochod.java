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
public class Samochod {

    private String marka;
    private String nazwa;
    private int max_pr;
    private int cena;

    public Samochod(String marka, String nazwa, int max_pr, int cena) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.max_pr = max_pr;
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getMax_pr() {
        return max_pr;
    }

    public void setMax_pr(int max_pr) {
        this.max_pr = max_pr;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Samochod{" + "marka=" + marka + ", nazwa=" + nazwa + ", max_pr=" + max_pr + ", cena=" + cena + '}';
    }

    

}
