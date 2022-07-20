public class Bank {
    public static void main(String[] args) {
        Girokonto gkto = new Girokonto();
        gkto.einzahlen(100.0);
        System.out.println(gkto.auszahlen(10));

    }
}
