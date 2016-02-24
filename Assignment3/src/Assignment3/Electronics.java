//Jiwhan Son, Karime Saad
//js78978, ks38728
//EE422C - Assignment 3

/*
 * Model for electronics class
 * 
 * @author	Jiwhan Son, Karime Saad
 */

package Assignment3;

public class Electronics extends Item
{
	//Array of all valid states
	public static final String[] STATES = new String[] {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL",
			"GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO",
			"MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD",
			"TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"};
	
	private String fragile;
	private String state;
	
	/*
	 * Creates new electronics with initial parameters
	 * 
	 * @param	name		name of item
	 * @param	price		price of item
	 * @param	quantity	quantity of item
	 * @param	weight		weight of the item
	 * @param	fCheck		fragile or non-fragile
	 * @param	shipState	the state to be shipped
	 */
	public Electronics(String name, float price, int quantity, int weight, String fCheck, String shipState) {
		super(name, price, quantity, weight);
		if((!fCheck.equals("F") && !fCheck.equals("NF")) || !validState(shipState)) {
			throw new IllegalArgumentException();
		}
		fragile = fCheck;
		state = shipState;
	}
	
	/*
	 * Calculates the total price of the electronics
	 * 
	 * @return	final_price		the total price of the electronics
	 */
	public float calculatePrice() {
		float final_price = 0;
		final_price = super.calculatePrice();
		if(fragile.equals("F")) {
			final_price += premiumShipping();
		}
		else {
			final_price += standardShipping();
		}
		final_price += calculateTax(state);
		return final_price;
	}
	
	/*
	 * Calculates the tax on the electronics
	 * 
	 * @param	state	the state where the electronics are to be shipped
	 * @return			the total tax on the electronics
	 */
	public float calculateTax(String state) {
		if(state.equals("TX") || state.equals("NM") || state.equals("VA") || state.equals("AZ") || state.equals("AK")) {
			return 0;
		}
		else {
			return super.calculateTax();
		}
	}
	
	/*
	 * Helper method that prints if item is fragile/non-fragile
	 * 
	 * @return			"Yes" if fragile, "No" if non-fragile
	 */
	public String getFragility() {
		if(fragile.equals("F")){
			return "Yes";
		}
		return "No";
	}
	
	/*
	 * Prints out all the attributes of the electronics
	 */
	public void printItemAttributes() {
		super.printItemAttributes();
		System.out.println("Fragile: " + getFragility());
		System.out.println("Shipping State: " + state);
	}
	
	/*
	 * Determines if the given state is a valid state
	 * 
	 * @param	state	state where electronics is to be shipped
	 * @return			true if valid state, false if not valid
	 */
	public boolean validState(String state) {
		for(int i = 0; i < STATES.length; i++) {
			if(STATES[i].equals(state)) {
				return true;
			}
		}
		return false;
	}
}
