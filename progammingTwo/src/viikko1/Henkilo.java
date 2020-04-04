package viikko1;

public class Henkilo {

	private String name;
	private String address;

	public Henkilo(String name, String address) {
		this.setName(name);
		this.setAddress(address);

	}

	public String toString() {
		return this.getName() + "\n\t" + this.getAddress();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
