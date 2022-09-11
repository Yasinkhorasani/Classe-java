package de.tiere.sorten;


/**
 * Vorlage für Katzen-objecte
 * 
 * Objectbeschreibung => Blick aus dem Fenster
 * Ich habe einen Katze.
 * 
 * *****Eigenschaften(HAT)*********
 * Ihre Name ist Kiti
 * Die Katze ist Graou
 * Die Katze ist 1 jahre Alt
 * *****Methoden(KANN)************
 * Die Katze kann mieauen
 * Die Katze kann rennen
 * 
 * @author Yasin
 *
 */
public class Katze {
	//*******************Eigenschaften*********************
	/**
	 * Entspricht Katzename
	 */
	private String name;
	
	/**
	 * Entspricht farbe der Katze
	 */
	private String farbe;
	
	private double alter;
	
	//*******************Methoden*************************
	/**
	 * Der Hund kann rennen
	 */
	public void rennen() {
		System.out.println(" Sie rennt");
	}
	
	/**
	 * Der Hund kann mieauen
	 */
	public void mieau() {
		System.out.println("Mieau");
	}

	//********************SETTER/GETTER*******private Datenkapselung*************
	
	/**
	 * angreifen des Namen außerhalb der Klassse
	 * @return string private name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Atribut farbe soll geändert werden
	 * @param hundeFarbe
	 */
	public void setName(String katzeName) {
		name = katzeName;
	}
	

	/**
	 * angreifen der Farbe außerhalb der Klassse
	 * @return string private farbe
	 */
	public String getFarbe() {
		return farbe;
	}
	/**
	 *  Atribut farbe soll geändert werden
	 * @param katzenFarbe
	 */
	public void setFarbe(String katzenFarbe) {
		farbe = katzenFarbe;
	}

	
}
