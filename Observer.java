package observerpattern;

/**
 * Interface of Observer.
 * @author n-c0de-r
 * @version 15.12.21
 */
interface Observer {
	/**
	 * Update the list of shopping carts.
	 * @param cart	- ShoppingCart object
	 */
    public void update(ShoppingCart cart);
}