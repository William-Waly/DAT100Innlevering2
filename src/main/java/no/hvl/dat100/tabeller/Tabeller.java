package no.hvl.dat100.tabeller;

public class Tabeller {
	
	public static void main(String[] args) {
		int [] tabell = {42, 67, 89};
		int [] tabell2 = {95, 102, 115};
		
		//a)
		skrivUt(tabell);
		
		//b)
		String tabellStreng = tilStreng(tabell);
		System.out.println(tabellStreng);
		
		//c)
		int sum = summer(tabell);
		System.out.println("Summen av tabellen blir: " + sum);
		
		//d)
		boolean finnesTall = finnesTall(tabell, 67);
		System.out.println(finnesTall);
		
		//e)
		int pos = posisjonTall(tabell, 67);
		System.out.println("Posisjonen er: " + pos);
		
		//f)
		int[] reversertTabell = reverser(tabell);
		for (int i : reversertTabell) {
			System.out.println(i + " ");
		}
		//g)
		boolean erSortert = erSortert(tabell);
		System.out.println("Er tabellen sortert? " + erSortert);
		
		//h)
		settSammen(tabell, tabell2);
	}
	

	// a)
	public static void skrivUt(int[] tabell) {
		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
	    if (tabell == null || tabell.length == 0) {
	        return "{}";
	    }
		
		StringBuilder sb = new StringBuilder();
	    sb.append("{");
	    
	    for (int i = 0; i < tabell.length; i++) {
	        sb.append(tabell[i]);
	        if (i < tabell.length - 1) {
	            sb.append(",");
	        }
	    }

	    sb.append("}");
	    return sb.toString();
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if ((int) tall == (int) tabell[i]) {
				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
		for (int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] reversertTabell = new int[tabell.length];
			
		for (int i = 0; i < tabell.length; i++) {
			reversertTabell[i] = tabell[tabell.length - 1 - i];
		}
		return reversertTabell;
		
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] < tabell[i+1]) {
			}
			else {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell, int[] tabell2) {
		int[] sammenSatt = new int[tabell.length + tabell2.length];
		
		for (int i = 0; i < tabell.length; i++) {
			sammenSatt[i] = tabell[i];
		}
		for (int i = 0; i < tabell2.length; i++) {
			sammenSatt[i+tabell.length] = tabell2[i];
		}
		System.out.print("{");
		for (int j = 0; j < sammenSatt.length; j++) {
			if (j == sammenSatt.length - 1) {
				System.out.print(sammenSatt[j]);
			} else {
				System.out.print(sammenSatt[j] + ", ");
			}
			
			
		}
		System.out.print("}");
		return sammenSatt;
	}
}
