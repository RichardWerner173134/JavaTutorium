package shop;

public class Artikel {
	private String bezeichnung;
	private double preis;
	private int zaehler = 0;
	
	public Artikel(String bezeichnung, double preis) {
		this.bezeichnung = bezeichnung;
		this.preis = preis;
		zaehler++;		
	}
	
	public String getBezeichnung() {
		return bezeichnung;
	}
	
	public double getPreis() {
		return preis;
	}

	/**
	 * @return the zaehler
	 */
	public int getZaehler() {
		return zaehler;
	}

	/**
	 * @param zaehler the zaehler to set
	 */
	
}
