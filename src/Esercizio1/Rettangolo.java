package Esercizio1;

public class Rettangolo {
    private double altezza;
    private double larghezza;

    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    public double calcolaArea() {
        return altezza * larghezza;
    }

    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }
}
