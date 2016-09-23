package praktikum6;

import lib.TextIO;

public class KullJaKiri {

	public static void main(String[] args) {
		int vise = kasutajaSisestus("Kull või kiri (sisesta 0 või 1)?", 0, 1);
		
		if( vise ==  ) {
			System.out.println("kulll");
		}
		else {
			System.out.println("kiri");
		}
		
		

	}
	
	public static int kasutajaSisestus(String kysimus, int min, int max) {
		
		
		
		
		System.out.println(kysimus);
		
		int sisestus = TextIO.getlnInt();
		
		return (int)(Math.random() * max);
		
	
	
	}
	
//	public static int kasutajaSisestus(int min, int max) {
//		
//		System.out.println("Sisesta üks täisarv");
//		
//		int sisestus = TextIO.getlnInt();
//		
//		
//		while (min > sisestus || max < sisestus) {
//			
//			System.out.println("Ei sobi, sisesta uus täisarv");
//			sisestus = TextIO.getlnInt();
//		
//		} 
//		return sisestus;
//
//	}
}
