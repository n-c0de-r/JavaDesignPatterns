package observerpattern;

import java.util.ArrayList;

/**
 * Subclass of Observer. Stores its own list of potential carts.
 * @author n-c0de-r
 * @version 15.12.21
 */
public class Store implements Observer {
	private ArrayList<ShoppingCart> cartsList = new ArrayList<ShoppingCart>();
	private String storeName;
	
	/**
	 * Constructor to the Store class.
	 * @param	name - String.
	 */
	public Store (String name) {
		storeName = name;
	}
	
	/**
	 * Getter for the list of carts.
	 * @return	cartsList - ArrayList
	 */
	public ArrayList<ShoppingCart> getCartsList() {
		return cartsList;
	}
	
	/**
	 * Getter for the store name.
	 * @return	storeName - String
	 */
	public String getName() {
		return storeName;
	}
	
	/**
	 * Prints the list of all potential carts belonging to this store.
	 */
	public void printCartList() {
		System.out.println("---------- " + storeName + "'s Cart List ----------");
		String str = "";
		for (ShoppingCart cart : cartsList) {
			if (cart.getBrand().equals("unknown")) {
				str = "Unknown";
			} else {
				str = storeName +  "'s";
			}
			str += " cart, nr. " + cart.getID()
			+ " found at " + cart.getLocation();
			System.out.println(str);
		};
		System.out.println();
	}
	
	/**
	 * Update the list of carts with own or unknown carts,
	 * else disregard carts that belong to other brands.
	 */
	@Override
	public void update(ShoppingCart cart) {
		if (!(cart.getBrand().toLowerCase().equals(storeName.toLowerCase())
				||cart.getBrand().toLowerCase().equals("unknown"))) {
			return;
		}
		cartsList.add(cart);
	}
}
