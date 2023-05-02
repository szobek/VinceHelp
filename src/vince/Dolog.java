package vince;

public class Dolog {
	private String name;
	// string azaz sz�veg a name
	private int meret;
	// int azaz sz�m a m�ret, de eez csak p�lda
	
	// p�ld�nyos�t�shoz
	public Dolog(String name, int meret) {
		super();
		this.name = name;
		this.meret = meret;
	}
	
	// getter: visszaadja a name v�ltoz�t
	public String getName() {
		return name;
	}
	//setter: be�ll�tja a v�ltoz�t
	public void setName(String name) {
		this.name = name;
	}
	
	
	// getter: visszaadja a meret v�ltoz�t
	public int getMeret() {
		return meret;
	}
	//setter: be�ll�tja a v�ltoz�t
	public void setMeret(int meret) {
		this.meret = meret;
	}
	
	
	//publikus met�dus ami a f�programb�l van megh�vva
	public void kiir() {
		System.out.println("Oszt�ly publikus met�dusa");
		
	}
	
	
}
