package naited;

import lib.TextIO;

public class Nimi {

	public static void main(String[] args) {
		System.out.println("Palun sisesta oma ees ja perekonnanimi eraldatuna yhe tyhikuga");
		String kasutajaNimi = TextIO.getln();
		int tyhik = kasutajaNimi.indexOf(" ");
		String eesnimi = kasutajaNimi.substring(0, tyhik);	
		String perekonnanimi = kasutajaNimi.substring(tyhik+1);
		
		System.out.println("Sinu eesnimi on " + eesnimi + "ja selles on " + eesnimi.length() + " tahte");
		System.out.println("Sinu perekonnanimi on " + perekonnanimi + "ja selles on " + perekonnanimi.length() + " tahte");
		System.out.println("Sinu initsiaalid on " + eesnimi.charAt(0) + perekonnanimi.charAt(0));

	}

}
