package praktikum8;

public class Kuulujutud {

	public static void main(String[] args) {
		
		String[] naised = {"Laura", "Liina" , "Kadri", "Mari"};
		String[] mehed = {"Kristjan", "Kaspar" , "Kaupo", "Ülo"};
		String[] tegevused = {"jooksevad", "söövad" , "joovad", "laulavad"};
		
		int i = (int)(Math.random() * naised.length);
		int j = (int)(Math.random() * mehed.length);
		int k = (int)(Math.random() * tegevused.length);
		
		
		System.out.println(naised[i] + " ja " + mehed[j] + " " + tegevused[k]);
		

	}

}
