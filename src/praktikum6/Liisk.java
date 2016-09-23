package praktikum6;

import lib.TextIO;

public class Liisk {

	public static void main(String[] args) {
		
		System.out.println("Sisesta inimeste arv");
		
		int inimesteArv = TextIO.getlnInt();
		
		int valik = (int )(Math.random() * inimesteArv + 1);
		
		System.out.println("Valitusks osutus inimene nr " + valik);

	}

}
