package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

/* 
 Inntekt mellom Inntekten mellom 0 - 180 800 kroner ingen trinnskatt
 Inntekten mellom 180 800 – 254 500 kroner	1,9 % trinnskatt
 Inntekten mellom 254 500 – 639 750 kroner	4,2 %  trinnskatt
 Inntekten mellom 639 750 – 999 550 kroner	13,2 % trinnskatt
 Inntekten over  999 550 kroner	16,2 % trinnskatt
*/
public class trinnSkatt {

	public static void main(String[] args) {
		
		String inntekt = showInputDialog("Inntekt:");
		
		int inntektTall = Integer.parseInt(inntekt);
		int ingenSkatt = 180800;
		int trinnEnInntekt = 254500;
		int trinnToInntekt = 639750;
		int trinnTreInntekt = 999550;
		double trinnEnskatt = 1.9;
		double trinnToskatt = 4.2;
		double trinnTreskatt = 13.2;
		double trinnFireskatt = 16.2;
		
		if(inntektTall < ingenSkatt) {
			
			showMessageDialog(null, "Trenger ikke å betale skatt");
			
		}
		
		if(inntektTall >= ingenSkatt && inntektTall < trinnEnInntekt) {
			
			inntektTall *= trinnEnskatt / 100;
			showMessageDialog(null, "Du må betale: " + inntektTall + "kr i skatt");
			
		}
		
		if(inntektTall >= trinnEnInntekt && inntektTall < trinnToInntekt) {
			
			inntektTall *= trinnToskatt / 100;
			showMessageDialog(null, "Du må betale: " + inntektTall + "kr i skatt");
			
		}
		
		if(inntektTall >= trinnToInntekt && inntektTall < trinnTreInntekt) {
	
			inntektTall *= trinnTreskatt / 100;
			showMessageDialog(null, "Du må betale: " + inntektTall + "kr i skatt");
			
		}
		
		if(inntektTall > trinnTreInntekt) {
			
			inntektTall *= trinnFireskatt / 100;
			showMessageDialog(null, "Du må betale: " + inntektTall + "kr i skatt");
			
		}

	}

}