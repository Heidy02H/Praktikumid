package naited;

public class JuhuMaatriks {

	public static void main(String[] args) {

		int n = 6;

		double[][] f = genMatrix(n);

		for (int i = 0; i < f.length; i++) {
			for (int j = 0; j < f[i].length; j++) {
				System.out.println(f[i][j]);
			}
		}
		
		System.out.println();
		
		for(double [] row: f) {
			for( double number: row) {
				System.out.println(number);
			}
		}
	}

	public static double[][] genMatrix(int n) {

		double[][] m = new double[n][n];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = Math.random();
			}

		}

		return m;

	}

}
