package OO.Example2;

import java.util.ArrayList;

public class Bank {
    // attribute
    private String name;
    private ArrayList<Konto> kontos;

    // Konstruktor
    public Bank(String name){
        kontos = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Konto> getKontos() {
        return kontos;
    }

    public void setKontos(ArrayList<Konto> kontos) {
        this.kontos = kontos;
    }



    public void kontoAnlegen(String name, double betrag){
        int nummer = kontos.size();
        this.kontos.add(new Konto(nummer, name, betrag));
        System.out.println("Konto angelegt. Nummer: " + nummer);
    }

    public void kontoSchliessen(int nummer){
        kontos.remove(nummer);
        System.out.println("Konto " + nummer + " entfernt");
    }

    public void geldEinzahlen(int nummer, double betrag){
        Konto k = kontos.get(nummer);
        k.einzahlen(betrag);
    }

    public void geldAbheben(int nummer, double betrag){
        Konto k = kontos.get(nummer);
        k.abheben(betrag);
    }

    public void ueberweisen(int nrSrc, int nrDest, double betrag){
        Konto kSrc = kontos.get(nrSrc);
        Konto kDest = kontos.get(nrDest);

        kSrc.abheben(betrag);
        kDest.einzahlen(betrag);

        System.out.println(betrag + " € von Kontonummer " + nrSrc + " auf Kontonummer " + nrDest + " überwiesen");
    }
}
