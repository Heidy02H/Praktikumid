package praktikum13;

public class Massiivid {

	public static void main(String[] args) {
		int[] arvud = { 3, 4, 6, -3, 9 };

		int[][] neo = { { 1, 1, 1, 1, 1 }, { 2, 3, 4, 5, 6 }, { 3, 4, 5, 6, 7 }, { 4, 5, 6, 7, 8 },
				{ 5, 6, 7, 8, 9 }, };

		// tryki(arvud);

		// tryki(neo);

		// tryki(ridadeSummad(neo));

		// System.out.print(peaDiagonaaliSumma2(neo));

//		System.out.print(korvalDiagonaaliSumma(neo));
		
		// System.out.print(reaMax(arvud));
		
		tryki(ridadeMaksimumid(neo));
		
		

	}

	public static void tryki(int[] massiiv) {

		for (int i = 0; i < massiiv.length; i++) {

			System.out.print(massiiv[i] + " ");

		}

	}

	public static void tryki(int[][] maatriks) {

		// for (int i = 0; i < maatriks.length; i++) {
		// for (int j = 0; j < maatriks[i].length; j++) {
		//
		// System.out.print(maatriks[i][j] + " ");
		//
		// }
		// }

		for (int i = 0; i < maatriks.length; i++) {

			int[] massiiv = maatriks[i];

			tryki(massiiv);
		}

	}

	public static int[] ridadeSummad(int[][] maatriks) {

		int[] summad = new int[maatriks.length];

		for (int j = 0; j < maatriks.length; j++) {

			summad[j] = yheReaSumma(maatriks[j]);
		}

		return summad;

	}

	public static int yheReaSumma(int[] massiiv) {

		int summa = 0;

		for (int i = 0; i < massiiv.length; i++) {
			summa += massiiv[i];
		}

		return summa;
	}

	public static int peaDiagonaaliSumma(int[][] maatriks) {
		int summa = 0;

		for (int i = 0; i < maatriks.length; i++) {
			for (int j = 0; j < maatriks[i].length; j++) {

				if (i == j) {
					summa += maatriks[i][j];
				}

			}

		}

		return summa;

	}

	public static int korvalDiagonaaliSumma(int[][] maatriks) {
		int summa = 0;

		for (int i = 0; i < maatriks.length; i++) {

			summa += maatriks[i][maatriks[i].length - i -1];
		}

		return summa;

	}

	public static int peaDiagonaaliSumma2(int[][] maatriks) {
		int summa = 0;

		for (int i = 0; i < maatriks.length; i++) {

			summa += maatriks[i][i];
		}

		return summa;

	}
	
	public static int[] ridadeMaksimumid(int[][] maatriks) {
		int[] maksimumid = new int[maatriks.length];

		for (int j = 0; j < maatriks.length; j++) {

			maksimumid[j] = reaMax(maatriks[j]);
		}
		
		return maksimumid;
		
	}
	
	public static int reaMax(int[] massiiv) {
		
		int max = Integer.MIN_VALUE;
		
		for (int arv : massiiv) {
			if (arv > max) {
				max = arv;
			}
			
		}
		
		return max;
	}

}
