package array;

import java.util.Scanner;

public class SimpleArray {
	public static double[] erstelleFeld (int laenge) {
		
		double[] feld = new double[laenge];
		
		for(int i = 0; i < feld.length; i++) {
			feld[i] = (double) (Math.random() * 100.0);
		}
		return feld;		
	}
	
	public static double minElement (double feld[]) {
		double min = feld[0];
		for(int i = 1; i < feld.length - 1; i++) {
			if (feld[i] < min) {
				min = feld[i];
			}
		}
		
		return min;
	}
	
	public static double maxElement (double feld[]) {
		double max = feld[0];
		for(int i = 1; i < feld.length; i++) {
			if (feld[i] > max) {
				max = feld[i];
			}
		}
		
		return max;
	}
	
	public static void druckeFeld (double feld[]) {
		if(feld != null) {
			for (int i = 0; i < feld.length; i++) {
			System.out.println("Feld ["  + i + "] = " + feld[i]);
			}
		}
	}
	
	public static double berechneDurchschnitt (double feld[]) {
		double summe = 0.0;
		for(int i = 0; i < feld.length; i++) {
			summe += feld[i];
		}
		double ds = summe / feld.length;
		return ds;
	}
	
	public static double bestimmeKleinstenAbstand (double feld[]) {
		double minDiff = 100;
		for (int i = 1; i < feld.length; i++) {
			if (minDiff > Math.abs((feld[i] - feld [i - 1]))) {
				minDiff = Math.abs(feld[i] - feld[i - 1]);
			}
		}
		
		return minDiff;
	}
	
	public static int berechneQuersumme (char[] zahl) {

	int summe = 0;
	
	for(int i = 0; i < zahl.length; i++) {
		summe += (int)zahl[i] - 48;
	}
		
	return summe;
		
		
	}
	
	public static void sortArray(double[] feld) {
		double speicher;
	
		for(int i = 0; i < feld.length - 1; i++) {
			for(int j = i + 1; j < feld.length; j++) {
				if(feld[j] < feld[i]) {
					speicher = feld[i];
					feld[i] = feld[j];
					feld[j] = speicher;
				}
			}
		}
		
		for(int i = 0; i < feld.length; i++) {
			System.out.println("Feld [" + i + "] = "  + feld[i]);
		}
	}
}
