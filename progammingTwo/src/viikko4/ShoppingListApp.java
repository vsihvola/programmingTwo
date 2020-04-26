package viikko4;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ShoppingListApp {

	private static ShoppingListItemDao dao = new JDBCShoppingListItemDao();

	public static void main(String[] args) throws SQLException {

		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the shopping list app!\n" + "Available commands:\n" + " list\n"
				+ " add [product name]\n" + " remove [product name]\n" + " get\n" + " quit");
		boolean running = true;

		while (running) {
			System.out.print("> ");
			String command = input.next();
			String parameter = input.nextLine().trim();

			switch (command) {
			case "list":
				listAllItems();
				break;
			case "add":
				addItem(parameter);
				break;
			case "remove":
				removeItem(parameter);
				break;
			case "get":
				getItem(parameter);
				break;
			case "quit":
				running = false;
				break;

			}
			System.out.println();
		}
		System.out.println("Bye!");
		input.close();
	}

	private static void getItem(String index) {
		// TODO Auto-generated method stub
		long temp = Long.parseLong(index);
		if (dao.getItem(temp) != null) {
			System.out.println(dao.getItem(temp).getId() + " " + dao.getItem(temp).getTitle());
		} else {
			System.out.println("Couldn't find the Id you searched for.");
		}

	}

	private static void listAllItems() throws SQLException {
		System.out.println("Shopping list contents:");

		List<ShoppingListItem> items = dao.getAllItems();
		for (ShoppingListItem item : items) {
			System.out.println(item.getId() + " " + item.getTitle());
		}
	}

	private static void addItem(String title) {

		boolean addItem = dao.addItem(new ShoppingListItem(title));

		if (addItem == true) {
			System.out.println("Item added.");
		} else {
			System.out.println("There is already one " + title + " on the list.");
		}

	}

	private static void removeItem(String title) {

		boolean removeItem = dao.removeItem(new ShoppingListItem(title));

		if (removeItem == true) {
			System.out.println("Item removed.");
		} else {
			System.out.println("No item found from list.");
		}

	}

}
