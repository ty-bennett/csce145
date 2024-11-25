/*
 * Written by Ty Bennett
 */
public class Apple {
	private String type;
	private double weight;
	private double price;
	
	public Apple()
	{
		this.type = "Gala";
		this.weight = 0.0;
		this.price = 0.0;
	}
	public Apple(String type, double weight, double price)
	{
		if(type != null && (type.equals("Red Delicious") || type.equals("Golden Delicious") || type.equals("Gala") || type.equals("Granny Smith")))
			this.type = type;
		else
			this.type = "Gala";
		if(weight >= 0.0 && weight <= 2.0)
			this.weight = weight;
		if(price >= 0.0)
			this.price = price;
	}
	/*
	 * Getters section of methods to get each value of the Apple objects
	 */
	//gets the type of apple and returns it at a string
	public String getType()
	{
		return this.type;
	}
	//gets the weight of the apple and returns it as double
	public Double getWeight()
	{
		return this.weight;
	}
	//gets the price of the apple and returns it as a double
	public Double getPrice()
	{
		return this.price;
	}
	/*
	 * Setter section of methods that take user input, check it, and then set the input to the variables of the apple
	 */
	
	//setType method to first check and see if the string inputted equals any of those values, if it does then set the value to the inputted string, else set 
	// it to the default value of "Gala"
	public void setType(String aType)
	{
		if(aType != null && (aType.equals("Red Delicious") || aType.equals("Golden Delicious") || aType.equals("Gala") || aType.equals("Granny Smith")))
			this.type = aType;
		else 
			this.type = "Gala";
	}
	//setWeight method first checks for a non-negative number between 0.0 and 2.0, then sets the weight to the input, if the number is invalid it sets it to 
	// the default value of 0.0
	public void setWeight(double aWeight)
	{
		if(aWeight >= 0.0 && aWeight <= 2.0)
			this.weight = aWeight;
		else
			this.weight = 0.0;
	}
	//setPrice() method first checks for a non-negative number, then it sets the apple's price as that input
	// if the input is negative it is given a default value of 0.0
	public void setPrice(double aPrice)
	{
		if(aPrice >= 0.0)
			this.price = aPrice;
		else
			this.price = 0.0;
	}
	public boolean equals(Apple a)
	{
		if(a != null && this.getType().equals(a.getType()) && this.getPrice().equals(a.getPrice()) && this.getWeight().equals(a.getWeight()))
		{
			return true;

		}		
		return false;
	}
	
	
	//prints out each value of the Apple object that it is
	public String toString()
	{
		return "Type: " + getType() + " Weight: " + getWeight() + " Price: " + getPrice();
	}
}

