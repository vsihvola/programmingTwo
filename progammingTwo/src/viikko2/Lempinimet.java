package viikko2;

import java.util.Map;
import java.util.TreeMap;

public class Lempinimet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> lempiNimet = new TreeMap<>();

		lempiNimet.put("Jari", "Litti");
		lempiNimet.put("Kaisa-Leena", "Kappa");
		lempiNimet.put("Teemu", "The Finnish Flash");

		System.out.println(lempiNimet);
	}

}
