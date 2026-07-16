package programmazioneRegistrazione;

import java.util.Scanner;

public class VideoRegistratoreTest {

    public static void main(String[] args) {
        VideoRegistratore mioVideoRegistratore = new VideoRegistratore();
        Scanner inputTesti = new Scanner(System.in);
        Scanner inputNumeri = new Scanner(System.in);
        
        System.out.println("================================================");
        System.out.println("                 REGISTRATORE");
        System.out.println("================================================\n");
        System.out.print("Premi INVIO per programmare una registrazione...");
        inputTesti.nextLine(); 
        System.out.println();

        System.out.print("Inserisci il numero del canale da 1 a 999: ");
        mioVideoRegistratore.setCanale(inputNumeri.nextInt());
        
        System.out.print("Inserisci l'anno della registrazione (es. 2026): ");
        mioVideoRegistratore.setAnno(inputNumeri.nextInt());
        
        System.out.print("Inserisci il mese (1-12): ");
        mioVideoRegistratore.setMese(inputNumeri.nextInt());
        
        System.out.print("Inserisci il giorno: ");
        mioVideoRegistratore.setGiorno(inputNumeri.nextInt());
        
        System.out.print("Inserisci l'ora (0-23): ");
        mioVideoRegistratore.setOra(inputNumeri.nextInt());
        
        System.out.print("Inserisci i minuti (0-59): ");
        mioVideoRegistratore.setMinuto(inputNumeri.nextInt());
        
        System.out.print("Inserisci la durata della registrazione (in minuti): ");
        mioVideoRegistratore.setDurataMinuti(inputNumeri.nextInt());
        
        System.out.println();
        mioVideoRegistratore.display();
        
        inputTesti.close();
        inputNumeri.close();
        System.exit(0);
    }
}