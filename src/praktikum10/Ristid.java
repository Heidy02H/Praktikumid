package praktikum10;

import java.util.ArrayList;

import lib.TextIO;

public class Ristid {

	public static void main(String[] args) {

		ArrayList<Integer> numbrid = new ArrayList<Integer>();
		
		int suurim = Integer.MIN_VALUE;

		while (true) {
			System.out.println("Sisesta positiivsed taisarvud ja lopuks 0");
			int number = TextIO.getlnInt();
			if (number == 0) {
				break;
			}
			if (number > 0) {
				numbrid.add(number);	
			} else {
				System.out.println("Negatiivne ei sobi.");
			}
			
			if (number > suurim){
				suurim = number;
			}
			

		}
		
		double kordaja = 10./suurim; 
		
		for (int i = 0 ; i < numbrid.size() ; i++) {
			int nr = numbrid.get(i);
			System.out.printf("%2d %s\n", nr, ristikesed(nr, kordaja)  );
		}

	}

	public static String ristikesed(int n, double kordaja) {

		String x = "";
		for (int i = 0; i < n*kordaja; i++) {
			x += "x";
		}
		return x;

	}
	
	

}
