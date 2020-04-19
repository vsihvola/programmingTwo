package viikko3;

import java.time.Month;
import java.time.Year;

/**
 * Smelly Example #1
 * 
 * https://web.mit.edu/6.005/www/fa16/classes/04-code-review/
 * 
 * Collaboratively authored with contributions from: Saman Amarasinghe, Adam
 * Chlipala, Srini Devadas, Michael Ernst, Max Goldman, John Guttag, Daniel
 * Jackson, Rob Miller, Martin Rinard, and Armando Solar-Lezama.
 * 
 * This work is licensed under CC BY-SA 4.0.
 */
public class DayOfYear {

	/**
	 * Tämä konstruktori on merkitty yksityiseksi, koska luokka on "utility class",
	 * eli se sisältää ainoastaan staattisia metodeja. Tästä luokasta ei ole
	 * sallittua luoda olioita, vaan metodeja tulee kutsua luokan kautta.
	 * 
	 * Katso esim:
	 * 
	 * @see http://www.javapractices.com/topic/TopicAction.do?Id=40
	 * @see https://rules.sonarsource.com/java/tag/design/RSPEC-1118
	 */
	private DayOfYear() {
	}

	/**
	 * @param month
	 * @param dayOfMonth
	 * @param year
	 * @return
	 */
	public static int dayOfYear(int month, int dayOfMonth, int year) {

		// Tein kaksi ratkaisua. Ensimmäinen on miten ite toteuttausin koodin, enkä
		// säästänyt mitään alkuperäisestä.
		// Alempi ratkaisu kommenttina on alkuperäisestä muunneltu.
		// Kumpiki ratkaisu toimii testeissä.

		if (month > 0 && month < 13) {
			if (dayOfMonth > 0 && dayOfMonth < 32) {
				if (year >= 0) {
					Year tmpYear = Year.of(year);
					boolean isItLeap = tmpYear.isLeap();
					Month[] kuukaudet = Month.values();

					for (int i = 1; i < month; i++) {
						dayOfMonth += kuukaudet[i - 1].length(isItLeap);
					}
				} else {
					throw new IllegalArgumentException("Year must be over 0!");
				}
			} else {
				throw new IllegalArgumentException("dayOfMonth must be between 1 and 31!");
			}

		} else {
			throw new IllegalArgumentException("Month must be between 1 and 12!");
		}

		// Tämä ratkaisu on muunneltu versio alkuperäisestä.
		// Kumpikin ratkaisu toimii testeissä.
		//

//		if (month > 0 && month < 13) {
//			if (dayOfMonth > 0 && dayOfMonth < 32) {
//				if (year >= 0) {
//
//					Year tmpYear = Year.of(year);
//					int[] daysInMonth = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
//
//					if (tmpYear.isLeap()) {
//						daysInMonth[1] = 29;
//						for (int i = 1; i < month; i++) {
//							dayOfMonth += daysInMonth[i - 1];
//						}
//
//					} else {
//						for (int i = 1; i < month; i++) {
//							dayOfMonth += daysInMonth[i - 1];
//						}
//					}
//				} else {
//					throw new IllegalArgumentException("Year must be over 0!");
//				}
//			} else {
//				throw new IllegalArgumentException("dayOfMonth must be between 1 and 31!");
//			}
//
//		} else {
//			throw new IllegalArgumentException("Month must be between 1 and 12!");
//		}

		return dayOfMonth;
	}
}
