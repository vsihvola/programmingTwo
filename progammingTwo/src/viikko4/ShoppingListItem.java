package viikko4;

/*
 * ShoppingListItem on "Model-luokka" joka mallintaa yksittäistä
 * */

public class ShoppingListItem {

	private long id;
	private String title;

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public ShoppingListItem(String title) {
		this.title = title;
	}

	public ShoppingListItem(long id, String title) {
		this.id = id;
		this.title = title;

	}

	public void setId(long id) {
		// TODO Auto-generated method stub
		this.id = id;

	}

}
