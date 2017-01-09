package naited;

import lib.TextIO;

public class Tervitus {

	public static void main(String[] args) {
		System.out.println("Mis su nimi on?");
		String nimi = TextIO.getln();		
		System.out.println("Tere " + nimi.toUpperCase() +" !");

	}

}
