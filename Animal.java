
public class Animal {
	private String name;
	
	public Animal() {
		setName("Steve");
	}
	
	public Animal(String name)
	{
		this.name = name;
	}
	public void setName(String name)
	{
		if(name == null)
		{
			this.name = "Default";
			return;
		}
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public String toString()
	{
		return "Name: " + getName();
	}
}
