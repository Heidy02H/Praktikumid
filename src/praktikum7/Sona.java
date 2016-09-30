package praktikum7;

import lib.TextIO;

public class Sona {

	public static void main(String[] args) {
		System.out.println("Palun sisesta üks sõna ");
		String sona = TextIO.getln();
		String reverse = "";

		for (int i = sona.length() - 1; i >= 0; i--) {
			reverse = reverse + sona.substring(i, i + 1);

		}
		System.out.println(reverse);

	}

}
