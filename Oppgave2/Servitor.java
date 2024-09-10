package Oppgave2;

import java.util.Random;

public class Servitor extends Thread{

private HamburgerBrett brett;
private final Random random = new Random();
private String navn;

    public Servitor(HamburgerBrett brett, String navn){
this.brett = brett;
this.navn = navn;

    }

@Override
public void run(){

    

    while(true){
Thread.sleep((random.nextInt(5)+2)*1000);
brett.taHamburger();
    }
}


    

}
