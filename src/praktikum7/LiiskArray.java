package praktikum7;

import java.util.ArrayList;

import lib.TextIO;

public class LiiskArray {

	public static void main(String[] args) {

		System.out.println("Sisesta inimeste arv");

		int inimesteArv = TextIO.getlnInt();
		
		ArrayList<String> nimekiri = new ArrayList<String>();
		
		
		for (int i = 0; i < inimesteArv ; i++) {
			System.out.println("Sisesta nimi nr. " + (i+1));
			String nimi = TextIO.getlnString();
			nimekiri.add(nimi);
		}
		
		
		int liisk = Arvaara.randomNumber(0, inimesteArv);
		
		System.out.println(nimekiri.get(liisk));
		
		

	}

}
