//Jiwhan Son, Karime Saad
//js78978, ks38728
//EE422C - Assignment 3

/*
 * Model for clothing class
 * 
 * @author	Jiwhan Son, Karime Saad
 */

package Assignment3;

public class Clothing extends Item 
{
	/*
	 * Creates an clothing item with initial parameters
	 * 
	 * @param	name		name of item
	 * @param	price		price of item
	 * @param	quantity	quantity of item
	 * @param	weight		weight of the item
	 */
	public Clothing(String name, float price, int quantity, int weight) {
		super(name, price, quantity, weight);
	}

	/*
	 * Calculates the total price of the clothing
	 * 
	 * @return	final_price		the total price of the clothing
	 */
	public float calculatePrice () 
	{
		float final_price = 0;
		final_price = super.calculatePrice() + standardShipping() + calculateTax();
		return final_price;
	}
}
