package praktikum4;

import lib.TextIO;

public class Agecompare {

	public static void main(String[] args) {
		int age1; // First entered age
		int age2; // Second entered age
		
		System.out.println("Palun sisesta esimene vanus. ");
		age1 = TextIO.getlnInt();
		
		System.out.println("Palun sisesta teine vanus. ");
		age2 = TextIO.getlnInt();
		
		if (age1 > age2) {
			int vahe1 = (age1 -age2);
			if (vahe1 < 5)
				System.out.println("Sobib!");
			else if (vahe1 >= 5 && vahe1 < 10)
				System.out.println("Midagi krõbedat");
			else System.out.println("Midagi väga krõbedat"); 
		}
		else {
			int vahe1 = (age2 -age1);
			if (vahe1 < 5)
				System.out.println("Sobib!");
			else if (vahe1 >= 5 && vahe1 < 10)
				System.out.println("Midagi krõbedat");
			else System.out.println("Midagi väga krõbedat");
		}
			
		
		
		

	}

}
