
public class Card {
	private String suit;
	private int value;
	
	//If I hit print twithout any data, it willl print a default card; Ace of Spades
	public Card()
	{
		this.suit = "Spades";
		this.value = 1; //1 = Ace
	}
	//If given data, this will print a specific card
	public Card(String s, int v)
	{
		this.suit = s;
		this.value = v;
	}
	public String getSuit()
	{
		return this.suit;
	}
	public int getValue() 
	{
		return this.value;
	}
	
	public void setValue(int v)
	{
		//if 1 line of code inside if statement you don't have to use curly braces
		if(v > 0 && v < 11)
			this.value = v;
		else
			this.value = 1;
	}
	public void setSuit(String s)
	{
		this.suit = s;
	}
	
	public boolean equals(Card c)
	{
		//put common fail point first when writing conditionals because we can save milliseconds
		return c != null && this.getSuit().equals(c.getSuit()) && this.value == c.getValue();
	}
	public String toString()
	{
		return getValue() + " of " + getSuit();
	}
}


