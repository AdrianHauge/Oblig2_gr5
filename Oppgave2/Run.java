package Oppgave2;

public class Run {
    public static void main(String... blablabla) {
        final String[] kokker = {"Anne", "Erik", "Knut"};
        final String[] servitorer = {"Mia", "Per"};
        final int KAPASITET = 4;

        skrivUtHeader(kokker, servitorer, KAPASITET);

        HamburgerBrett brett = new HamburgerBrett(KAPASITET);

        for (String navn : kokker) {
        new Kokk(brett, navn).start();
        }

        for (String navn : servitorer) {
        new Servitor(brett, navn).start();
        }
        }

        public static void skrivUtHeader(String[] kokker, String[] servitor,int KAPASITET){

        System.out.print("I denne simuleringen har vi \n " + servitor.length + " servitører ");
        System.out.print("[");
        for (int i = 0; i < servitor.length; i++) {
            System.out.print(servitor[i]);
            if (i < servitor.length - 1) System.out.print(", ");
        }
        System.out.println("] \n");

        System.out.println(kokker.length + " kokker");
        System.out.println("[");
        for (int i = 0; i < kokker.length; i++) {
            System.out.print(kokker[i]);
            if (i < kokker.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        System.out.println("Kapasiteten til brettet er " + KAPASITET + " hamburgere.");
        System.out.println("Vi starter ...\n");
    }


}
