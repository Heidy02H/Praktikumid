package naited;

import java.util.ArrayList;

public class Paarid {

	public static void main(String[] args) {

		String[] tydrukud = { "Mari", "Kadri", "Kristi" };
		String[] poisid = { "Jaan", "Karl", "Mart" };

		ArrayList<String> tyd = new ArrayList<String>();

		for (String t : tydrukud) {
			tyd.add(t);
		}

		for (String poiss : poisid) {
			String valitu = tyd.get(random1(tyd));
			tyd.remove(valitu);

			System.out.println(poiss + " ja " + valitu);
		}
	}
	
	public static int random1(ArrayList<String> m) {
		int rand = (int) (Math.random() * m.size());
		return rand;
	}

}
