/*
 * Written by Ty Bennett
 */

public class Frame {
	//create attributes for the frame objects that get created
	private Double size;
	private String type;
	
	public Frame()
	{
		//default constructor for frame class
		this.size = 18.5;
		this.type = "Diamond";
	}
	//parameterized constructor for frame class
	public Frame(double size, String type)
	{
		//checks the values being inputted for the Frame
		if(size <= 60 && size >= 18.5)
			this.size = size;
		//give default value if invalid values
		else
			this.size = 18.5;
		//checks for valid values of Frame type
		if(type != null && type.equals("Diamond") || type.equals("Step-Through") || type.equals("Truss") || type.equals("Penny-Farthing"))
			this.type = type;
		else
			//gives default value if invalid
			this.type = "Diamond";	
	}
	//sets size for the Frame
	public void setSize(double size)
	{
		//returns default value if values input are invalid
		if(size <= 60 && size >= 18.5)
			this.size = size;
		else
			this.size = 18.5;
	}
	//sets the Type of the frame and returns a default value if null or invalid
	public void setType(String type)
	{
		if(type != null && type.equals("Diamond") || type.equals("Step-Through") || type.equals("Truss") || type.equals("Penny-Farthing"))
			this.type = type;
		else
			this.type = "Diamond";	
	}
	// returns size of frame
	public Double getSize()
	{
		return this.size;
	}
	//returns type of frame
	public String getType()
	{
		return this.type;
	}
	//turns Frame class into readable format
	public String toString()
	{
		return "[Frame] Size: " + getSize() + "in " + "Type: " + getType();
	}
	//checks to see if two instances of frame are the same
	public boolean equals(Frame f)
	{
		if(f != null && 
				this.size.equals(f.getSize()) && 
				this.type.equals(f.getType()))
			return true;
		else
			return false;
	}
}
