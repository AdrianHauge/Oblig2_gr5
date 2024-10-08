package Oppgave2;

import java.util.Random;

public class Servitor extends Thread{

private final HamburgerBrett brett;
private final Random random = new Random();
private final String navn;

    public Servitor(HamburgerBrett brett, String navn){
this.brett = brett;
this.navn = navn;

    }

@Override
public void run(){

    while(true){
    try{
    int tid = random.nextInt(5)+2;
    Thread.sleep(tid*1000);

    synchronized(brett){
    while(brett.erTom()){
        System.out.println(navn + " (servitør) ønsker og ta en hamburger, men brettet er tomt. Venter! \n");
        brett.wait();
    }
brett.taHamburger(navn);
brett.notifyAll();

    }
} catch (InterruptedException e){
    e.printStackTrace();
}
    }
}
}


