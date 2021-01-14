package OO.Example2;

public class Konto {
    // attribute
    private int nummer;
    private String inhaber;
    private double kontostand;

    // Konstruktor
    public Konto(int nummer, String name, double betrag){
        this.nummer = nummer;
        this.inhaber = name;
        this.kontostand = betrag;
    }

    void einzahlen(double betrag){
        this.kontostand += betrag;
    }

    void abheben(double betrag){
        this.kontostand -= betrag;
    }

    public double getKontostand(){
        return this.kontostand;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public String getInhaber() {
        return inhaber;
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }
}
