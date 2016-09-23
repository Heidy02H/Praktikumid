package praktikum6;

import lib.TextIO;

public class KullJaKiri {

	public static void main(String[] args) {
		int kasutajaArvab = kasutajaSisestus("Sisesta kull (0) voi kiri (1)?", 0, 1);

		int vise = (Math.random() > 0.5) ? 1 : 0;

		if (kasutajaArvab == vise) {
			System.out.println("Sina arvasid " + kasutajaArvab);
			System.out.println("Viske tulemus oli " + vise);
			System.out.println("Sul on õigus");
		} else {
			System.out.println("Sina arvasid " + kasutajaArvab);
			System.out.println("Viske tulemus oli " + vise);
			System.out.println("Sa eksisid");
		}

	}

	public static int kasutajaSisestus(String kysimus, int min, int max) {

		System.out.println(kysimus);

		int sisestus = TextIO.getlnInt();

		while (min > sisestus || max < sisestus) {

			System.out.println("Ei sobi, sisesta uus täisarv vahemikus " + min + " ja " + max);
			sisestus = TextIO.getlnInt();

		}
		return sisestus;

	}

}
