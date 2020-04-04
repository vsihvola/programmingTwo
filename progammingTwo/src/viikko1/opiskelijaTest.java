package viikko1;

public class opiskelijaTest {

	public static void main(String[] args) {
		Opiskelija olli = new Opiskelija("Olli", "Ida Albergintie 1 00400 Helsinki");
		System.out.println(olli);
		System.out.println("opintopisteitä " + olli.opintopisteita());

		olli.opiskele();

		System.out.println("opintopisteitä " + olli.opintopisteita());

	}

}
