package praktikum10;

public class Max2D {

	public static void main(String[] args) {
		int[][] neo = { { 1, 3, 6, 7 }, { 2, 3, 3, 1 }, { 17, 4, 5, 0 }, { -20, 13, 16, 17 } };
		
		System.out.println(maksimum2(neo));	}

	private static int maksimum2(int[][] m) {

		int vastus = Integer.MIN_VALUE;
		for (int i = 0; i < m.length; i++) {
			int maks = Max.maksimum(m[i]);
			if (maks > vastus) {
				vastus = maks;
			}

		}
		return vastus;

	}

}
