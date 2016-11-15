package praktikum11;

public class Astendamine {

	public static void main(String[] args) {
		System.out.println(astenda(2,3));
		

	}
	
	private static int astenda(int a, int b) {
		if (b == 1) {
			return a;
		}
		
		return a * astenda(a, b-1);
		
	} 

}
