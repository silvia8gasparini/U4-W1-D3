package Esercizio2;

import java.util.LinkedList;
import java.util.List;

public class SIM {
    private String numeroTelefono;
    private double credito;
    private List<Chiamata> ultimeChiamate;

    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0.0;
        this.ultimeChiamate = new LinkedList<>();
    }

    public void aggiungiChiamata(Chiamata c) {
        if (ultimeChiamate.size() == 5) {
            ultimeChiamate.remove(0); // rimuove la più vecchia
        }
        ultimeChiamate.add(c);
    }

    public void stampaDatiSIM() {
        System.out.println("Numero SIM: " + numeroTelefono);
        System.out.println("Credito disponibile: " + credito + " €");
        System.out.println("Ultime chiamate:");
        if (ultimeChiamate.isEmpty()) {
            System.out.println("Nessuna chiamata effettuata.");
        } else {
            for (Chiamata c : ultimeChiamate) {
                System.out.println(c);
            }
        }
    }
}
