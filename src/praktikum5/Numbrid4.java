package praktikum5;

public class Numbrid4 {

	public static void main(String[] args) {
		
		
		int tabeliSuurus = 7;
		
		for (int i = tabeliSuurus ; i > 0 ; i--) {
			for (int j = tabeliSuurus ; j > 0 ; j--) {
				if (i == j) { 
					System.out.printf("%3d", 1);
				} else {
					System.out.printf("%3d", 0);
					}
			}
			System.out.println();
		}

	}

}
