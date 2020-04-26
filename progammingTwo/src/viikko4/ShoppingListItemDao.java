package viikko4;

import java.util.List;

public interface ShoppingListItemDao {

	public List<ShoppingListItem> getAllItems();

	public ShoppingListItem getItem(long id);

	public boolean addItem(ShoppingListItem newItem);

	public boolean removeItem(ShoppingListItem item);
}