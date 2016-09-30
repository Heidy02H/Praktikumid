package praktikum7;

import praktikum6.DiceGame;
import praktikum6.Meetodid;

public class PanustegaTaring {

	public static void main(String[] args) {
		int raha = 100;

		while (raha > 0) {
			System.out.println("Sul on raha " + raha);
			int kasutajaArvab = Meetodid.kasutajaSisestus("Millisele täringule sa panustad vahemikus ", 1, 6);
			int panus = 0;
			if (raha >= 25) {
				panus = Meetodid.kasutajaSisestus("Sisesta oma panus vahemikus ", 0, 25);
			} else
				panus = Meetodid.kasutajaSisestus("Sisesta oma panus vahemikus ", 0, raha);

			int vise = DiceGame.throwDice();

			if (vise == kasutajaArvab) {
				System.out.println("Õige!");
				raha = raha + panus * 5;

			} else {
				System.out.println("Vale");
				raha = raha - panus;

			}

		}
		System.out.println("Raha on otsas");

	}

}
