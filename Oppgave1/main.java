import javax.swing.JOptionPane;

public class main {
    private static String message = "Hallo verden!";
    private static boolean running = true;

    public static void main(String[] args){

<<<<<<< HEAD
        Thread printThread = new Thread(() -> {
            while (running) {
                System.out.println(message);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread inputThread = new Thread(() -> {
            while (running) { 
                String input = JOptionPane.showInputDialog("Skriv inn en melding ('quit' for å avslutte):");
                if (input != null && input.equalsIgnoreCase("quit")) {
                    running = false;
                } else if (input != null && !input.isEmpty()) {
                    message = input;
                }
            }
        });

        printThread.start();
        inputThread.start();

        try {
            inputThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
=======
String valg = JOptionPane.showInputDialog(null, "Skriv inn din melding, quit for og slutte", "Homo?",JOptionPane.YES_NO_CANCEL_OPTION);

if(valg == JOptionPane.YES_OPTION ){



}else if(valg == JOptionPane.NO_OPTION){


    
}else{

}



}
>>>>>>> 496c5b03c43e3e01a21c75ac48aaf7245c332c58


}


