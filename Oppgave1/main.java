import javax.swing.JOptionPane;

public class Main {
    private static String message = "Hallo verden!";
    private static boolean running = true;

    public static void main(String[] args){

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


}


