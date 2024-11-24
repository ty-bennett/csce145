/*
 * Written by Ty Bennett
 */
public class Wheel {
	
	private Double diameter;
	private Double width;
	
	//wheel default constructor method
	public Wheel()
	{
		this.diameter = 16.0;
		this.width = 1.0;
	}
	//wheel parameterized constructor with arguments of type int and type float
	public Wheel(double diameter, double width)
	{
		//checks to see if the input is valid, and then gives the objects diameter the diameter that was input
		
		if(diameter <= 55 && diameter >= 16)
			this.diameter = diameter;
		// otherwise it sets diameter to the default value of 16
		else
			this.diameter = 16.0;
		//checks to see if the input is valid, and then gives the objects width the width that was input
		if(width <= 2.5 && width >= 1.0)
			this.width = width;
		//otherwise it sets the width to the default value of 1
		else
			this.width = 1.0;
	}
	//accessor and mutator string section
	public void setDiameter(double diameter)
	{
		if(diameter <= 55 && diameter >= 16)
			this.diameter = diameter;
		// otherwise it sets diameter to the default value of 16
		else
			this.diameter = 16.0;
	}
	//returns the diameter of type double
	public Double getDiameter()
	{
		return this.diameter;
	}
	//sets the width of the wheel to be the width of type double
	public void setWidth(double width)
	{
		if(width <= 2.5 && width >= 1.0)
			this.width = width;
		//otherwise it sets the width to the default value of 1
		else
			this.width = 1.0;
	}
	//returns the width of type double
	public Double getWidth()
	{
		return this.width;
	}
	//The toString method converts the object into a readable format for the user
	public String toString()
	{
		return "[Wheel]" + "Diameter: " + getDiameter() + " " + "Width: " + getWidth(); 
	}
	//the equals method checks to see if the diameter and width of two Wheels are the same
	public boolean equals(Wheel wheel)
	{
		if(wheel != null && this.getDiameter().equals(wheel.getDiameter()) && this.getWidth().equals(wheel.getWidth()))
			return true;
		else
			return false;
	}
}
