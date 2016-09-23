package praktikum6;

public class DiceGame {

	// Kirjutada täringumäng:
	// Programm viskab kaks täringut mängijale ja kaks täringut endale
	// (arvutile), arvutab mõlema mängija summad ja teatab, kellel oli rohkem.

	public static void main(String[] args) {
		int Player1 = throwDice() + throwDice();
		int Player2 = throwDice() + throwDice();

		System.out.println("Mängija 1 summa on " + Player1);
		System.out.println("Mängija 2 summa on " + Player2);

		if (Player1 > Player2) {
			System.out.println("Mängija 1 võitis");
		} else if (Player1 < Player2) {
			System.out.println("Mängija 2 võitis");
		} else {
			System.out.println("Viik!!");
		}

	}

	public static int throwDice() {
		return 1 + (int) (Math.random() * 6);
		
	}

}
