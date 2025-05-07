package Esercizio2;

public class Main2 {
    public static void main(String[] args) {
        SIM miaSim = new SIM("3201234567");

        // Aggiungo delle chiamate di esempio
        miaSim.aggiungiChiamata(new Chiamata("333111222", 3));
        miaSim.aggiungiChiamata(new Chiamata("333222333", 5));
        miaSim.aggiungiChiamata(new Chiamata("333333444", 2));
        miaSim.aggiungiChiamata(new Chiamata("333444555", 4));
        miaSim.aggiungiChiamata(new Chiamata("333555666", 1));
        miaSim.aggiungiChiamata(new Chiamata("333666777", 6)); // sovrascrive la prima

        miaSim.stampaDatiSIM();
    }
}
