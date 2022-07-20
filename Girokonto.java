public class Girokonto extends Konten {

    private double dispoMax;

    public void setDispoMax(double dH) {
        this.dispoMax = dH;
    }

    public double getDispoMax() {
        return this.dispoMax;
    }

    // Überschreiben
    public void einzahlen(double einzahlungsbetrag) {
        System.out.println("Girokonto");
        // Bank behält für Einzahlung gebühren
        setStand(getStand() + (einzahlungsbetrag - 1));

    }
}
