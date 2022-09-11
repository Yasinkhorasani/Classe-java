package de.tiere.sorten;

/**
 * Vorlage für Hunden-objecte
 * 
 * Objectbeschreibung => Blick aus dem Fenster
 * Ich habe einen Hund.
 * 
 * *****Eigenschaften(HAT)*********
 * Ihr Name ist Pito
 * Der Hund ist Weiss
 * der Hund ist 2 jahre Alt
 * *****Methoden(KANN)************
 * Der Hund kann bellen
 * Wenn wuetend ist kann der Hund beissen
 * Der Hund kann das Haus bewachen
 * 
 * @author Yasin
 *
 */

public class Hund {
	
	//********************Eigenschaften****************
	
	/**
	 * Entspricht Hundename
	 */
	private String name;
	
	/**
	 * Entspricht farbe des Hundes
	 */
	 private String farbe;
	
	/**
	 * Entspricht alter des Hundes
	 * wird ändern
	 */
	private double alter;
	
	/**
	 * ob der Hund frisst?
	 */
	private boolean beissen;
	
	//*******************Methoden*********************
	
	public void bellen() {
		System.out.println("Wuff Wuff Wuff");
	}

	public String beissenvermögen() {
	String derBeissen = "beisst";
	return	derBeissen ;
	}
	
	public void rennen() {
		System.out.println("rennt");
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String hundeName) {
		name = hundeName;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String hundeFarbe) {
		farbe = hundeFarbe;
	}

	public double getAlter() {
		return alter;
	}

	public void setAlter(double neuAlter) {
		alter = neuAlter;
	}
	
	public boolean isBeissen() {
		return !beissen;
	}
};
