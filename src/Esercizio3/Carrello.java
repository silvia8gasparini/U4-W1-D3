package Esercizio3;

import java.util.ArrayList;
import java.util.List;

public class Carrello {
    private Cliente cliente;
    private List<Articolo> articoli;

    public Carrello(Cliente cliente) {
        this.cliente = cliente;
        this.articoli = new ArrayList<>();
    }

    public void aggiungiArticolo(Articolo a) {
        articoli.add(a);
    }

    public double calcolaTotale() {
        double totale = 0;
        for (Articolo a : articoli) {
            totale += a.getPrezzo();
        }
        return totale;
    }

    public void stampaCarrello() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Articoli nel carrello:");
        for (Articolo a : articoli) {
            System.out.println("- " + a);
        }
        System.out.println("Totale: €" + calcolaTotale());
    }
}
