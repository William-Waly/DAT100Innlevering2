package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[");

		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		}

		System.out.println("]");
	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		StringBuilder a = new StringBuilder();
		
		a.append("[");
		
		for(int i = 0; i < tabell.length; i++) {
			a.append(tabell[i]);
			if (i < tabell.length - 1) {
				a.append(",");			}
		}
		a.append("]");
		
		return a.toString();
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;

		System.out.print("[");

		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
			sum = sum + tabell[i];

		}
		System.out.print("]");
		System.out.println(" Summen av tabellen: " + sum);

		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int i : tabell) {
			if (i == tall) {
				return true;
			}
		}
		return false;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int a = -1;

		for (int i : tabell) {
			if (i == tall) {
				return tall;
			}
		}
		return a;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
