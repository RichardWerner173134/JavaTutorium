package skat;

import cardgame.Deck;
import cardgame.PlayingCard;

public class SkatGame implements Deck {
	public final static int kartenAnzahl = 32;
	public final static int kartenAnzahlProSpieler = 10;
	public final static int aktiveSpieler = 3;

	
	private int count = kartenAnzahl;

	private PlayingCard[] aktuellesDeck = new SkatCard[kartenAnzahl];

	public SkatGame() {												//fertig
		for(int i = 1; i < 4+1; i++) {														//farbe
			for(int j = 1; j < 8+1; j++) {													//wert
				SkatCard neueKarte = new SkatCard(rankAlsString(i), suitAlsString(j));		//Erzeugung aller 32 Karten eines Decks		
				aktuellesDeck[(i-1) * 8 + (j-1)] = neueKarte;								//Speichern der Karte an Stelle 1-32
			}
		}
	}	
	
	@Override
	public PlayingCard[] getCards() {								//fertig
		// TODO Auto-generated method stub
		if(getCount() != 0) {
			PlayingCard[] kopie = new SkatCard[getCount()];
			for(int i = 0; i < getCount(); i++) {
				kopie[i] = new SkatCard(aktuellesDeck[i].getSuit(), aktuellesDeck[i].getRank());
			}
			return kopie;
		}else {
			System.out.println("Stapel leer --> Kopie vom Stapel leer");
			return null;
		}
	}

	@Override
	/**
	 * @return the count
 	*/
	public int getCount() {											//fertig
		// TODO Auto-generated method stub
		return this.count;
	}

	@Override
	public void addCard(PlayingCard card) {							//fertig
		// TODO Auto-generated method stub
		
		
		if(card == null)return;
		if(!(card instanceof SkatCard))return;
		if(!(card.getSuit().equals(SkatCard.suitHerz)
				|| card.getSuit().equals(SkatCard.suitKaro) 
				|| card.getSuit().equals(SkatCard.suitPik)
				|| card.getSuit().equals(SkatCard.suitKreuz)))return;
		if(!(card.getRank() == SkatCard.rank7
				|| card.getRank() == SkatCard.rank8
				|| card.getRank() == SkatCard.rank9
				|| card.getRank() == SkatCard.rank10
				|| card.getRank() == SkatCard.rankBube
				|| card.getRank() == SkatCard.rankDame
				|| card.getRank() == SkatCard.rankKoenig
				|| card.getRank() == SkatCard.rankAss))return;
		if(getCount() >= kartenAnzahl)return;
		for(int i = 0; i < getCount(); i++) {
			if(card.compareTo(aktuellesDeck[i]) == 0)return;
		}
		
		/*
		 * eigentliches addCard
		 */
		aktuellesDeck[getCount()] = card;
		count++;
	}
	
	@Override
	public void insertCard(PlayingCard card, int position) {		//fertig
		// TODO Auto-generated method stub
		
		
		if(card != null && card instanceof SkatCard) {
			if(card.getSuit().equals(SkatCard.suitHerz)
				|| card.getSuit().equals(SkatCard.suitKaro) 
				|| card.getSuit().equals(SkatCard.suitPik)
				|| card.getSuit().equals(SkatCard.suitKreuz)){
				
				if(card.getRank() == SkatCard.rank7
					|| card.getRank() == SkatCard.rank8
					|| card.getRank() == SkatCard.rank9
					|| card.getRank() == SkatCard.rank10
					|| card.getRank() == SkatCard.rankBube
					|| card.getRank() == SkatCard.rankDame
					|| card.getRank() == SkatCard.rankKoenig
					|| card.getRank() == SkatCard.rankAss) {
				
					
					
					for(int i = 0; i < getCount(); i++) {
						if(card.compareTo(aktuellesDeck[i]) == 0){
							return;
						}
					}
					
						if(position - 1 < kartenAnzahl && position > 0 && getCount() < kartenAnzahl) {
							for(int i = getCount() - 1;  i >= position - 1; i--) {
								aktuellesDeck[i+1] = new SkatCard(aktuellesDeck[i].getSuit(), aktuellesDeck[i].getRank());
							}
							aktuellesDeck[position - 1] = new SkatCard(card.getSuit(), card.getRank());
							count++;
						}else System.out.println("Bitte Position überprüfen");
				}else {System.out.println("falscher Wert");}	
			}else {System.out.println("falsche Farbe");}
		}else {System.out.println("Karte null oder keine SkatKarte");}
}
	
