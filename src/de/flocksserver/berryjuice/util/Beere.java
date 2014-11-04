package de.flocksserver.berryjuice.util;

public class Beere {
	String einheit;
	String farbe;
	
	public Beere(String einheit, String farbe) {
		this.einheit = einheit;
		this.farbe = farbe;
	}
	
	public String getEinheit() {
		return einheit;
	}
	public void setEinheit(String einheit) {
		this.einheit = einheit;
	}
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
}
