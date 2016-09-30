package praktikum7;

import praktikum6.Vahemik;

public class panustegaKullJaKiri {

	public static void main(String[] args) {
		
		int raha = 25;
		
		
		
		while (raha > 0) {
			System.out.println("Sul on raha " + raha );
			int panus = 0;
			if (raha >= 25) {
				panus = Vahemik.kasutajaSisestus(0, 25); 
			}else
				panus = Vahemik.kasutajaSisestus(0, raha);
			

			int vise = (Math.random() > 0.5) ? 1 : 0;
			
			
			if (vise == 0) {
				System.out.println("Tuli kiri");
				raha = raha + panus;
				System.out.println(raha);
				
				
			}
			else  {
				System.out.println("Tuli kull");
				raha = raha - panus;
				System.out.println(raha);
				
			}
			
			
		}
		System.out.println("Raha on otsas");
		
		

	}

}
