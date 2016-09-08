package praktikum2;

import lib.TextIO;

public class Korrutis {

	public static void main(String[] args) {
		double esimene;  // Esimene küsitud arv.
        double teine;       // Teine küsitud arv.
        double korrutis;   // kahe arvu korrutis.

        System.out.print("Sisesta esimene arv: ");
        esimene = TextIO.getlnDouble();

        System.out.print("Sisesta teine arv: ");
        teine = TextIO.getlnDouble();

        korrutis = esimene * teine;       // Arvuta korrutis.
        

        System.out.printf("Nende arvude korrutis on ");
        System.out.println(korrutis);

	}
}
