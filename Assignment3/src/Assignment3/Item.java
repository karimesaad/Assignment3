package Assignment3;

public class Item 
{
	protected String name;
	protected float price;
	protected int quantity;
	protected int weight;
	

// You will need a constructor (Why?). Create it here.
	
	float calculatePrice () 
	{
		float final_price = quantity * price;
		return final_price;
	}
	

	void printItemAttributes () 
	{
		//Print all applicable attributes of this class
	}

}
