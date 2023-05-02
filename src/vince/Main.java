package vince;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
			// TODO Auto-generated catch block
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
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
		
	}

}
