package praktikum2;

import lib.TextIO;

public class Grupp {

	public static void main(String[] args) {
		
		int inimestearv;
		int grupisuurus;
		int gruppidearv;
		int jaak;
		
		System.out.print("Sisesta inimeste arv: ");
        inimestearv = TextIO.getlnInt();

        System.out.print("Sisesta gruppide suurus: ");
        grupisuurus = TextIO.getlnInt();
        
        gruppidearv = inimestearv / grupisuurus;
        jaak = inimestearv % grupisuurus;
        
        System.out.printf("Gruppide arv on ");
        System.out.println(gruppidearv);
        
        System.out.printf("Üle jääb inimesi ");
        System.out.println(jaak);
	}

}
