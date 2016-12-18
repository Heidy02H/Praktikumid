package projekt;


public class Answer3 {

   public static void main (String[] args) {
      int[] res = veeruMaxid (new int[][] { {1,2,6}, {4,5,3} }); // {4, 5, 6}
      // YOUR TESTS HERE
   }

   public static int[] veeruMaxid (int[][] m) {
	   
	   // Leiame max reapikkuse
	   int maxrida = 0;
	      for (int i=0; i<m.length; i++) {
	         if (maxrida < m[i].length) {
	        	 maxrida = m[i].length;
	         }
	      }
	      
	   // hoiame veergude maksimume massiivis 
	      int[] veeruMaxid = new int [maxrida];
	      for (int j=0; j<maxrida; j++) {
	    	  veeruMaxid[j]=Integer.MIN_VALUE;
	      }
	      // arvutame maksimumid
	      for (int i=0; i<m.length; i++) {
	         for (int j=0; j<m[i].length; j++) {
	            if (veeruMaxid[j] < m[i][j]) {
	            	veeruMaxid[j] = m[i][j];
	            }
	         }
	      }
	   
	   
      return veeruMaxid;
   }

}



