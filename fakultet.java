package no.hvl.dat100;

import static javax.swing.JOptionPane.*; //Importerer bibliotek for dialogbokser

public class fakultet {

	public static void main(String[] args) {

		String input = showInputDialog("Ditt tall: ");

		int tall1 = Integer.parseInt(input);

		long fakultet = 1;

		if (tall1 < 0) {

			showMessageDialog(null, "Tallet må være et positivt tall");

		} else {

			for (int i = 1; i <= tall1; i++) {
				fakultet = fakultet * i;
			}

		}

		showMessageDialog(null, "fakultet: " + fakultet);

	}

}
