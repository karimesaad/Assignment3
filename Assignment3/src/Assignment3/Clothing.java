package Assignment3;

public class Clothing extends Item 
{
	// variables, constructors as necessary
	
	/*
	 * @return 	the total price of the clothing
	 */
	float calculatePrice () 
	{
		float final_price = 0;
		final_price = super() + standardShipping() + calculateTax();
		return final_price;
	}
	
	
	/*void printItemAttributes () 
	{
		//Print all applicable attributes of this sub-class
	}
	*/
}
