package Oppgave2;

public class HamburgerBrett {

    public boolean erFullt() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'erFullt'");
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