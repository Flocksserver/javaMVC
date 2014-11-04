package de.flocksserver.berryjuice.model;

import java.util.ArrayList;
import java.util.List;

import de.flocksserver.berryjuice.util.Beere;
import de.flocksserver.berryjuice.util.FormatHelper;
import de.flocksserver.berryjuice.util.RezeptDataBase;

public class BerryJuiceModel {

	List<List<Beere>> gummiberryZutaten;
	
	public BerryJuiceModel() {
		gummiberryZutaten = new ArrayList<>();
	}
	
	public String[][] getGummiberryZutaten(){
		gummiberryZutaten.add(RezeptDataBase.getRoteBeeren());
		gummiberryZutaten.add(RezeptDataBase.getOrangeBeeren());
		gummiberryZutaten.add(RezeptDataBase.getLilaBeeren());
		gummiberryZutaten.add(RezeptDataBase.getBlaueBeeren());
		gummiberryZutaten.add(RezeptDataBase.getGrueneBeeren());
		gummiberryZutaten.add(RezeptDataBase.getGelbeBeeren());
		return FormatHelper.getStringArray(gummiberryZutaten);
	}
	
	public String getAnzahlEinheitHeande(){
		int anzahl = 0;
		for (int i = 0; i < gummiberryZutaten.size(); i++) {
			if(gummiberryZutaten.get(i).get(0).getEinheit().equals("Haende")){
				anzahl += gummiberryZutaten.get(i).size();
			}
		}
		return String.valueOf(anzahl)+" Haende voll Beeren   #   ";
	}
	
	public String getAnzahlEinheitStueck(){
		int anzahl = 0;
		for (int i = 0; i < gummiberryZutaten.size(); i++) {
			if(gummiberryZutaten.get(i).get(0).getEinheit().equals("Stueck")){
				anzahl += gummiberryZutaten.get(i).size();
			}
		}
		return String.valueOf(anzahl)+" einzelne Beeren";
	}

	
}
