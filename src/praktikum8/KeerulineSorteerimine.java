package praktikum8;

import java.util.Arrays;
import java.util.Comparator;

import lib.TextIO;

public class KeerulineSorteerimine {

	public static void main(String[] args) {
		Sportlane[] m = new Sportlane[3];
		int i;
		
		System.out.println("Kysin 10 tulemust ja nime.");
		System.out.println("Sisesta palun tulemus 1 tyhik tulemus 2 tyhik nimi.");
		System.out.println("Naiteks: 17.3 7.7 Mati Maasikas");
		
		for (i = 0; i < m.length; i = i + 1) {
			Sportlane tmp = new Sportlane();
			System.out.print("Sportlane nr. " + (i+1) + " : ");
			tmp.tulemus1 = TextIO.getDouble();
			tmp.tulemus2 = TextIO.getDouble();
			tmp.nimi = TextIO.getlnString();
			m[i] = tmp;
		}
		
		System.out.println("Kas sorteerime tulemuse 1 järgi (1), tulemuse 2 järgi(2) või nime järgi (3)?");
		int kriteerium = TextIO.getInt();
		System.out.println("Kas esitame tulemuse kahanevalt (0) või kasvavalt(1)");
		int jarjekord = TextIO.getInt();
		
		if (kriteerium == 1) {
			Arrays.sort(m, new Comparator<Sportlane>() {
				/* compare peab tagastama numbri mis on:
				   0   kui s1 = s2
				   < 0 kui s1 < s2
				   > 0 kui s2 < s1
				 */
				public int compare(Sportlane s1, Sportlane s2) {
					if (s1.tulemus1 > s2.tulemus1)
						return -1;
					else if (s1.tulemus1 < s2.tulemus1)
						return 1;
					else
						return 0;
				}
			});
		} else if (kriteerium == 2) {
			Arrays.sort(m, new Comparator<Sportlane>() {
				/* compare peab tagastama numbri mis on:
				   0   kui s1 = s2
				   < 0 kui s1 < s2
				   > 0 kui s2 < s1
				 */
				public int compare(Sportlane s1, Sportlane s2) {
					if (s1.tulemus2 > s2.tulemus2)
						return -1;
					else if (s1.tulemus2 < s2.tulemus2)
						return 1;
					else
						return 0;
				}
			});
		} else {
			Arrays.sort(m, new Comparator<Sportlane>() {
				/* compare peab tagastama numbri mis on:
				   0   kui s1 = s2
				   < 0 kui s1 < s2
				   > 0 kui s2 < s1
				 */
				public int compare(Sportlane s1, Sportlane s2) {
					
					if (s1.nimi.compareTo(s2.nimi) == 0)
						return 0;
					else if (s1.nimi.compareTo(s2.nimi) < 0)
						return 1;
					else
						return -1;
				}
			});
			
			
			
		}
		
		
		
		// Sorteerime tulemuste ja"rgi kahanevas ja"rjekorras
		
		
	
		
		if (jarjekord == 0) {
			for (i = 0; i < m.length; i = i + 1) {
				System.out.println((i+1) + ". " +m[i].tulemus1 + "\t" + m[i].tulemus2 + "\t" + m[i].nimi);
			}
		
		}else {
			for (i = m.length-1; i >= 0; i--) {
				System.out.println((m.length - i) + ". " +m[i].tulemus1 + "\t" + m[i].tulemus2 + "\t" + m[i].nimi);
			}
		}	

	}

}
