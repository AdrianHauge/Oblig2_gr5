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
<<<<<<< HEAD
    }
    public String skrivUtHeader(){
        return null;
    }
=======
<<<<<<< HEAD
        
        
    }
    public static void skrivUtHeader(String[] kokker, String[] servitorer, int KAPASITET){
=======
        }

        public void skrivUtHeader(String[] kokker, String[] Servitor,int KAPASITET){

>>>>>>> 1a225a4c2d140dc54234a7bb2b2653acf5052eba
        System.out.println("I denne simuleringen har vi \n"
        + kokker.length + " kokker");
        System.out.print("[");
        for (int i = 0; i < kokker.length; i++) {
            System.out.print(kokker[i]);
            if (i < kokker.length - 1) System.out.print(", ");
        }
        System.out.println("]");

<<<<<<< HEAD
        System.out.print(servitorer.length + " servitører ");
        System.out.print("[");
        for (int i = 0; i < servitorer.length; i++) {
            System.out.print(servitorer[i]);
            if (i < servitorer.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        System.out.println("Kapasiteten til brettet er " + KAPASITET + " hamburgere.");
        System.out.println("Vi starter ...\n");
    }
    
    
=======

>>>>>>> 1a225a4c2d140dc54234a7bb2b2653acf5052eba
>>>>>>> 59eeea71b6ff1094b23a1e3dcc06605049de6852
}
