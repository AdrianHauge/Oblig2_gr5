package Oppgave2;

import java.util.LinkedList;
import java.util.Queue;

public class HamburgerBrett {

    private Queue<Hamburger> brett;
    private int størrelse;
    private int teller;

    public HamburgerBrett(int størrelse) {
        this.størrelse = størrelse;
        this.teller = 0;
        this.brett = new LinkedList<Hamburger>();
    }

    public boolean erFullt() {
        return størrelse == teller;
    }

    public boolean erTom() {
        return teller == 0;
    }

    public void leggTilHamburger(String navn) {
        Hamburger burger = new Hamburger();
        teller++;
        brett.add(burger);
        System.out.println(navn + " (kokk) legger på hamburger "+ burger.toString() + ". Brett: " + brett.toString());
    }

    public void taHamburger(String navn) {
        Hamburger burger = brett.poll();
        teller--;
        System.out.println(navn + " (servitør) tar av hamburger" + burger.toString() + ". Brett: " + brett.toString());
    }

}