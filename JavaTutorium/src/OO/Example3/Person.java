package OO.Example3;

public class Person {
    public final static int ANZAHL_ARME = 2;

    private String name;
    private int alter;
    private String adresse;
    private Person kind;
    private Person elternteil;
    private int gewicht;

    // Konstruktor
    public Person(String name, int alter, String adresse) {
        this.name = name;
        this.alter = alter;
        this.adresse = adresse;
    }

    public Person(String name, int alter, String adresse, Person person) {
        this.name = name;
        this.alter = alter;
        this.adresse = adresse;
        this.kind = person;
    }

    public void bicMacEssen(int anzahlBicMacs){
        gewicht += anzahlBicMacs * 1;
    }

    public boolean isFat(){
        return gewicht > 100;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public String getAdresse() {
        return adresse;
    }

    public Person getKind() {
        return kind;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setKind(Person kind) {
        this.kind = kind;
    }

    public Person getElternteil() {
        return elternteil;
    }

    public void setElternteil(Person elternteil) {
        this.elternteil = elternteil;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public void vorstellen(){
        System.out.println("Ich bin " + name + ", " + alter + " und wiege " + gewicht + "kg");
    }

    public static boolean isFatterThan(Person p1, Person p2){
        return p1.getGewicht() > p2.getGewicht();
    }



}
