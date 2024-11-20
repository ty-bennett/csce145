import java.util.Scanner;

public class Main {

	//  inefficient way of 
	//	public static String cardToString(Card c)
	//	{
	//		return c.getValue() + " of " +c.getSuit();
	//	}
	public static int scoreHand(Card[] hand, int amountOfCards)
	{
		int returnVal = 0;

		boolean hasAce = false;

		for(int i = 0; i < amountOfCards; i++)
		{
			returnVal += hand[i].getValue();
			if(hand[i].getValue() == 1)
				hasAce = true;
		}
		if(hasAce && returnVal <= 11)
		{
			returnVal += 10;
		}
		return returnVal;
	}

	public static void printHand(Card[] hand, int amountOfCards)
	{
		for(int i=0;i<amountOfCards;i++)
		{
			System.out.println(hand[i]);
		}
		/*
		 * for(int i = 0; i < hand.length; i++)
		 * {
		 * 	   if(hand[i] == null)
		 * 		break;
		 * 		hand[i] = 
		 * }
		 * 
		 */
	}

	public static void main(String[] args)
	{

		//TODO: List
		//Welcome the player
		//show the player the hand
		//show the player the dealers visible card
		//Ask the user if they want to hit or stand 
		//iF the user goes over 21, they lost 
		//Otherwise deal cards to dealer until they are 17 or over
		//if neither lost, compare scores, higher wins

		System.out.println("Welcome to Blackjack...");

		//make a new deck object
		Deck d = new Deck();

		//Keeps track of where we are storing the next card in the array
		//And it is keeping track of how many cards we have
		int playerIndex = 0;
		Card[] playerHand = new Card[10];
		int dealerIndex = 0;
		Card[] dealerHand = new Card[10];
		
		//add money to the player's pot
		int money = 1000;
		int pot = 0;
		
		
		

		//Deal the first card to the player and the dealer
		playerHand[playerIndex] = d.randomDeal();
		playerIndex++;
		dealerHand[dealerIndex] = d.randomDeal();
		dealerIndex++;
		//deal the player another card and the dealer another card
		playerHand[playerIndex] = d.randomDeal();
		playerIndex++;
		dealerHand[dealerIndex] = d.randomDeal();
		dealerIndex++;

		//print out the player hand
		System.out.println("Player Hand:");
		printHand(playerHand, playerIndex);
		System.out.println();
		//print out the dealers one card (but they actually have two cards
		System.out.println("Dealer shown card: ");
		printHand(dealerHand, dealerIndex-1);
		
		//ask the user to hit or stand
		Scanner k = new Scanner(System.in);


		do
		{
			System.out.println("Do you want to hit or stand?");
			String input = k.nextLine();

			if(input.toLowerCase().equals("hit"))
			{
				playerHand[playerIndex] = d.randomDeal();
				playerIndex++;
				System.out.println("Player hand:");
				printHand(playerHand, playerIndex);

				if(scoreHand(playerHand,playerIndex) > 21)
					break;
			}
			else if (input.toLowerCase().equals("stand"))
			{
				break;
			}
		} while(true);

		if(scoreHand(playerHand, playerIndex) <= 21)
		{
			while(scoreHand(dealerHand, dealerIndex) < 17)
			{
				dealerHand[dealerIndex] = d.randomDeal();
				dealerIndex++;
			}
			System.out.println("Dealer final hand: ");
			printHand(dealerHand, dealerIndex);
			
			int playerScore = scoreHand(playerHand, playerIndex);
			int dealerScore = scoreHand(dealerHand, dealerIndex);

			if(dealerScore > 21)
			{
				System.out.println("Player wins!");
			}
			else if(dealerScore >= playerScore)
			{
				System.out.println("Dealer wins!");
			}
			else
			{
				System.out.println("Player wins!");
			}
		}
		else
		{
			System.out.println();
			System.out.println("Player lost, game over ");
		}
	}
}







//		Deck d = new Deck();
//		System.out.println(d.randomDeal());



//		Card card = new Card();
//		Card card1 = new Card();
//		
//		card.setSuit("Hearts");
//		
//		System.out.println(card.equals(card1));
//		System.out.println(card.getSuit());
//		System.out.println(card.getValue());
//		System.out.println(card);

