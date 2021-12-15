package observerpattern;

/**
 * Interface of Subject.
 * @author n-c0de-r
 * @version 15.12.21
 */
interface Subject {
	/**
	 * Add a new Observer to list of observers.
	 * @param observer	- Observer object
	 */
    public void registerObserver(Observer observer);

	/**
	 * Remove an Observer from list of observers.
	 * @param observer	- Observer object
	 */
    public void removeObserver(Observer observer);
    
    /**
     * Notify all Subjects of new shopping carts.
	 * @param cart	- ShoppingCart object
     */
    public void notifyObservers(ShoppingCart cart);
}