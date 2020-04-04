package viikko1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class countryTest {
	public static void main(String[] args) {
		Country d = new Country("Denmark", 5_724_456);
		Country f = new Country("Finland", 5_498_211);
		Country i = new Country("Iceland", 335_878);
		Country n = new Country("Norway", 5_265_158);
		Country s = new Country("Sweden", 10_103_843);

		List<Country> countries = Arrays.asList(d, f, i, n, s);
		Collections.sort(countries);

		for (Country c : countries) {
			System.out.println(c);
		}
	}

}
