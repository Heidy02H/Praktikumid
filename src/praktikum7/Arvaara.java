package praktikum7;

import praktikum6.Vahemik;

public class Arvaara {

	public static void main(String[] args) {

		int number = randomNumber(1,10);

		int arvamus = Vahemik.kasutajaSisestus(1, 10);

		while (arvamus != number) {
			if (arvamus > number) {
				System.out.println("Liiga suur! Paku uuesti ");
				arvamus = Vahemik.kasutajaSisestus(1, 10);

			} else if (arvamus < number) {
				System.out.println("Liiga väike! Paku uuesti ");
				arvamus = Vahemik.kasutajaSisestus(1, 10);
			}

		}

		System.out.println(" Õige vastus! ");

	}
	
	public static int randomNumber(int min, int max) {
		int number = min + (int) (Math.random() * max);
		
	return number;
		
	}

}
