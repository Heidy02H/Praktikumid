package projekt;

/*
 * Koostage Java meetod etteantud t‰isarvumaatriksi m reamiinimumide massiivi leidmiseks
 * (massiivi i-s element on maatriksi i-nda rea v‰hima elemendi v‰‰rtus). Read vıivad olla erineva pikkusega.
Write a method in Java to find the array of minimums of rows of a given matrix of
integers m (i-th element of the answer is the minimum of elements of the i-th row in the matrix).
Rows might be of different length.
   public static int[] reaMinid (int[][] m)
 */

public class Answer4 {

	   public static void main (String[] args) {
	      int[] res = reaMinid (new int[][] { {1,2,3}, {4,5,6} }); // {1, 4}
	      // YOUR TESTS HERE
	   }

	   public static int[] reaMinid (int[][] m) {
	      int[] min = new int[m.length];
	      for (int l = 0; l < m.length; l++) {
	         min[l] = m[l][0];
	         for (int i = 0; i < m[l].length; i++) {
	            if (min[l] > m[l][i]) {
	               min[l] = m[l][i];
	            }
	         }
	      }
	      return min;
	   }

	}
