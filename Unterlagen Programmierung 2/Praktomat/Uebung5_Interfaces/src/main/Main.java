package main;

import cardgame.PlayingCard;
import skat.SkatCard;
import skat.SkatGame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SkatGame neuesSpiel = new SkatGame();
		neuesSpiel.printDeck();
		System.out.println();
		
		neuesSpiel.shuffleDeck();
		System.out.println("gemischt:" );
		neuesSpiel.printDeck();
		System.out.println();
		
		System.out.println("sortiert:");
		neuesSpiel.sortDeck();
		neuesSpiel.printDeck();
		System.out.println();
		
		neuesSpiel.shuffleDeck();
		System.out.println("gemischt:" );
		neuesSpiel.printDeck();
		try{
			PlayingCard[][] hand = neuesSpiel.dealCards(3);
			for(int i = 0; i < 3; i++) {
				System.out.print("Hand " + (i + 1) + ": ");
				for(int j = 0; j < 10; j++) {
					if(j == hand[0].length - 1) {
						System.out.println(hand[i][j]);
					}else {
						System.out.print(hand[i][j] + "   ||   ");
					}
				}
			}
			
			System.out.println("Skat:");
			neuesSpiel.printDeck();
		}catch(NullPointerException e) {
			System.out.println("Hand kann nicht angezeigt werden");
			e.printStackTrace();
		}		
		System.out.println(new SkatCard("Kreuz", "8").compareTo(new SkatCard("Herz", "8")) );
	
		SkatGame spiel = new SkatGame();

		spiel.insertCard(new SkatCard("Kreuz", "Ass"),32);
		spiel.printDeck();
		
		SkatGame s = new SkatGame();
		
		s.shuffleDeck();
		s.printDeck();

        while(s.getCount()>0){
            s.drawCard();
        }

		s.addCard(new SkatCard("Herz","Koenig"));
		System.out.println("Deck:" );

		s.printDeck();
				
	}

}
