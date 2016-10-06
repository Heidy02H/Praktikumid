package praktikum7;

public class Summa {

	public static int summa(int[] massiiv) {
	   
		int t = 0;
		for (int i= 0 ; i < massiiv.length ; i++ ) {
			t += massiiv[i];
		}
		
		return t;
	   
	}

	public static void main(String[] args) {
	    // sedasi saab meetodi välja kutsuda
	    int summa = summa(new int[] {4, 3, 1, 7, -1});
	    System.out.println(summa);
	}

}
