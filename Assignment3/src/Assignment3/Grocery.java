//Jiwhan Son, Karime Saad
//js78978, ks38728
//EE422C - Assignment 3

/*
 * Model for grocery class
 * 
 * @author	Jiwhan Son, Karime Saad
 */

package Assignment3;

public class Grocery extends Item {

	private String perishable;
	
	/*
	 * Creates new grocery with initial parameters
	 * 
	 * @param	name		name of item
	 * @param	price		price of item
	 * @param	quantity	quantity of item
	 * @param	weight		weight of the item
	 * @param	pCheck		perishable or non-perishable
	 */
	public Grocery(String name, float price, int quantity, int weight, String pCheck) {
		super(name, price, quantity, weight);
		if(!pCheck.equals("P") && !pCheck.equals("NP")) {
			throw new IllegalArgumentException();
		}
		perishable = pCheck;

	}
	
	/*
	 * Calculates the total price of the groceries
	 * 
	 * @return	final_price		the total price of the groceries
	 */
	public float calculatePrice() {
		float final_price = 0;
		final_price = super.calculatePrice();
		if(perishable.equals("P")) {
			final_price += premiumShipping();
		}
		else {
			final_price += standardShipping();
		}
		return final_price;
	}
	
	/*
	 * Helper method that prints if a grocery is perishable or non-perishable
	 * 
	 * @return			"Yes" if perishable, "No" if non perishable
	 */
	public String getPerishability() {
		if(perishable.equals("P")) {
			return "Yes";
		}
		return "No";
	}
	
	/*
	 * Prints out all the attributes of the electronics
	 */
	public void printItemAttributes() {
		super.printItemAttributes();
		System.out.println("Perishable: " + getPerishability());
	}
}
