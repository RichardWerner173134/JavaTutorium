package OO.Example1;

public class Porsche extends Auto {
    // irgendeine Nr die von Porsche kommt
    int fahrgestellnr;
    boolean sportmodus;

    public Porsche(String bezeichnung, int maxKmh, int fahrgestellnr) {
        super("OO.Example1.Porsche Modell: " + bezeichnung, maxKmh);

        this.fahrgestellnr = fahrgestellnr;
        this.sportmodus = false;
    }

    public void sportmodusAnschalten(){
        sportmodus = true;
        System.out.println("Sportmodus ist an");
    }

    public void sportModusAusschalten(){
        sportmodus = false;
        System.out.println("Sportomdus ist aus");
    }

    public int getMaxKmh(){
        return 0;
    }


}
