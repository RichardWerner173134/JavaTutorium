package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Wie groß soll das Feld sein?");
		
		int laenge = sc.nextInt();
			
		double[] feld = array.SimpleArray.erstelleFeld(laenge);

		System.out.println("Kleinstes Element = " + array.SimpleArray.minElement(feld));
		System.out.println("Größtes Element = " + array.SimpleArray.maxElement(feld));
		
		array.SimpleArray.druckeFeld(feld);
		
		
		System.out.println("Durchschnitt = " + array.SimpleArray.berechneDurchschnitt(feld));
		System.out.println("Kleinster Abstand = " + array.SimpleArray.bestimmeKleinstenAbstand(feld));
		
		for(int i = 0; i < feld.length; i++) {
			int x = (int)feld[i];
			String string = String.valueOf(x);
			char[] zahl = string.toCharArray();
			System.out.println("Quersumme von " + (int)feld[i] + " = " + array.SimpleArray.berechneQuersumme(zahl));
		}
		
		array.SimpleArray.sortArray(feld);
		
	}
		
}


