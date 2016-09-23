package praktikum6;

public class Throw5 {

	public static void main(String[] args) {

		int summa = 0;

		for (int count = 0; count < 5; count++) {
			summa += throwDice();
			System.out.println(summa);

		}

		System.out.println("Täringuvisete summa on " + summa);

	}

	public static int throwDice() {
		return 1 + (int) (Math.random() * 6);
	}

}
