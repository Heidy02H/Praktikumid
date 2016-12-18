package projekt;

public class Answer {

	public static void main(String[] args) {
		int[][] res = liitmisTabel(9);

	}

	public static int[][] liitmisTabel(int n) {
		int[][] a = new int[n][n];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = i + j;
			}

		}

		return a;
	}

}