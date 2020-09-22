package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		// TODO
		// Loop gjennom radene

		for (int i = 0; i < matrise.length; i++)

			// Loop gjennom alle elementer i raden
			for (int j = 0; j < matrise[i].length; j++)
				System.out.print(matrise[i][j] + " ");

	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO

		String ut = "";

		for (int[] i : matrise) {
			for (int j : i) {
				ut += Integer.toString(j) + " ";

			}

			ut += "\n";
		}

		return ut;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		// TODO
		int skalert[][] = new int[matrise.length][matrise.length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				skalert[i][j] = matrise[i][j] * tall;

			}

		}
		return skalert;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		boolean lik = false;

		if (a.length == b.length) {

			for (int i = 0; i < a.length && i < b.length; i++) {
				for (int v = 0; v < a.length; v++) {
					if (a[i][v] == b[i][v]) {
						lik = true;
					}
				}
			}
		}

		return lik;
	}

	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		int[][] nyMatrise = new int[matrise.length][matrise[0].length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[j][i] = matrise[i][j];
			}
		}
		return nyMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		int c[][] = new int[a.length][a.length];
		if (a[0].length == b.length) {

			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					for (int k = 0; k < a.length; k++) {
						c[i][j] += a[i][k] * b[k][j];
					}

				}
			}
			return c;
		} else {

			throw new UnsupportedOperationException("kolonne a != rad b");
		}

	}
}
