package tests;

import de.tiere.sorten.Katze;

public class KatzeTest {

	public static void main(String[] args) {
		
		
		Katze katzeObject1 = new Katze();
		Katze katzeObject2 = new Katze();
		Katze katzeObject3 = new Katze();
		
		katzeObject1.setName("Kiti");
		katzeObject2.setName("Sussi");
		katzeObject3.setName("Nika");
		System.out.println("wenn er ärgert");
		katzeObject1.mieau();

	}

}
