package Oppgave2;

public class Hamburger{

    private static int antall;
    private final int id;


    public Hamburger(){
        this.id = antall++;
    }

    @Override
    public String toString(){
        return "◖" + id + "◗";
    }

}