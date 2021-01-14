package Klausur;

import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("zahl1: ");
        double zahl1 = s.nextDouble();
        System.out.println("zahl2: ");
        double zahl2 = s.nextDouble();

        Addition ad = new Addition(zahl1, zahl2);

        double ergebnis = ad.berechneErgebnis();
        System.out.println(Math.round(ergebnis*100)/100);

    }
}
