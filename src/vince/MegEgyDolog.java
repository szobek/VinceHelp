package vince;
//lesz�rmazott oszt�ly.a Dolog-b�l
public class MegEgyDolog extends Dolog{

	private int meret2;

	public MegEgyDolog(String name, int meret, int meret2) {
		super(name, meret); // a super h�vja meg az �s oszt�ly konstruktor�t
		this.meret2 = meret2; // ez ad �rt�ket a helyi v�ltoz�nak
	}
	
}
