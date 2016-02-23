package Assignment3;

public class Electronics extends Item
{
	public static final String[] STATES = new String[] {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL",
			"GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO",
			"MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD",
			"TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"};
	
	String fragile;
	String state;
	
	Electronics(String name, float price, int quantity, int weight, String fCheck, String shipState) {
		super(name, price, quantity, weight);
		if((!fCheck.equals("F") && !fCheck.equals("NF")) || !validState(shipState)) {
			throw new IllegalArgumentException();
		}
		fragile = fCheck;
		state = shipState;
	}
	
	float calculatePrice() {
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
	
	float calculateTax(String state) {
		if(state.equals("TX") || state.equals("NM") || state.equals("VA") || state.equals("AZ") || state.equals("AK")) {
			return 0;
		}
		else {
			return super.calculateTax();
		}
	}
	
	String getFragility() {
		if(fragile.equals("F")){
			return "Yes";
		}
		return "No";
	}
	
	void printItemAttributes() {
		super.printItemAttributes();
		System.out.println("Fragile: " + getFragility());
		System.out.println("Shipping State: " + state);
	}
	
	private boolean validState(String state) {
		for(int i = 0; i < STATES.length; i++) {
			if(STATES[i].equals(state)) {
				return true;
			}
		}
		return false;
	}
	// Variables, constructors etc. here.
	
	//Implement calculate price/print methods as necessary

}
