package praktikum5;

import lib.TextIO;

public class Numbrid5 {

	public static void main(String[] args) {

		System.out.println("Palun sisesta tabeli suurus. ");
		int tabeliSuurus = TextIO.getlnInt();

		trykiAaris(tabeliSuurus);

		for (int i = 0 ; i < tabeliSuurus; i++) {
			for (int j = 0; j < tabeliSuurus; j++) {
				if (i == j || i+j == tabeliSuurus -1) {
					System.out.print("x");
				} else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
		
		trykiAaris(tabeliSuurus);

	}
	
	public static void trykiAaris(int tabeliSuurus) {
		for (int i = 0; i < tabeliSuurus * 2-1; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		
	}
}