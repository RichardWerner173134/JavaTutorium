package shop;

public class Warenkorb {
	private int anzahl = 0;				
	private Artikel artFeld[];			
	private String kundenname;
	
	public Warenkorb(String wKunde) {
		this.kundenname = wKunde;
	}
	
	public void add(Artikel a) {
		if(this.anzahl == 0) {
			this.artFeld = new Artikel[100];
		}
		
		if(this.anzahl < 100 && this.anzahl >= 0 && a != null) {
			this.artFeld[this.anzahl] = a;
			anzahl++;
		}
	}
	
	public double getSumme() {
		double summe = 0.0;
		for(int i = 0; i < this.anzahl; i++) {
			summe += this.artFeld[i].getPreis();
			
		}
		return summe;
	}
	
	public int getAnzahl() {
		return this.anzahl;
	}
	
	public void remove(Artikel a) {
		try{
			for(int i = 0; i < 100; i++) {
				for(int j = 0; j < this.getAnzahl(); j++) {
					if(this.artFeld[j].getBezeichnung().equals(a.getBezeichnung()) && this.artFeld[j].getPreis() == a.getPreis()) {
						System.out.println(this.kundenname + " hat den Artikel " + a.getBezeichnung() + " gelöscht");
					
						this.artFeld[j] = this.artFeld[this.anzahl - 1];
						this.artFeld[this.anzahl - 1] = null;
						this.anzahl--;
						i--;
				
					}
				}
			}
			
		}catch (NullPointerException e) {
			System.out.println();
		}
	}
}
