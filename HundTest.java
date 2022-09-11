package tests;                      
import src.de.tiere.sorten.Hund;
import src.de.tiere.sorten.Katze;

/**
 * Ablauf des Programs: Hunde-und katzenObjecte werden definiert
 * 
 * @author Yasin
 */
public class HundTest {
	/**
	 * Hundeobjecte werden bellen, beißen, bewachen
	 * @param args wird nicht benutzt
	 */
	public static void main(String[] args) {
		Hund hundeObject1 = new Hund();
		hundeObject1.setName("Tom");//setter
		hundeObject1.setFarbe("wiß");//setter
		
		Katze katzeObject1 = new Katze();// Erzeugung von KatzenObject
		katzeObject1.setName("Kiti");// setter
		
		Hund hundeObject2 = new Hund();
		hundeObject2.setName("Pitok");//setter
		
		
		Hund hundeObject3 = new Hund();
		hundeObject3.setName("Nill");//setter
		
		/**
		 * Die Anwendung von Methoden und getter von erzeugte "HundenObjecten" und "KatzenObjecten"
		 */
		
		System.out.println("***** ANFANG *****\n");
		/*Hund[] dieHunde = new Hund[3];
		Hund Tom;
		dieHunde[0]= Tom ;
		Hund pitok;
		dieHunde[1]= pitok;
		Hund Nill;
		dieHunde[2]	= Nill;	
		for(int i = 0; i<dieHunde.length ; i++) 
		{System.out.println(dieHunde[i]);
		}
		}*/
		System.out.println("\n***** ENDE *****");
	}
	
}
