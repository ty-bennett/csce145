import java.util.Random;

public class Deck {
	private Card[] cards;
	
	public Deck() 
	{
		String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
		int [] values = {1,2,3,4,5,6,7,8,9,10,10,10,10};
		
		cards = new Card[suits.length * values.length];
		int cardIndex = 0;
		for(int i = 0; i < suits.length;i++)
		{
			for(int j = 0; j<values.length;j++)
			{
				Card c = new Card(suits[i], values[j]);
				cards[cardIndex] = c;
				cardIndex++;
			}
		}
	}
	//TODO: parameterized constructor?
	// mabe it takes an array of suits and values and makes the cards based off of that

	//draw card method
	//shuffle method
	//reset method
	public Card randomDeal()
	{
		Random r = new Random();
		//System.out.println(r.nextInt(52)); <---- how to use random with upper bound
		int length = getCards().length;
		int select = r.nextInt(length);
		return getCards()[select];
	}

	public Card[] getCards()
		{
			return cards;
		}
	
	public String toString()
	{
		 String returnString = "";
		 
		 for(int i=0;i<getCards().length;i++)
		 {
			 returnString += getCards()[i] + "\n";
		 }
		 
		 return returnString;
	}
	
}
