package Assignment3;

public class Electronics extends Item 
{
	boolean fragile;
	String state;
	
	Electronics(String name, float price, int quantity, int weight, boolean fCheck, String shipState;) {
		super(name, price, quantity, weight);
		fragile = fCheck;
		state = shipState;
	}
	
	float calculatePrice() {
		float final_price = 0;
		final_price = super();
		if(fCheck == true) {
			final_price += premiumShipping();
		}
		else {
			final_price += standardShipping();
		}
		final_price += calculateTax();
		return final_price;
	}
	
	float calculateTax(String state) {
		if(state.equals("TX") || state.equals("NM") || state.equals("VA") || state.equals("AZ") || state.equals("AK")) {
			return 0;
		}
		else {
			return super();
		}
	}
	
	String getFragility() {
		if(fragile == true){
			return "Yes";
		}
		return "No";
	}
	
	void printItemAttributes() {
		super();
		System.out.println("Fragile: " + getFragility());
		System.out.println("Shipping State: " + state);
	}
	// Variables, constructors etc. here.
	
	//Implement calculate price/print methods as necessary

}
