package Assignment3;

public class Grocery extends Item {
	//variables, constructor here
	boolean perishable;
	
	Grocery(String name, float price, int quantity, int weight, boolean pCheck) {
		super(name, price, quantity, weight);
		perishable = pCheck;

	}
	
	float calculatePrice() {
		float final_price = 0;
		final_price = super.calculatePrice();
		if(perishable == true) {
			final_price += premiumShipping();
		}
		else {
			final_price += standardShipping();
		}
		return final_price;
	}
	
	String getPerishability() {
		if(perishable == true) {
			return "Yes";
		}
		return "No";
	}
	
	void printItemAttributes() {
		super.printItemAttributes();
		System.out.println("Perishable: " + getPerishability());
	}
	//override calculatePrice() if necessary; Implement print methods as necessary	
	// Only re-implement stuff you cannot get from the superclass (Item)
	
}
