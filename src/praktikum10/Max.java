package praktikum10;

public class Max {

	public static void main(String[] args) {
		int[] massiiv = {1, 3, 6, 7, 8, 3, 5, 7, 21, 3};
		
		System.out.println(maksimum(massiiv));
		
		
	}	
	
	public static int maksimum (int [] massiiv) {
		
		int maks = Integer.MIN_VALUE;
		
		for (int i = 0 ; i < massiiv.length ; i++) {
			if (maks < massiiv[i]) {
				maks = massiiv[i];
			}
		}
		return maks;
	}
	

}
