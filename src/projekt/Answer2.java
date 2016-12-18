package projekt;

import java.util.Arrays;

public class Answer2 {

	public static void main(String[] args) {
		System.out.println(result(new double[] {1.0, 2.0, 3.0}));
		// YOUR TESTS HERE
	}

	public static double result(double[] marks) {

		// double[] uus = marks;
		//
		// Arrays.sort(uus);
		//
		// double summa = 0;
		//
		// for (int i = 1; i < uus.length - 1; i++) {
		// summa += uus[i];
		// }
		//
		// double keskmine = summa / (uus.length - 2);
		//
		// return keskmine;

		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;

		for (double i : marks) {
			if (i < min) {
				min = i;
			}
		}

		for (double i : marks) {
			if (i > max) {
				max = i;
			}
		}

		double summa = 0;
		for (int i = 0; i < marks.length; i++) {
			summa += marks[i];
		}

		summa = summa - min - max;

		double keskmine = summa / (marks.length - 2);

		return keskmine;

	}

}
