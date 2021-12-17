package observerpattern;

/**
 * Shopping cart class, keeping track of its own ID,
 * location where it was found and the brand it belongs to.
 * @author n-c0de-r
 * @version 15.12.21
 */
public class ShoppingCart {
	private int id;
	private String location;
	private String brand;
	
	/**
	 * Constructor of the Shopping Cart class.
	 * @param id		- Integer ID number of the cart.
	 * @param location	- String location where it was found.
	 * @param brand		- String name of the chain the cart belongs to.
	 */
	ShoppingCart (int id, String location, String brand) {
		this.id = id;
		this.location = location;
		this.brand = brand;
	}
	
	/**
	 * Getter method for the cart's ID.
	 * @return	- Integer
	 */
	public int getID() {
		return id;
	}
	
	/**
	 * Getter method for the cart's finding location.
	 * @return	- String
	 */
	public String getLocation () {
		return location;
	}
	
	/**
	 * Getter method for the brand's name it belongs to.
	 * @return	- String
	 */
	public String getBrand() {
		return brand;
	}
	
	/**
	 * Setter method for the cart's ID.
	 * @param	newID - Integer
	 */
	public void setID(int newID) {
		id = newID;
	}
	/**
	 * Setter method for the cart's finding location.
	 * @param	newLocation - String
	 */
	public void setLocation (String newLocation) {
		location = newLocation;
	}
	
	/**
	 * Setter method for the brand's name the cart belongs to.
	 * @param	newBrand - String
	 */
	public void setBrand(String newBrand) {
		brand = newBrand;
	}
}
