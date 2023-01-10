package challenges;
import java.util.ArrayList;
import java.util.Scanner;
// Code to implement a GroceryList class to keep track of groceries to buy
// Below you see two versions of the same code, the first one using ArrayList API and the second one using an array with 20 elements

public class GroceryList {
	
	
	
	int numberOfItems;
	
	public int getNumberOfItems() {
		return numberOfItems;
	}
	
	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}
	
	public void insertItem(String itemToAdd, ArrayList<String> items ) {
		items.add(itemToAdd);
		setNumberOfItems(items.size());
	}
	
	public void printList(ArrayList<String> items) {
		for (String item : items) {
			System.out.println(item);
		}
	}
	
	public static void main(String args[]) {
		GroceryList a = new GroceryList();
		Scanner s = new Scanner(System.in);
		ArrayList<String> items = new ArrayList<>();
		String item ="";
		
		while (!item.equalsIgnoreCase("leave")) {
			System.out.println("Type an item to add or 'leave' to leave: ");
			item=s.nextLine();
			if (item.equalsIgnoreCase("leave"))
				break;
			a.insertItem(item, items);
		}
		System.out.println("***FINAL LIST***");
		a.printList(items);
		s.close();
	}
}

/*

//--------------------------------------------------------------------------------------



public class GroceryList {
	
	
	String[] items;
	int numberOfItems=0;
	
	public int getNumberOfItems() {
		return numberOfItems;
	}
	
	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}
	
	public void insertItem(String itemToAdd, String[] items ) {
		items[numberOfItems+1]=itemToAdd;
		numberOfItems++;
	}
	
	public void printList(String[] items) {
		for (int i=0; i<items.length; i++) {
			if (items[i]!=null)
				System.out.println(items[i]);
			
		}
	}
	
	public static void main(String args[]) {
		GroceryList a = new GroceryList();
		String[] items = new String[20];
		Scanner s = new Scanner(System.in);
		String item ="";
		
		while (!item.equalsIgnoreCase("leave")) {
			System.out.println("Type an item to add or 'leave' to leave: ");
			item=s.nextLine();
			if (item.equalsIgnoreCase("leave"))
				break;
			a.insertItem(item, items);
		}
		System.out.println("***FINAL LIST***");
		a.printList(items);
		s.close();
	}
}

*/
