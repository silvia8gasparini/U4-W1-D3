public class Main {
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(5, 3);
        Rettangolo r2 = new Rettangolo(2, 7);

        System.out.println("=== Rettangolo singolo ===");
        UtilityRettangoli.stampaRettangolo(r1);

        System.out.println("\n=== Due Rettangoli ===");
        UtilityRettangoli.stampaDueRettangoli(r1, r2);
    }
}
