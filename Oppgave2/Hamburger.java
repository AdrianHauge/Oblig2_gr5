package Oppgave2;

public class Hamburger{

    private int antall;
    private int id;


    public Hamburger(){
        this.id = antall++;
    }

    @Override
    public String toString(){
        return "◖" + id + "◗";
    }

}