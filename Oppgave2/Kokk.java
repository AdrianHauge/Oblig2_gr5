package Oppgave2;

import java.util.Random;

public class Kokk extends Thread {

    private HamburgerBrett brett;
    private String navn;
    private Random random = new Random();

    public Kokk(HamburgerBrett brett, String navn) {
        this.navn = navn;
        this.brett = brett;
    }

    @Override
    public void run() {



        while(true) {

            try {
            int tid = random.nextInt(5) + 2;
            Thread.sleep(tid * 1000);            
            
            synchronized(brett) {
                while(brett.erFullt()) {
                    System.out.println(navn + " (kokk) klar med hamburger, men brett fullt. Venter!");
                    brett.wait();
                }
                
                brett.leggTilHamburger(navn);
                brett.notifyAll();
            }
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
