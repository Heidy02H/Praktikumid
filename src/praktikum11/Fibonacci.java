package praktikum11;

public class Fibonacci {

	public static void main(String[] args) {
		
		for (int i = 1 ; i < Integer.MAX_VALUE ; i++ ) {
			System.out.println(fibonacci(i));
		}
		
		

	}

	private static int fibonacci(int i) {
		
		if (i == 0) {
			return 0;
		}
		
		else if (i == 1) {
			return 1;
		}
		
		//if (a <= 1) return a;
		
		return fibonacci(i-1) + fibonacci(i-2);
	}
	
	

}
