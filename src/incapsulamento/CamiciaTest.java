package incapsulamento;
import java.util.Scanner;

public class CamiciaTest {

	public static void main(String[] args) {
		Camicia miaCamicia = new Camicia();
		Scanner inputTesti = new Scanner(System.in);
		Scanner inputNumeri = new Scanner(System.in);
		
		System.out.print("Inserisci l'ID della camicia (4 cifre): ");
		miaCamicia.setID(inputNumeri.nextInt());
		
		System.out.println("Inserisci la descrizione (tra 8 e 20 caratteri): ");
		miaCamicia.setDescrizione(inputTesti.nextLine());
		
		System.out.println("Inserisci il codice colore (R = red, G = green, B = blue, W = white): ");
		miaCamicia.setCodiceColore(inputTesti.nextLine().toUpperCase().charAt(0));
		
		System.out.println("Inserisci il prezzo unitario (compreso tra 10.00 e 100.00): ");
		miaCamicia.setPrezzo(inputNumeri.nextDouble());
		
		System.out.println("Inserisci la uantità di camicie disponibili ( almeno 1): ");
		miaCamicia.setDisponibili(inputNumeri.nextInt());
		
		System.out.println("Inserisci la quantità di camicie acquistate (almeno 1 al massimo " + miaCamicia.getDisponibili());
		miaCamicia.setAcquistate(inputNumeri.nextInt());
		
		miaCamicia.display();
		inputTesti.close(); // le istanze di scanner vanno chiuse nel metodo più a monte del programma
		inputNumeri.close();
		System.exit(0); // chiusura normale del programma ( 0= nessun problema; quando il programma crusha java lancia System.exit(1);
	}

}