	@Override
	
	public PlayingCard drawCard() {									//fertig
		// TODO Auto-generated method stub
		if(getCount() > 0) {
			PlayingCard obersteKarte = aktuellesDeck[getCount() - 1];
			aktuellesDeck[getCount() - 1] = null;
			count--;
			return obersteKarte;
		}else {
			System.out.println("Stapel leer! Karte ziehen nicht mehr möglich.");
			return null;
		}
	}

	@Override
	public void shuffleDeck() {										//fertig
		// TODO Auto-generated method stub
		for(int i = 0; i < 1000000; i++) {
			int randomStelle1 = (int) (Math.random() * 32);
			int randomStelle2 = (int) (Math.random() * 32);
			PlayingCard copy = aktuellesDeck[randomStelle1];
			aktuellesDeck[randomStelle1] = aktuellesDeck[randomStelle2];
			aktuellesDeck[randomStelle2] = copy;
		}
	}

	@Override
	public void sortDeck() {										//fertig
		// TODO Auto-generated method stub				
		for(int i = 0; i < getCount() - 1; i++) {
			for(int j = i + 1; j < getCount(); j++) {
				if(aktuellesDeck[i].compareTo(aktuellesDeck[j]) == 1) {
					SkatCard speicherCard = new SkatCard(aktuellesDeck[i].getSuit(), aktuellesDeck[i].getRank());
					aktuellesDeck[i] = null;
					aktuellesDeck[i] = new SkatCard(aktuellesDeck[j].getSuit(), aktuellesDeck[j].getRank());
					aktuellesDeck[j] = null;
					aktuellesDeck[j] = new SkatCard(speicherCard.getSuit(), speicherCard.getRank());
				}
			}
		}
		
		
		
		
	}

	@Override
	public void printDeck() {										//fertig
		// TODO Auto-generated method stub
		for(int i = getCount() - 1; i >= 0; i--) {
			System.out.println("[" + i + "]" + this.aktuellesDeck[i].toString());
		}
	}
	
	public PlayingCard[][] dealCards(int spieleranzahl) {			//fertig
		if(spieleranzahl != aktiveSpieler) {
			System.out.println("ungültige Spieleranzahl");
			return null;
		}
		
		PlayingCard[][] kartenHand = new SkatCard[aktiveSpieler][kartenAnzahlProSpieler];
		for(int i = 0; i < kartenHand.length; i++) {
			for(int j = 0; j < kartenHand[0].length; j++) {
				kartenHand[i][j] = drawCard();
			}
		}
		sortHand(kartenHand);
		return kartenHand;
	}
	
	public String rankAlsString(int farbe) {						//fertig
		switch(farbe) {
		case 1: return SkatCard.suitKaro; 
		case 2: return SkatCard.suitHerz; 
		case 3: return SkatCard.suitPik;  
		case 4: return SkatCard.suitKreuz;
		}
		return null;
		
	}
	
	public String suitAlsString(int wert) {							//fertig
		switch (wert) {
		case 1: return SkatCard.rank7;
		case 2: return SkatCard.rank8;
		case 3: return SkatCard.rank9;
		case 4: return SkatCard.rank10;
		case 5: return SkatCard.rankBube;
		case 6: return SkatCard.rankDame;
		case 7: return SkatCard.rankKoenig;
		case 8: return SkatCard.rankAss;
		}
		return null;
	}

	/**
	 * @return the aktuellesDeck
 	*/
	public PlayingCard[] getAktuellesDeck() {						//fertig
		return aktuellesDeck;
	}
	
	@Override
	
	public void sortHand(PlayingCard[][] cards) {					//fertig
		// TODO Auto-generated method stub
		for(int k = 0; k < cards.length; k++) {
			PlayingCard [] hand = cards[k];
			
			for(int i = hand.length - 1; i > 0; i--) {
				for(int j = i - 1; j > -1; j--) {
					if(hand[j].compareTo(hand[i]) == 1) {
						SkatCard speicherCard = new SkatCard(hand[i].getSuit(), hand[i].getRank());
						hand[i] = null;
						hand[i] = new SkatCard(hand[j].getSuit(), hand[j].getRank());
						hand[j] = null;
						hand[j] = new SkatCard(speicherCard.getSuit(), speicherCard.getRank());
					}
				}
			}
			
			
			
		}
	}
	

}