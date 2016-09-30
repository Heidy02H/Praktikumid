package praktikum6;

import lib.TextIO;

public class Vahemik {

	public static void main(String[] args) {
		
		int number = kasutajaSisestus(1, 5);
		System.out.println("Kasutaja sisestas " + number);
		
		

	}
	
	public static int kasutajaSisestus(int min, int max) {
		
		System.out.println("Sisesta üks täisarv vahemikus " + min + " ja " + max );
		
		int sisestus = TextIO.getlnInt();
		
		
		while (min > sisestus || max < sisestus) {
			
			System.out.println("Ei sobi, sisesta uus täisarv");
			sisestus = TextIO.getlnInt();
		
		} 
		return sisestus;
		
		
	}

}
