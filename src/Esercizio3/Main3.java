package Esercizio3;

import java.time.LocalDate;

public class Main3 {
    public static void main(String[] args) {
        Cliente c = new Cliente("C001", "Silvia Nerini", "silvia@email.com", LocalDate.now());

        Articolo a1 = new Articolo("A101", "Tastiera meccanica", 89.99, 10);
        Articolo a2 = new Articolo("A102", "Mouse wireless", 35.50, 25);

        Carrello carrello = new Carrello(c);
        carrello.aggiungiArticolo(a1);
        carrello.aggiungiArticolo(a2);

        carrello.stampaCarrello();
    }
}
