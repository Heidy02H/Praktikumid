package praktikum4;

import lib.TextIO;

public class Password {

	public static void main(String[] args) {
		String salasona;
		
		do {
			System.out.println("Palun sisesta oma salasõna. ");
			salasona = TextIO.getln();
			
			
			if (salasona.equals("saladus"))
				System.out.println("Õige salasõna ");
			else 
				System.out.println("Vale salasõna ");
		} while (!salasona.equals("saladus"));
		

	}

}
