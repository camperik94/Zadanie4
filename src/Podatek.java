
public class Podatek {
	private double dochod;
	private double podatek;
	
	public void setPodatek(double podatek) {
		this.podatek = podatek;
	}
	public double getPodatek() {
		return podatek;
	}
	
	public void setDochod(double dochod) {
		this.dochod = dochod;
	}
	public double getDochod() {
		return dochod;
	}
	
	
	public double oblicz(double dochod) {
		if (dochod < 85528) {
			podatek = (dochod * 0.18) + 556.02;
			//System.out.println(podatek);
			dochod = dochod - podatek;
		} else {
			podatek = dochod - 85528.02 + 14839.02;
			//System.out.println(podatek);
			dochod = dochod - podatek;
			
		}
		return dochod;
	}
	
	public Podatek(double dochod) {
		this.dochod = dochod;
	}
}
