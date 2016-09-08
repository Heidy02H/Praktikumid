package praktikum2;

import lib.TextIO;

public class Loendatahti {

	public static void main(String[] args) {
		
		int nimepikkus;
		
		System.out.print("Palun sisesta oma nimi.");
		
		nimepikkus = TextIO.getlnString().length();
		
		System.out.println(nimepikkus);

	}

}
