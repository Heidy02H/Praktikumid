package praktikum5;

public class Numbrid6 {

	public static void main(String[] args) {
		int tabeliSuurus = 20;
		
		for (int i = 0 ; i < tabeliSuurus; i++) {
			for (int j = 0; j < tabeliSuurus; j++) {
				if (i+j < 10) {
					System.out.print((i+j)%10 + " ");
				} else {
					System.out.print((i+j)%10 + " ");
				}
			}
			System.out.println();
		}
		
	}

}


