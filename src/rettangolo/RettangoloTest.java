package rettangolo;

public class RettangoloTest {

    public static void main(String[] args) {
        
        System.out.println("PRIMO RETTANGOLO: ");
        // primo caso: istanza vuota e dimensioni tramite metodo
        Rettangolo mioRettangolo = new Rettangolo();
        mioRettangolo.impostaDimensioni(8, 4); 
        
        mioRettangolo.calcolaArea(); 
        System.out.println("Disegno del primo rettangolo: \n");
        mioRettangolo.disegna();
        
        System.out.println();

        System.out.println("SECONDO RETTANGOLO: ");
        // secondo caso: istanza con passaggio delle dimensioni tramite costruttore
        Rettangolo tuoRettangolo = new Rettangolo(5, 3); 
        
        tuoRettangolo.calcolaArea();
        System.out.println("Disegno del secondo rettangolo: \n");
        tuoRettangolo.disegna();
    }
}