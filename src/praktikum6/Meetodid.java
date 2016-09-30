package praktikum6;

import lib.TextIO;

public class Meetodid {

	public static void main(String[] args) {

		System.out.println("Sisesta üks täisarv");

		int arv = TextIO.getlnInt();
		int arvKuubis = kuup(arv);

		System.out.println(arvKuubis);

	}

	public static int kasutajaSisestus(String kysimus, int min, int max) {
		System.out.println( kysimus + min + " ja " + max);

		int sisestus = TextIO.getlnInt();

		while (min > sisestus || max < sisestus) {

			System.out.println("Ei sobi, sisesta uus täisarv");
			sisestus = TextIO.getlnInt();

		}
		return sisestus;

	}

	public static int kuup(int number) {

		return number * number * number;
	}

}
