package no.hvl.dat100;

import static javax.swing.JOptionPane.*;	//Importerer bibliotek for dialogbokser


public class karakterSkala {
	

	public static void main(String[] args) {
			
		//Wrapper alt i en for løkke som gjør at vi kan lese inn 10 poengsummer
		
		for (int i = 0; i < 10; i++) {	
			
		
			//Leser inn poengsum, gjør den om til int og lagrer den i variabelen "poengsum"
			
			String input = showInputDialog("Din poengsum: ");
			
			int poengsum = Integer.parseInt(input);
			
			
			
			//sjekker om poengsummen er gyldig
			
			if(poengsum > 100 || poengsum < 0) {
				
				//gir feilmelding helt til brukeren taster inn en gyldig poengsum
				
				do{
					input = showInputDialog("Ugyldig poengsum, Vennligst skriv inn en gyldig poengsum: ");
					
					poengsum = Integer.parseInt(input);
					
			      }while( poengsum > 100 || poengsum < 0);
				
				
			}
			
			
			
					//Sjekker hvilken karakter poengsummen tilsvarer og skriver det ut i en dialogboks
			
					if(poengsum >= 90) {
					
					showMessageDialog(null,"Poengsummen " + poengsum + "/100" + " gir karakteren A" );
					}
					
					if(poengsum >= 80 && poengsum <= 89) {
						
						showMessageDialog(null,"Poengsummen " + poengsum + "/100" + " gir karakteren B" );
					}
					
					if(poengsum >= 60 && poengsum <= 79) {
						
						showMessageDialog(null,"Poengsummen " + poengsum + "/100" + " gir karakteren C" );
					}
					
					if(poengsum >= 50 && poengsum <= 59) {
						
						showMessageDialog(null,"Poengsummen " + poengsum+ "/100" +  " gir karakteren D" );
					}
					
					if(poengsum >= 40 && poengsum <= 49) {
						
						showMessageDialog(null,"Poengsummen " + poengsum + "/100" + " gir karakteren E" );
					}
					
					if(poengsum >= 0 && poengsum <= 39) {
						
						showMessageDialog(null,"Poengsummen " + poengsum + "/100" + " gir karakteren F" );
					}
					
				}
	
		}
	

}
