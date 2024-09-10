package Oppgave3;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class HamburgerBQ {
    private static int antall = 0;
    private final int id;

    public HamburgerBQ() {
        this.id = ++antall;
    }

    @Override
    public String toString() {
        return "◖" + id + "◗";
    }
}

public class Run {

    public static void main(String[] args) {
        final String[] kokker = {"Anne", "Erik", "Knut"};
        final String[] servitorer = {"Mia", "Per"};
        final int KAPASITET = 4;

        System.out.println("Simulatoren viser:");
        System.out.println(kokker.length + " kokker " + java.util.Arrays.toString(kokker));
        System.out.println(servitorer.length + " servitører " + java.util.Arrays.toString(servitorer));
        System.out.println("Kapasiteten til brettet er " + KAPASITET + " hamburgere.");
        System.out.println("");

        BlockingQueue<HamburgerBQ> brett = new ArrayBlockingQueue<>(KAPASITET);

        for (String navn : kokker) {
            new Thread(() -> {
                Random rand = new Random();
                try {
                    while (true) {
                        Thread.sleep(rand.nextInt(4000) + 2000);
                        HamburgerBQ hamburger = new HamburgerBQ();
                        brett.put(hamburger);
                        System.out.println(Thread.currentThread().getName() + " (kokk) legger på hamburger " + hamburger + ". Brett: " + brett);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, navn).start();
        }

        for (String navn : servitorer) {
            new Thread(() -> {
                Random rand = new Random();
                try {
                    while (true) {
                        Thread.sleep(rand.nextInt(4000) + 2000);
                        HamburgerBQ hamburger = brett.take();
                        System.out.println(Thread.currentThread().getName() + " (servitør) tar av hamburger " + hamburger + ". Brett: " + brett);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, navn).start();
        }
    }
}
