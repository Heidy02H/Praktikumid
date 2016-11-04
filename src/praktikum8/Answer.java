package praktikum8;

public class Answer {

	public static void main(String[] args) {
		int[] res = veeruMinid(new int[][] { { 1, 2, 6 }, { 4, 5, 3 } }); // {1,
																			// 2,
																			// 3}
		// YOUR TESTS HERE
	}

	public static int[] veeruMinid (int[][] m) {
	      
		   int miinimum = Integer.MAX_VALUE;
		   int[] vastus = new int[0];
				   
		   
		   
		   for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					if (m[i][j] < miinimum) {
						miinimum = m[i][j];
						
						
					}
					
					
					
				}
		   }
		   
		   System.out.println(vastus);
		   
	      return vastus;
	   

	}
}

