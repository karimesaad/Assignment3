package Assignment3;

public class Clothing extends Item 
{

	// variables, constructors as necessary
	
	float calculatePrice () 
	{
		float final_price = 0;
		final_price = (price * quantity) + calculateShipping() + calculateTax();
		return final_price;
	}
	
	float calculateShipping () {
		return ((20 * weight)) * quantity;
	}
	
	float calculateTax() {
		return (price * quantity) * 0.1;
	}
	
	/*void printItemAttributes () 
	{
		//Print all applicable attributes of this sub-class
	}
	*/
}
