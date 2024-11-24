//This is saying that
//Cat is an Animal, the cat has the same info as the Animal class
public class Cat extends Animal{
	private int numberOfLegs;
	private double weight;
	
	public Cat()
	{
		//Super method with no args calls the default methods from the
		//Animal class
		
		super();
		numberOfLegs = 4;
		weight = 10;
	}
	public Cat(String name, int numberOfLegs, double weight)
	{
		//
		super(name);
		this.numberOfLegs = numberOfLegs;
		this.weight = weight;
	}
	public String toString()
	{
		return super.toString() 
				+ " Number of Legs: " + numberOfLegs +
				" Weight: " + weight;
	}
}
