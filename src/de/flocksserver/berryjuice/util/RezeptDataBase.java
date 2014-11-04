package de.flocksserver.berryjuice.util;

import java.util.ArrayList;
import java.util.List;

public class RezeptDataBase {

	public static List<Beere> getGelbeBeeren() {
		List<Beere> beeren = new ArrayList<Beere>();
		beeren.add(new Beere("Stueck", "gelb"));
		return beeren;
	}

	public static List<Beere> getGrueneBeeren() {
		List<Beere> beeren = new ArrayList<Beere>();
		beeren.add(new Beere("Stueck", "gruen"));
		beeren.add(new Beere("Stueck", "gruen"));
		beeren.add(new Beere("Stueck", "gruen"));
		return beeren;
	}

	public static List<Beere> getBlaueBeeren() {
		List<Beere> beeren = new ArrayList<Beere>();
		beeren.add(new Beere("Stueck", "blau"));
		beeren.add(new Beere("Stueck", "blau"));
		beeren.add(new Beere("Stueck", "blau"));
		beeren.add(new Beere("Stueck", "blau"));
		return beeren;
	}

	public static List<Beere> getLilaBeeren() {
		List<Beere> beeren = new ArrayList<Beere>();
		beeren.add(new Beere("Stueck", "lila"));
		beeren.add(new Beere("Stueck", "lila"));
		beeren.add(new Beere("Stueck", "lila"));
		return beeren;
	}

	public static List<Beere> getOrangeBeeren() {
		List<Beere> beeren = new ArrayList<Beere>();
		beeren.add(new Beere("Stueck", "orange"));
		beeren.add(new Beere("Stueck", "orange"));
		beeren.add(new Beere("Stueck", "orange"));
		beeren.add(new Beere("Stueck", "orange"));
		return beeren;
	}

	public static List<Beere> getRoteBeeren() {
		List<Beere> beeren = new ArrayList<Beere>();
		beeren.add(new Beere("Haende", "rot"));
		beeren.add(new Beere("Haende", "rot"));
		beeren.add(new Beere("Haende", "rot"));
		beeren.add(new Beere("Haende", "rot"));
		beeren.add(new Beere("Haende", "rot"));
		beeren.add(new Beere("Haende", "rot"));
		return beeren;
	}
}
