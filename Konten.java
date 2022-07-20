public class Konten {
    private String ktoNr;
    private double stand;

    public void einzahlen(double einzahlungsbetrag) {
        this.stand = einzahlungsbetrag + this.stand;

    }

    public double auszahlen(double auszahlungsbetrag) {
        this.stand = this.stand - auszahlungsbetrag;
        return this.stand;
    }

    public void setKtoNr(String ktoNr) {
        this.ktoNr = ktoNr;
    }

    public String getktoNString() {
        return this.ktoNr;
    }

    public void setStand(Double stand) {
        this.stand = stand;
    }

    public double getStand() {
        return this.stand;
    }
}
