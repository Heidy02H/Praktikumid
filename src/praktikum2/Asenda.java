package praktikum2;

import lib.TextIO;

public class Asenda {

	public static void main(String[] args) {
		
		String sona;
		String asendus;
		
		System.out.print("Sisesta mõni sõna ");
		sona = TextIO.getlnString();
		
		asendus = sona.replace("a", "_").replace("A", "_");
		
		System.out.println(asendus);

	}

}
