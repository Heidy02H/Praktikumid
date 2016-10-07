package praktikum8;

import java.util.Arrays;

public class Massiiiv2D {

	public static void main(String[] args) {

		int[] numbrid = new int[] { 2, 9, 5, 6, 1 };

		int[][] A = { { 21, 0, 6, -1 }, 
					{ 7, -3, 16, 5 }, 
					{ -5, -2, 8, -9 } 
					};

		System.out.println(maksimum(A));
		System.out.println();
		
		

	}

	// meetod, mis leiab ühemõõtmelise massiivi maksimumi
	public static int maksimum(int[] massiiv) {

		Arrays.sort(massiiv);

		return massiiv[massiiv.length - 1];

	}

	// meetod, mis leiab maatriksi maksimumi
	public static int maksimum(int[][] maatriks) {
		for (int i = 0; i < maatriks.length; i++) {
			maksimum(maatriks[i]);
			
		}
		
		int max = maatriks[0][maatriks[0].length -1];
		
		for (int i = 0; i < maatriks.length; i++){
			
			if (max < maatriks[i][maatriks[0].length-1])
				max = maatriks[i][maatriks[0].length-1];	
			
		}
			

		return max;

	}
	

}
