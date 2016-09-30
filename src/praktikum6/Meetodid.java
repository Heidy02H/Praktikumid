package praktikum6;

import lib.TextIO;

public class Meetodid {

	public static void main(String[] args) {
		
		System.out.println("Sisesta üks täisarv");
		
		int arv = TextIO.getlnInt();
		int arvKuubis = kuup(arv);
		
		System.out.println(arvKuubis);

	}
	
//	public static int kasutajaSisestus(String kysimus, int min, int max) {
//		
//	}
	
	public static int kuup(int number ) {
	
		return number*number*number; 
	}

}
