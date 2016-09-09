//


package praktikum4;

import lib.TextIO;

public class CumLaude {

	public static void main(String[] args) {
		double avggrade; // Averege grade of student
		int finalgrade; // final grade of student
		
		System.out.println("Palun sisesta oma keskmine hinne. ");
		avggrade = TextIO.getlnDouble();
		
		System.out.println("Palun sisesta oma lõpuhinne. ");
		finalgrade = TextIO.getlnInt();
		
		
		if (avggrade >= 1 && avggrade <=5 && finalgrade >= 1 && finalgrade <= 5) {
			if (avggrade > 4.5 && finalgrade == 5)
				System.out.println("Jah saad cum laude diplomile!. ");
			else
				System.out.println("Ei saa! ");
		}
		else System.out.println("Vigased hinded. ei saa tulemust väljastada ");

	}

}
