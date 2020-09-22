package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)

	public static void skrivUt(int[] tabell) {

		// TODO

		System.out.print("[");

		for (int v : tabell) {
			System.out.print(v + ",");
		}
		System.out.print("]");
	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		String[] resultat = new String[tabell.length];
		String out = "";

		for (int v = 0; v < tabell.length; v++) {

			String str1 = Integer.toString(tabell[v]);

			if (v < tabell.length - 1) {

				resultat[v] = (str1 + ",");

			} else {

				resultat[v] = (str1);

			}
			out += resultat[v];
		}

		return "[" + out + "]";

	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;

		for (int i : tabell) {
			sum += i;
		}

		return sum;

	}

	public static int summerFor(int[] tabell) {

		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;

	}

	public static int summerWhile(int[] tabell) {
		int sum = 0;
		int antall = 0;
		while (antall < tabell.length) {
			sum += tabell[antall];
			antall++;
		}

		return sum;

	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		boolean finnestall = false;
		for (int i = 0; i < tabell.length; i++) {

			if (tall == tabell[i]) {
				finnestall = true;
			}
		}
		return finnestall;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		int posisjontall = -1;
		boolean sjekktall = false;
		for (int i = 0; i < tabell.length; i++) {

			if (tall == tabell[i]) {
				sjekktall = true;

			} else {
				sjekktall = false;
			}

		}
		if (sjekktall = false) {

			return posisjontall;

		} else {
			for (int i = 0; i < tabell.length; i++) {

				if (tall == tabell[i]) {
					posisjontall = i;
				}
			}
		}
		return posisjontall;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int k = tabell.length - 1;
		int[] reversert = new int[tabell.length];

		for (int v = 0; v < tabell.length; v++) {
			reversert[k] = tabell[v];
			k--;
		}
		return reversert;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		boolean sortert = true;
		int v = 0;
		while (v < tabell.length - 1 && sortert == true) {
			if (tabell[v] > tabell[v + 1]) {
				sortert = false;
			}
			v++;
		}
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO

		int aLengde = tabell1.length;
		int bLengde = tabell2.length;
		int[] kombinert = new int[aLengde + bLengde];

		for (int i = 0; i < aLengde; i++) {
			kombinert[i] = tabell1[i];
		}

		for (int i = 0; i < kombinert.length - tabell1.length; i++) {
			kombinert[aLengde] = tabell2[i];
			aLengde++;
		}
		return kombinert;
	}
}
