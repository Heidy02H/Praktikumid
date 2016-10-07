package praktikum8;

import java.util.ArrayList;
import java.util.Collections;

import lib.TextIO;

public class Sort1 {

	public static void main(String[] args) {

		ArrayList<String> nimed = new ArrayList<String>();

		System.out.println("Sisesta nimed");
		String nimi = TextIO.getlnString();

		while (!nimi.equals("")) {
			nimed.add(nimi);
			nimi = TextIO.getlnString();

		}

		Collections.sort(nimed);

		for (String item : nimed) {
			System.out.println(item);
		}

	}

}
