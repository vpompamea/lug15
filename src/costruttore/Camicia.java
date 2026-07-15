package costruttore;

import java.util.Scanner;

public class Camicia {
	// campi private perchè incupsulati cioè non accessibili direttamente dall'esertno alla classe
	private int ID;
	private String descrizione = "-descrizione richiesta-";
	private char codiceColore = 'U'; // R = red, G = green, B = blue, W = white
	private double prezzo;
	private int disponibili; // quante camicie ho in magazzino del tipo instanziano
	private int acquistate; // quante camicie si vogliono comprare
	
	Scanner inputNumeri = new Scanner(System.in); // scanner per i numeri
	Scanner inputTesti = new Scanner(System.in); // scanner per i testi
	
	
	public Camicia(int ID, String descrizione, char codiceColore, double prezzo, int disponibili, int acquistate) {
		setID(ID);
		setDescrizione(descrizione);
		setCodiceColore(codiceColore);
		setPrezzo(prezzo);
		setDisponibili(disponibili);
		setAcquistate(acquistate);
	}
	// creando un costruttore personalizzato, va rigenerato quello predefinito:
	//Camicia potrebbe essere istanziata da un altro main()
	public Camicia() {}
	
	// inizio incapsulamento
	public void setID(int ID) {
		// regola: gli ID sono di 4 cifre
		boolean ancora = true; // "interruttore per restare o meno nel metodo"
		
		do {
			if (ID > 999 && ID < 10000) { // ID del metodo "occulta" il campo omonimo globale
				this.ID = ID; // this permette di accedere all'ID globale omonimo del metodo
				ancora = false;
			} else  {
				System.out.print("L'ID devono essere di 4 cifre, reinseriscilo: ");
				ID = inputNumeri.nextInt();
			}
		} while (ancora);
		
	}
	
	public int getID() {
		return ID; // non occorre this.ID poichè non ho un ID locale
	}
	
	public void setDescrizione(String descrizione) {
		// regole: descrizione di almeno 8 caratteri e al massimo 20
		boolean ancora = true;
		
		do {
			if (descrizione.length() >= 8 && descrizione.length() <= 20) {
				this.descrizione = descrizione;
				ancora = false;
			} else {
				System.out.print("La descrizione dev' essere di almeno 8 caratteri e al massimo di 20, reinseriscila");
				descrizione = inputTesti.nextLine();
			}
		} while (ancora);
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setCodiceColore(char codiceColore) {
		// regola: caratteri consentiti R,G,B,W
		boolean ancora = true;
		
		do {
			switch(codiceColore) {
				case 'R':
				case 'G':
				case 'B':
				case 'W':
					this.codiceColore = codiceColore;
					ancora = false;
					break;
				default:
					System.out.print("Codici consentiti: R = red, G = greenn, B = blue, W = white; reinseriscilo: ");
					codiceColore = inputTesti.nextLine().toUpperCase().charAt(0); // non esiste nextChar
			}
			
		}while(ancora);
		
	}
	public char getCodiceColore() {
		return codiceColore;
	}
	public void setPrezzo( double prezzo) {
		//regola: prezzo compreso tra 10.00 e 100.00 euro
		boolean ancora = true;
		
		do {
			if (prezzo >= 10.00 && prezzo <= 100.00){
				this.prezzo = prezzo;
				ancora = false;
			} else {
				System.out.print("Il prezzo deve essere tra 10,00 e 100,00 euro; reinseriscilo: ");
				prezzo = inputNumeri.nextDouble();
			}
			
		} while(ancora);
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	public void setDisponibili(int disponibili) {
		//regola: almeno una
		boolean ancora = true;
		
		do {
			
			if(disponibili >0) {
				this.disponibili = disponibili;
				ancora = false;
			} else {
				System.out.print("Dev'essere disponibile almeno una camicia; reinserisci il valore: ");
				disponibili = inputNumeri.nextInt();
			}
				
		} while(ancora);
			
	}
	public int getDisponibili() {
		return disponibili;
	}
	public void setAcquistate( int acquistate) {
		//regola: almeno una acquistata e al massimo quante ce ne sono disponibili
		boolean ancora = true;
		
		do {
			
			if( acquistate >0 && acquistate <= getDisponibili()){// getDisponibili() perchè disponibili è private e l'unico private accessibile direttamente è quello che da il nome al setter
				this.acquistate = acquistate;
				ancora = false;
			}else {
				System.out.print("Occorre acquistare almeno una camicia e al massimo " + getDisponibili() + "; reinserisci il valore");
				acquistate = inputNumeri.nextInt();
			}
		} while(ancora);
		
	}
	
	public int getAcquistate() {
		return acquistate;
	}
	
	public void display() {
		System.out.println("ID della camicia: " + getID());
		System.out.println("Descrizione: " + getDescrizione());
		System.out.print("Colore: "); // mostro il colore anzichè il codice colore
		
		switch(getCodiceColore()) {
		case 'R':
			System.out.println(" rossa");
			break;
		case 'G':
			System.out.println(" verde");
			break;
		case 'B':
			System.out.println(" blu");
			break;
		case 'W':
			System.out.println(" bianca");
			break;
	}
		System.out.println("Prezzo unitario: " + getPrezzo() + "euro");
		System.out.println("Quantità disponibile: " + getDisponibili());
		System.out.println("Quantità acquistata: " + getAcquistate());
		System.out.println("Prezzo totale: " + (getPrezzo()*getAcquistate()) + "euro.");
}
	// fine incapsulamento
	
}
