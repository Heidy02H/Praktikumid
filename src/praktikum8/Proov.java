package praktikum8;

public class Proov {

	public static void main(String[] args) {
		System.out.println(allaKeskmise(new double[] { 0. }));
		// YOUR TESTS HERE
	}

	public static int allaKeskmise(double[] d) {

		double summa = 0;

		for (int i = 0; i < d.length; i++) {
			summa += d[i];
		}

		double keskmine = summa / d.length;

		int count = 0;

		for (int i = 0; i < d.length; i++) {
			if (d[i] < keskmine) {
				count += 1;
			}
		}

		return count; // YOUR PROGRAM HERE
	}

}
