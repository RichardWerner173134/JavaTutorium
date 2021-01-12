package shop;

public class Kunde {
	private String name;
	private Warenkorb wkorb;
	
	public Kunde(String name) {
		this.name = name;
		wkorb = new Warenkorb(this.getName());
	}
	
	public Warenkorb getWkorb() {
		return this.wkorb;
	}
	
	public String getName() {
		return name;
	}
	
	public void kauft(Artikel a) {
		System.out.println(this.getName() + " hat den Artikel " + a.getBezeichnung() + " gekauft.");
		this.wkorb.add(a);
	}
	
	public double bezahlt() {
		for(int i = 0; i < this.getWkorb().getAnzahl(); i++){
			if(wkorb.getSumme() >= 0.01 && wkorb.getSumme() <= 9.99) {
				return Math.round((wkorb.getSumme() + 6.00) * 100d) / 100d;
			}else {
				if(wkorb.getSumme() >= 10.00 && wkorb.getSumme() <= 29.99) {
					return Math.round((wkorb.getSumme() + 4.00) * 100d) / 100d;
				}else {
					if(wkorb.getSumme() >= 30.00 && wkorb.getSumme() <= 99.99) {
						return Math.round((wkorb.getSumme() * 1.03) * 100d) / 100d;
					}else {
						if(wkorb.getSumme() >= 100) {
							return Math.round(wkorb.getSumme() * 100d) / 100d;
						}
					}
				}
			}
		}
		return 0.00;
	}
}
