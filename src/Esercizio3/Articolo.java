package Esercizio3;

public class Articolo {
    private String codice;
    private String descrizione;
    private double prezzo;
    private int pezziDisponibili;

    public Articolo(String codice, String descrizione, double prezzo, int pezziDisponibili) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.pezziDisponibili = pezziDisponibili;
    }

    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return codice + " - " + descrizione + " | €" + prezzo + " | Disponibili: " + pezziDisponibili;
    }
}
