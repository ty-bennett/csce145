
public class Cat {
	
	private String name;
	private double weight;
	private int numberOfLegs;
	
	// default constructor 
	public Cat() {
		this.name = "none";
		this.weight = 1.0;
		this.numberOfLegs = 4;
	}
	// parameterized constructor
	public Cat(String aN, double aW, int aL) 
	{
		//this will work but
		//will work with INVALID data
		this.name = aN;
		this.weight = aW;
		this.numberOfLegs = aL;
	}
	//get name method for returning cats name
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public double getWeight()
	{
		return this.weight;
	}
	public void setWeight(double weight) 
	{
		if(weight <= 0 )
		{
			this.weight = 1;
			return;
		}
		this.weight = weight;
	}
	
	public int getNumberOfLegs()
	{
		return this.numberOfLegs;
	}
	public void setNumberOfLegs(int numberOfLegs)
	{
		if(numberOfLegs < 0)
		{
			this.numberOfLegs = numberOfLegs * -1;
			return;
		}
		this.numberOfLegs = numberOfLegs;
	}
}
