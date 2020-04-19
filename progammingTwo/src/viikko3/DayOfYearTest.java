package viikko3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.Calendar;

import org.junit.jupiter.api.Test;

public class DayOfYearTest {

	@Test
	public void testFirstDayOfYear() {
		// Testataan ensimmäistä päivää
		// Karkausvuosi
		int result = DayOfYear.dayOfYear(1, 1, 2020);
		assertEquals(1, result);

		// Normaalivuosi
		int results = DayOfYear.dayOfYear(1, 1, 2021);
		assertEquals(1, result);

	}

	@Test

	public void testLastDayOfYear() {
		// Testataan viimeistä päivää
		// Karkausvuosi
		int result = DayOfYear.dayOfYear(12, 31, 2020);
		assertEquals(366, result);
		// Normaalivuosi
		int results = DayOfYear.dayOfYear(12, 31, 2022);
		assertEquals(365, results);

	}

	public void testRandomDayOfYear() {
		// Testataan viimeistä päivää
		// Karkausvuosi
		int result = DayOfYear.dayOfYear(7, 21, 2020);
		assertEquals(203, result);
		// Normaalivuosi
		int results = DayOfYear.dayOfYear(7, 21, 2022);
		assertEquals(202, results);

	}

	@Test

	public void checkTodayDate() {

		// Luodaan kalenteri, haetaan kuukauden päivä, kuukausi + 1, vuosi
		// kuukausi + 1, koska java palauttaa TAMMIKUU = 0 jne.
		Calendar cal = Calendar.getInstance();
		int currentDayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		int currentMonth = cal.get(Calendar.MONTH) + 1;
		int currentYear = cal.get(Calendar.YEAR);
		int result = DayOfYear.dayOfYear(currentMonth, currentDayOfMonth, currentYear);

		LocalDate tanaan = LocalDate.now();
		int paivanJarjestysNumero = tanaan.getDayOfYear();

		assertEquals(paivanJarjestysNumero, result);
	}

}
