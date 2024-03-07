package chickenfactory;

public class Food {
	
	//INSTANCE VARIABLES
	private double price;
	private String name;
	
	//EMPTY  CONSTRUCTORS
	public Food() {
		
	}
	//CONSTRUCTORS WITH PARAMETERS
	public Food(String name, double price) {
		
		this.name = name;
		this.price = price;
	}
	//THE GETTERS SO USER INFO CAN BE ACCESSED
	public String getName() {
		return this.name;
	}
	
	public double getPrice() { //method is very useful when we want to add the price of items the customer got
		return this.price;
	}
	
	public String toString() {
		return this.name;
	}
	
	
	
}
