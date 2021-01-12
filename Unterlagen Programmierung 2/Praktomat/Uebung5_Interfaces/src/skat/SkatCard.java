package skat;

import cardgame.PlayingCard;

public class SkatCard extends PlayingCard{
	
	public final static String rank7 = "7";
	public final static String rank8 = "8";
	public final static String rank9 = "9";
	public final static String rank10 = "10";
	public final static String rankBube = "Bube";
	public final static String rankDame = "Dame";
	public final static String rankKoenig = "Koenig";
	public final static String rankAss = "Ass";
	public final static String suitKaro = "Karo";
	public final static String suitHerz = "Herz";
	public final static String suitPik = "Pik";
	public final static String suitKreuz = "Kreuz";
	
	public SkatCard(String farbe, String wert) {
		super(farbe, wert);
		// TODO Auto-generated constructor stub
	}

	public int compareTo(PlayingCard card) {
		if( ( (rankAlsZahl (this.getRank())) == ( rankAlsZahl(card.getRank() )) ) 	//rank1 = rank2 UND farbe1 = farbe2
				&& ( suitAlsZahl(this.getSuit() ) == suitAlsZahl (card.getSuit()) ) ) {
			return 0;
		}
		
		if(suitAlsZahl(card.getSuit()) < suitAlsZahl(this.getSuit())) {		//farbe2 < farbe1
			return 1;
		}
		if(suitAlsZahl(card.getSuit()) == suitAlsZahl(this.getSuit())
				&& (rankAlsZahl(card.getRank()) < rankAlsZahl(this.getRank()))){	//rank2 < rank1 UND farbe2 = farbe1
			return 1;
		}else {
			return -1;
		}
	}
	
	public static int rankAlsZahl(String wert) {
		switch(wert) {
		case rank7: return 7;
		case rank8: return 8;
		case rank9: return 9;
		case rank10: return 10;
		case rankBube: return 11;
		case rankDame: return 12;
		case rankKoenig: return 13;
		case rankAss: return 14;
		}
		
		return 0;
	}
	
	public static int suitAlsZahl(String farbe) {
		switch(farbe) {
		case suitKaro: return 1;
		case suitHerz: return 2;
		case suitPik: return 3;
		case suitKreuz: return 4;
		}
		return 0;
	}
}
