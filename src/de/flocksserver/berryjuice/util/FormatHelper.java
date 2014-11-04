package de.flocksserver.berryjuice.util;

import java.util.List;

public class FormatHelper {
	
	public static String[][] getStringArray(List<List<Beere>> input){
		String[][] s = new String[6][4];
		for (int i = 0; i < input.size(); i++) {
			s[i][0] = String.valueOf(input.get(i).size());
			s[i][1] = input.get(i).get(0).getEinheit();
			s[i][2] = input.get(i).get(0).getFarbe();
			s[i][3] = "Beere";
		}
		return s;
	}
}
