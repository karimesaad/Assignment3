package Assignment3;

public class Item 
{
	protected String name;
	protected float price;
	protected int quantity;
	protected int weight;
	

// You will need a constructor (Why?). Create it here.
	
//  Getters and Setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
//  Class Methods
	
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
