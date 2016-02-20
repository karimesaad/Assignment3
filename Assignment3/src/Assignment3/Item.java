package Assignment3;

public class Item 
{
	protected String name;
	protected float price;
	protected int quantity;
	protected int weight;
	

//  Constructor
	
public Item(String name, float price, int quantity, int weight) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.weight = weight;
	}

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
	
	float standardShipping(){
		return (20 * weight) * quantity;
	}
	
	float premiumShipping(){
		return (float) ((standardShipping()) * 0.2) ;
	}

	float calculateTax (){
		return (float) (price * quantity * .1);
	}
	
	void printItemAttributes () 
	{
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);
		System.out.println("Weight: " + weight);
		
		
	}


}
