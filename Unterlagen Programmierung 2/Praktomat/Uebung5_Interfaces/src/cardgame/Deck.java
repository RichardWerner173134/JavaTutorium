package cardgame;

public interface Deck {
	public PlayingCard[] getCards();
	public int getCount();
	public void addCard(PlayingCard card);
	public void insertCard(PlayingCard card, int position);
	public PlayingCard drawCard();
	public void shuffleDeck();
	public void sortDeck();
	public void printDeck();
	public PlayingCard[][] dealCards(int spieleranzahl);
	public void sortHand(PlayingCard[][] cards); 

}