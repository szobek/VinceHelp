package vince;

public class Dolog {
	private String name;
	// string azaz szöveg a name
	private int meret;
	// int azaz szám a méret, de eez csak példa
	
	// példányosításhoz
	public Dolog(String name, int meret) {
		super();
		this.name = name;
		this.meret = meret;
	}
	
	// getter: visszaadja a name változót
	public String getName() {
		return name;
	}
	//setter: beállítja a változót
	public void setName(String name) {
		this.name = name;
	}
	
	
	// getter: visszaadja a meret változót
	public int getMeret() {
		return meret;
	}
	//setter: beállítja a változót
	public void setMeret(int meret) {
		this.meret = meret;
	}
	
	
	//publikus metódus ami a fõprogramból van meghívva
	public void kiir() {
		System.out.println("Osztály publikus metódusa");
		
	}
	
	
}
