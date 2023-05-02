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
		// a String a típus.pl int=szam,char=egy karakter,stb
		System.out.println(nev);
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("név2? ");
		try {
			nev2 = br.readLine();
			System.out.println(nev2);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		// vagy scanner
		Scanner s =new Scanner(System.in);
		System.out.print("név3? ");
		nev3=s.nextLine() ;
		System.out.println(nev3);
	try {
		br.close();
	} catch (IOException e) {
		// valami hardveres vagy szoftveres hiba ami miatt nem éri el
		e.printStackTrace();
	}	
		Dolog dologNev = new Dolog("név", 100); // példányosítás, a paraméterek a konstruktor által vannak meghatározva
		dologNev.kiir();
		Dolog megegy = new MegEgyDolog("név", 200, 200);// példányosítás, a paraméterek a konstruktor által vannak meghatározva
		MegEgyDolog harmadik = new MegEgyDolog("név", 300, 300);// példányosítás, a paraméterek a konstruktor által vannak meghatározva
		harmadik.kiir(); // örökölt publkus metódus
		megegy.kiir(); // örökölt publkus metódus
	}

}
