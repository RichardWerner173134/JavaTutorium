package main;

import shop.Artikel;
import shop.Kunde;

public class Main {

	public static void main(String[] args) {

		Kunde Peter = new Kunde("Peter");
		Kunde Ina = new Kunde("Ina");
		Kunde Dieter = new Kunde("Dieter");
		
		Artikel a = new Artikel("Schuhe", 50.00);
		Artikel b = new Artikel("Handy", 1000.00);
		Artikel c = new Artikel("Uhr", 80.00);
		Artikel d = new Artikel("Hose", 79.99);
		Artikel e = new Artikel("Jacke", 60.50);
		

//		remove first
		Peter.kauft(b);
		Peter.kauft(d);
		Peter.kauft(c);
		Peter.kauft(e);
		Peter.kauft(b);
		Peter.kauft(c);
		Peter.getWkorb().remove(b);

//		remove last
		Ina.kauft(a);
		Ina.kauft(c);
		Ina.kauft(e);
		Ina.kauft(b);
		Ina.getWkorb().remove(b);
	
//		remove all
		Dieter.kauft(b);
		Dieter.kauft(a);
		Dieter.kauft(b);
		Dieter.getWkorb().remove(a);
		Dieter.getWkorb().remove(b);
		
		System.out.println(Peter.getName() + " bezahlt " + Peter.bezahlt() + "€ für " + Peter.getWkorb().getAnzahl() + " Artikel.");
		System.out.println(Ina.getName() + " bezahlt " + Ina.bezahlt()+ "€ für " + Ina.getWkorb().getAnzahl() + " Artikel.");
		System.out.println(Dieter.getName() + " bezahlt " + Dieter.bezahlt()+ "€ für " + Dieter.getWkorb().getAnzahl() + " Artikel.");

	
	}

}
