package cardgame;

public abstract class PlayingCard {
	protected String suit;
	protected String rank;
	
	
	public PlayingCard(String farbe, String wert) {
		this.suit = farbe;
		this.rank = wert;
	}
	
	abstract public int compareTo(PlayingCard card1);
	
	/**
	 * @return suit und rank getrennt durch Leerzeichen
	 */
	public String toString() {
		return this.suit + " " + this.rank;
	}
	
	/**
	 * @return the suit
	 */
	public String getSuit() {
		return suit;
	}

	/**
	 * @return the rank
	 */
	public String getRank() {
		return rank;
	}

	/**
	 * @param suit the suit to set
	 */
	public void setSuit(String suit) {
		this.suit = suit;
	}

	/**
	 * @param rank the rank to set
	 */
	public void setRank(String rank) {
		this.rank = rank;
	}
}
