package viikko1;

public class Opiskelija extends Henkilo {

	private int points;

	public Opiskelija(String name, String address) {
		super(name, address);
		this.points = 0;

	}

	public void opiskele() {
		points++;
	}

	public int opintopisteita() {
		return this.points;

	}

	public String toString() {
		return this.getName() + "\n\t" + this.getAddress() + "\n\topintopisteitä " + this.points;

	}

}
