package naited;

public class Tulu {

	public static void main(String[] args) {

		int palk = 1200;
		int min = 400;
		double maksuM = 0.2;

		double maks;

		if (palk >= min) {
			maks = ((palk - min) * maksuM) * 12;
		} else
			maks = 0;

		System.out.println(maks);

	}

}
