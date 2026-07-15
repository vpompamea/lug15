package rettangolo;

public class Rettangolo {
	public double base;
	public double altezza;
	
	//costruttori
	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public Rettangolo() {}
	
	//metodi
	public void impostaDimensioni(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public void calcolaArea() {
	    System.out.println("Area: " + (base * altezza));
	}
	
	public void disegna() {
		if (base <= 0 || altezza <= 0) {
            System.out.println("Dimensioni non valide per il disegno.");
            return;
        }
		//convertitore da double a int per le righe e le colonne
		int righe = (int) altezza;
        int colonne = (int) base;
        
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                System.out.print(". ");
            }
            System.out.println();
        }
    } 
}