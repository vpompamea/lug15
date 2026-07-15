package programmazioneRegistrazione;

import java.util.Scanner;

public class VideoRegistratore {
    
    private int canale;
    private int anno;
    private int mese;
    private int giorno;
    private int ora;
    private int minuto;
    private int durataMinuti;

    Scanner inputNumeri = new Scanner(System.in);

    public void setCanale(int canale) {
        boolean ancora = true;
        do {
            if (canale >= 1 && canale <= 999) {
                this.canale = canale;
                ancora = false;
            } else {
                System.out.print("Errore: il canale deve essere compreso tra 1 e 999, reinseriscilo: ");
                canale = inputNumeri.nextInt();
            }
        } while (ancora);
    }

    public int getCanale() {
        return canale;
    }

    public void setAnno(int anno) {
        boolean ancora = true;
        do {
            if (anno >= 2027) {
                this.anno = anno;
                ancora = false;
            } else {
                System.out.print("Errore: l'anno non può essere nel passato, reinseriscilo (es. 2027): ");
                anno = inputNumeri.nextInt();
            }
        } while (ancora);
    }

    public int getAnno() {
        return anno;
    }

    public void setMese(int mese) {
        boolean ancora = true;
        do {
            if (mese >= 1 && mese <= 12) {
                this.mese = mese;
                ancora = false;
            } else {
                System.out.print("Errore: il mese deve essere compreso tra 1 e 12, reinseriscilo: ");
                mese = inputNumeri.nextInt();
            }
        } while (ancora);
    }

    public int getMese() {
        return mese;
    }

    public void setGiorno(int giorno) {
        boolean ancora = true;
        do {
            int giorniMassimi = 31;
            switch(this.mese) {
                case 4:  // aprile
                case 6:  // giugno
                case 9:  // settembre
                case 11: // novembre
                    giorniMassimi = 30;
                    break;
                case 2: // febbraio
                        giorniMassimi = 28;
                    break;
                default: // il resto
                    giorniMassimi = 31;
                    break;
            }

            if (giorno >= 1 && giorno <= giorniMassimi) {
                this.giorno = giorno;
                ancora = false;
            } else {
                System.out.print("Errore: Giorno non valido per il mese " + this.mese + " (max " + giorniMassimi + "), reinseriscilo: ");
                giorno = inputNumeri.nextInt();
            }
        } while (ancora);
    }

    public int getGiorno() {
        return giorno;
    }

    public void setOra(int ora) {
        boolean ancora = true;
        do {
            if (ora >= 0 && ora <= 23) {
                this.ora = ora;
                ancora = false;
            } else {
                System.out.print("Errore: l'ora deve essere compresa tra 0 e 23, reinseriscila: ");
                ora = inputNumeri.nextInt();
            }
        } while (ancora);
    }

    public int getOra() {
        return ora;
    }

    public void setMinuto(int minuto) {
        boolean ancora = true;
        do {
            if (minuto >= 0 && minuto <= 59) {
                this.minuto = minuto;
                ancora = false;
            } else {
                System.out.print("Errore: i minuti devono essere compresi tra 0 e 59, reinseriscili: ");
                minuto = inputNumeri.nextInt();
            }
        } while (ancora);
    }

    public int getMinuto() {
        return minuto;
    }

    public void setDurataMinuti(int durataMinuti) {
        boolean ancora = true;
        do {
            if (durataMinuti > 0) {
                this.durataMinuti = durataMinuti;
                ancora = false;
            } else {
                System.out.print("Errore: la durata deve essere maggiore di 0 minuti, reinseriscila: ");
                durataMinuti = inputNumeri.nextInt();
            }
        } while (ancora);
    }

    public int getDurataMinuti() {
        return durataMinuti;
    }

    public void display() {
        System.out.println("La tua registrazione è stata programmata correttamente.");
        System.out.println("Canale: " + getCanale());
        System.out.println("Data: " + getGiorno() + "/" + getMese() + "/" + getAnno());
        String oraFormattata = (getOra() < 10) ? "0" + getOra() : "" + getOra();
        String minutoFormattato = (getMinuto() < 10) ? "0" + getMinuto() : "" + getMinuto();
        System.out.println("Orario Inizio: " + oraFormattata + ":" + minutoFormattato);
        System.out.println("Durata registrazione: " + getDurataMinuti() + " minuti.");
    }
}