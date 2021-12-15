package observerpattern;

import java.util.ArrayList;

public class Main {
	
	private ArrayList<Store> stores = new ArrayList<Store>();
	private ArrayList<ShoppingCart> carts = new ArrayList<ShoppingCart>();
	private ShoppingCartList list = new ShoppingCartList();
	
	public static void main(String[] args) {
		
		Main m = new Main();
		
		m.createStores();
		m.createCarts();
		m.registerObservers();
		m.notifyObservers();
		m.printCartLists();
	}
	
	/**
	 * Create a few stores to check and populate the list of stores.
	 */
	private void createStores() {
		stores.add(new Store("Lidl"));
		stores.add(new Store("Aldi"));
		stores.add(new Store("Edeka"));
		stores.add(new Store("Edeka"));
		stores.add(new Store("Kaufhof"));
		stores.add(new Store("Penny"));
		stores.add(new Store("Bauhaus"));
	}
	
	/**
	 * Create a few carts to check and populate the list of carts.
	 */
	private void createCarts() {
		carts.add(new ShoppingCart(123, "Fuchsweg 3", "Lidl"));
		carts.add(new ShoppingCart(456, "Katzenpfad 9", "Aldi"));
		carts.add(new ShoppingCart(789, "Wuffallee 1", "Aldi"));
		carts.add(new ShoppingCart(321, "Keksstraﬂe 5", "Edeka"));
		carts.add(new ShoppingCart(654, "Kraterplatz 0", "Penny"));
		carts.add(new ShoppingCart(934, "Mysteriumsgasse 9 3/4", "unknown"));
	}
	
	/**
	 * Register each store to the list of observers. 
	 */
	private void registerObservers() {
		for(Store store : stores) {
			list.registerObserver(store);
		}
	}
	
	/**
	 * Notify all stores in the list of observers.
	 */
	private void notifyObservers() {		
		for(ShoppingCart cart : carts) {
			list.notifyObservers(cart);
		}
	}
	
	/**
	 * Print all noted carts in each shop accordingly.
	 */
	private void printCartLists() {
		for(Store store : stores) {
			store.printCartList();
		}
	}
}
