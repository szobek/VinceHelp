package vince;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		String nev = "Vince";
		String nev2 = "";
		String nev3 = "";
		// a String a t�pus.pl int=szam,char=egy karakter,stb
		System.out.println(nev);
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("n�v2? ");
		try {
			nev2 = br.readLine();
			System.out.println(nev2);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		// vagy scanner
		Scanner s =new Scanner(System.in);
		System.out.print("n�v3? ");
		nev3=s.nextLine() ;
		System.out.println(nev3);
	try {
		br.close();
	} catch (IOException e) {
		// valami hardveres vagy szoftveres hiba ami miatt nem �ri el
		e.printStackTrace();
	}	
		Dolog dologNev = new Dolog("n�v", 100); // p�ld�nyos�t�s, a param�terek a konstruktor �ltal vannak meghat�rozva
		dologNev.kiir();
		Dolog megegy = new MegEgyDolog("n�v", 200, 200);// p�ld�nyos�t�s, a param�terek a konstruktor �ltal vannak meghat�rozva
		MegEgyDolog harmadik = new MegEgyDolog("n�v", 300, 300);// p�ld�nyos�t�s, a param�terek a konstruktor �ltal vannak meghat�rozva
		harmadik.kiir(); // �r�k�lt publkus met�dus
		megegy.kiir(); // �r�k�lt publkus met�dus
	}

}
