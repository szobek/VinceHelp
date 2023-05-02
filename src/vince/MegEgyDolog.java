package vince;
//leszármazott osztály.a Dolog-ból
public class MegEgyDolog extends Dolog{

	private int meret2;

	public MegEgyDolog(String name, int meret, int meret2) {
		super(name, meret); // a super hívja meg az õs osztály konstruktorát
		this.meret2 = meret2; // ez ad értéket a helyi változónak
	}
	
}
