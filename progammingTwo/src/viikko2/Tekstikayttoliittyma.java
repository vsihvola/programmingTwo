package viikko2;

import java.util.Scanner;

public class Tekstikayttoliittyma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sanakirja sanakirja = new Sanakirja();
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Komennot: \n\tlisaa - lisää sanaparin sanakirjaan \n\tkaanna - kysyy sanan ja tulostaa sen käännöksen \n\tlopeta - poistuu käyttöliittymästä");

		while (true) {
			System.out.print("\nKomento:");
			String komento = scanner.nextLine();
			if (komento.equals("lisaa")) {
				System.out.print("Suomeksi:");
				String word = scanner.nextLine();
				// Something happens
				System.out.print("Anna käännös:");
				String translate = scanner.nextLine();
				sanakirja.lisaa(word, translate);

			} else if (komento.equals("kaanna")) {
				System.out.print("Anna sana:");
				String word = scanner.nextLine();
				String some = sanakirja.kaanna(word);
				System.out.println("Käännös:" + some);
			} else if (komento.equals("lopeta")) {
				System.out.println("Hei hei!");
				break;
			}
		}

	}

}
