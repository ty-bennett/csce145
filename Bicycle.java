/*
 * Written by Ty Bennett  
 */
public class Bicycle {
	//Instance varibales for bicycle class
	private String make;
	private Wheel FrontWheel;
	private Wheel BackWheel;
	private Frame Frame;
	
	//default constructor for bicycle class
	public Bicycle() {
		this.make = "none";
		this.FrontWheel = new Wheel();
		this.BackWheel = new Wheel();
		this.Frame = new Frame();
	}
	//parameterized constructor for bicyclce class
	public Bicycle(String make, Wheel FrontWheel, Wheel BackWheel, Frame Frame)
	{
		//These check each parameter for valid values, if they are invalid they receive the default value for each arg
		if(make != null)
			this.make = make;
		else
			this.make = "none";
		if(FrontWheel != null && (FrontWheel.getDiameter() <= 55 || FrontWheel.getDiameter() >= 16))
			//if((diameter <= 55 || diameter >= 16) && (width <= 2.5 || width >= 1.0))
			this.FrontWheel = new Wheel(FrontWheel.getDiameter(), FrontWheel.getWidth());
		// otherwise it sets diameter to the default value of 16
		else
			this.FrontWheel = new Wheel();
		if(BackWheel != null && (BackWheel.getDiameter() <= 55 || BackWheel.getDiameter() >= 16))
			//if((diameter <= 55 || diameter >= 16) && (width <= 2.5 || width >= 1.0))
			this.BackWheel = new Wheel(BackWheel.getDiameter(), BackWheel.getWidth());
			// otherwise it sets diameter to the default value of 16
		else
			this.BackWheel = new Wheel();
		if((Frame.getSize() <= 60 || Frame.getSize() >= 18.5) && Frame.getType() != null)
			this.Frame = new Frame(Frame.getSize(), Frame.getType());
		else
			this.Frame = new Frame();
	}
	
	//sets the make of the bike
	public void setMake(String make)
	{
		if(make != null)
			this.make = make;
		else
			this.make = "none";
	}
	//sets the size and width of the front wheel 
	public void setFrontWheel(Wheel frontWheel)
	{
		if(frontWheel != null && (frontWheel.getDiameter() <= 55 && frontWheel.getDiameter() >= 16))
		//if((diameter <= 55 || diameter >= 16) && (width <= 2.5 || width >= 1.0))
			this.FrontWheel = new Wheel(frontWheel.getDiameter(), frontWheel.getWidth());
	// otherwise it sets diameter to the default value of 16
		else
			this.FrontWheel = new Wheel();
	}
	//sets the size and width of the back wheel 
	public void setBackWheel(Wheel backWheel)
	{
		if(backWheel != null && (backWheel.getDiameter() <= 55 && backWheel.getDiameter() >= 16))
		//if((diameter <= 55 || diameter >= 16) && (width <= 2.5 || width >= 1.0))
			this.BackWheel = new Wheel(backWheel.getDiameter(), backWheel.getWidth());
		// otherwise it sets diameter to the default value of 16
		else
			 this.BackWheel = new Wheel();
	}
	//sets the size and type of the frame
	public void setFrame(Frame Frame)
	{
		if((Frame.getSize() <= 60 && Frame.getSize() >= 18.5) && Frame.getType() != null)
			this.Frame = new Frame(Frame.getSize(), Frame.getType());
		else
			this.Frame = new Frame();	
	}
	//returns the make of the bike
	public String getMake()
	{
		return this.make;
	}
	//returns the front Wheel
	public Wheel getFrontWheel()
	{
		return this.FrontWheel;
	}
	//returns the back wheel
	public Wheel getBackWheel()
	{
		return this.BackWheel;
	}
	//returns the frame
	public Frame getFrame()
	{
		return this.Frame;
	}
	//converts the entire bicycle object into a readable format
	public String toString()
	{
		return "[Bicycle] Make: " + getMake() + "\n FrontWheel: " + getFrontWheel() + "\n BackWheel: " + getBackWheel() + "\n Frame: " + getFrame();
	}
	//checks to see if two instances of the bicycle class are the same and returns true if so, else returns false. 
	public boolean equals(Bicycle b)
	{
		if(b != null && 
				this.getMake().equals(b.getMake()) && 
				this.getFrontWheel().equals(b.getFrontWheel()) && 
				this.getBackWheel().equals(b.getBackWheel()) && 
				this.getFrame().equals(b.getFrame()))
			return true;
		else
			return false;
	}
		
}
