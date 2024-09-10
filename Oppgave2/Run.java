package Oppgave2;

public class Run {
    public static void main(String... blablabla) {
        final String[] kokker = {"Anne", "Erik", "Knut"};
        final String[] servitorer = {"Mia", "Per"};
        final int KAPASITET = 4;

        skrivUtHeader(kokker, servitorer, KAPASITET);

        HamburgerBrett brett = new HamburgerBrett(KAPASITET);

        for (String navn : kokker) {
            new Thread(new Kokk(brett, navn)).start();
        }
        for (String navn : servitorer) {
            new Thread(new Servitor(brett, navn)).start();
        }
    }
    public String skrivUtHeader(){
        return null;
    }
}
