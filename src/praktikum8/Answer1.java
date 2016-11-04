package praktikum8;



public class Answer1 {

	public static void main(String[] args) {
		System.out.println(score(new int[] { 4, 1, 2, 3, 0 })); // 9
		// Your tests here
	}

	public static int score(int[] points) {

		int summa = 0;
		for (int i = 0; i < points.length; i++) {

			summa += points[i];

		}
		
		

		return summa; // TODO!!! Your program here
	}

}
