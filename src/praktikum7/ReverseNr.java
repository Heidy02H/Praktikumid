package praktikum7;

import java.util.ArrayList;

import lib.TextIO;

public class ReverseNr {

	public static void main(String[] args) {
		System.out.println("Sisesta numbrite arv");

		int inimesteArv = TextIO.getlnInt();
		
		ArrayList<Integer> nimekiri = new ArrayList<Integer>();
		ArrayList<Integer> reverse = new ArrayList<Integer>();
		
		
		for (int i = 0; i < inimesteArv ; i++) {
			System.out.println("Sisesta arv nr. " + (i+1));
			int number = TextIO.getlnInt();
			nimekiri.add(number);
		}
		
		for (int i = (inimesteArv -1); i >= 0 ; i--) {
			int j = nimekiri.get(i);
			reverse.add(j);
		}

		System.out.println(reverse);
	}

}
