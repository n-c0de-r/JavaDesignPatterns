package observerpattern;

import java.util.ArrayList;

/**
 * Subclass of Subject. Keeps a list of observers.
 * @author n-c0de-r
 * @version 15.12.21
 */
public class ShoppingCartList implements Subject{
	private ArrayList<Observer> observers = new ArrayList<Observer>();

	
	ShoppingCartList(){
		// nothing here but crickets...
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers(ShoppingCart cart) {
		for (Observer observer : observers) {
			observer.update(cart);
		}
	}
}