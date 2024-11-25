
public class Gear {
	private double diameter;
	private int cogs;
	
	public Gear()
	{
		this.diameter = 1.0;
		this.cogs = 2;
	}
	public Gear(double aD, int aC)
	{
		this.diameter = aD;
		this.cogs = aC;
	}
	public double getDiameter()
	{
		return diameter;
	}
	public void setDiameter(double aD)
	{
		if(aD > 0.0)
		{
			this.diameter = aD;
		}
		else
		{
			this.diameter = 1.0;
		}
	}
	public int getCogs()
	{
		return cogs;
	}
	public void setCogs(int aC)
	{
		if(aC >= 2)
		{
			this.cogs = aC;
		}
		else
		{
			this.cogs = 2;
		}
	}
	public String toString()
	{
		return "[Gear] Diameter: " + this.diameter+" Cogs: "+this.cogs;
	}
	public boolean equals(Gear aG)
	{
		return aG != null &&
				this.diameter == aG.getDiameter() &&
				this.cogs == aG.getCogs();
	}
	
}

