
public class Machine {
	private String name; 
	private Gear bigGear;
	private Gear mediumGear;
	private Gear smallGear;
	
	public Machine()
	{
		this.name = "none";
		this.bigGear = new Gear(16.0,32);
		this.mediumGear = new Gear(8.0, 16);
		this.smallGear = new Gear(4.0,8);
	}
	public Machine(String aN, Gear bG, Gear mG, Gear sG)
	{
		if(aN == null || bG == null || mG == null || sG == null)
		{
			this.name = "none";
			this.bigGear = new Gear(16.0,32);
			this.mediumGear = new Gear(8.0, 16);
			this.smallGear = new Gear(4.0,8);		
		}
		else
		{
			this.name = aN;
			this.bigGear = bG;
			this.mediumGear = mG;
			this.smallGear = sG;
		}
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String aN)
	{
		if(aN != null)
		{
			this.name = aN;
		}
		else
		{
			this.name = "none";
		}
	}
	public String toString()
	{
		return "[Machine] Name: "+this.name +"\n"+bigGear+"\n"+mediumGear+"\n"+smallGear+"\n";
	}
	public static Machine copyAndRenameMachine(String aN, Machine aM)
	{
		if(aM == null)
			return null;
		Machine ret = aM;
		ret.setName(aN);
		return ret;
	}
}
