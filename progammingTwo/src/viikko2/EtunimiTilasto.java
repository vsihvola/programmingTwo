package viikko2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EtunimiTilasto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lukija = new Scanner(System.in);
		Map<String, Integer> tilasto = kokoelma();

		System.out.print("Anna etunimi: ");
		String kysely = lukija.nextLine();
		while (true) {
			if (kysely.equals("lopeta")) {
				break;
			} else {
				System.out.println(kysely + ": " + tilasto.getOrDefault(kysely, 0) + " kappaletta");
				System.out.print("\nAnna etunimi: ");
				kysely = lukija.nextLine();
			}
		}

		lukija.close();

	}

	private static Map<String, Integer> kokoelma() {
		TiedostonLukija lukija = new TiedostonLukija("etunimet.csv");
		List<String> rivit = lukija.lueRivit();
		HashMap<String, Integer> tilasto = new HashMap<>();

		for (String rivi : rivit) {

			String[] osat = rivi.split(";");

			String nimi = osat[0];

			String lukumaara = osat[1];
			lukumaara = lukumaara.replaceAll(" ", "");
			int maara = Integer.parseInt(lukumaara);

			int edellinenLuku = tilasto.getOrDefault(nimi, 0);

			tilasto.put(nimi, edellinenLuku + maara);

		}

		return tilasto;

	}

}
