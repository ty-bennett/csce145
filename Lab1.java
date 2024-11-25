/*
* Written by Ty Bennett
*/

import java.util.Scanner; //import scanner method

public class Lab1 {

	public static void main(String[] args) {
		//ask user for input as numbers and has them input on new line
		System.out.println("What is your zodiac? Enter your birthday Month followed by Day as numbers.\n");
		//create new variable called keyboard and get input through user input in console
		Scanner keyboard = new Scanner(System.in);
		//store input from user in integer variables called Month and Day
		int Month = keyboard.nextInt();
		int Day = keyboard.nextInt();
		//checks to see that Month input is within the correct range 
		if (Month <= 12 && Month >= 1) {
			//nested if statement to check user inputs for invalid ranges
			//if it is Month 4 or 6 or 9 or 11 and the day is larger than 30 it gives an error
			//if the Month is 2 and the day is larger than 29 it gives an error
			if (Day > 31 || Day < 1) {
				System.out.println("Invalid Day!");
			}
			else if ((Month == 4|| Month == 6|| Month == 9|| Month == 11) && Day > 30 || (Month == 2 && Day > 29)){
				//print statement to console saying to user that it was an invalid input 
				System.out.println("Invalid Day!");
			}
			else {
					// series of one if and multiple else if statements to cycle through different zodiac signs 					
					//Aries if statement
					if ((Month == 3 && Day >= 21)||(Month == 4 && Day <=19)) {
						System.out.println("You are an Aries!");
					}
					//else if Taurus
					else if ((Month == 4 && Day >= 20)||(Month == 5 && Day <= 20)) {
						System.out.println("You are a Taurus!");
					}
					// else if Gemini
					else if ((Month == 5 && Day >= 21)||(Month == 6 && Day <= 20)) {
						System.out.println("You are a Gemini!");
					}
					//else if Cancer
					else if ((Month == 6 && Day >= 21)||(Month == 7 && Day <= 22)) {
						System.out.println("You are a Cancer!");
					}
					//else if Leo
					else if ((Month == 7 && Day >= 23)||(Month == 8 && Day<=22)) {
						System.out.println("You are a Leo!");
					}
					//else if Virgo
					else if ((Month == 8 && Day >= 23)||(Month == 9 && Day<=22)) {
						System.out.println("You are a Virgo!");
					}
					//else if Libra
					else if ((Month == 9 && Day >= 23)||(Month == 10 && Day <= 22)) {
						System.out.println("You are a Libra!");
					}
					//else if scorpio
					else if ((Month == 10 && Day >= 23)||(Month == 11 && Day <= 21)) {
						System.out.println("You are a Scorpio!");
					}
					//else if saggitarius
					else if ((Month == 11 && Day >= 22)||(Month == 12 && Day <= 21)) {
						System.out.println("You are a Sagittarius!");
					}
					//else if Capricorn
					else if ((Month == 12 && Day >= 22)||(Month == 1 && Day <= 19)) {
						System.out.println("You are a Capricorn!");
					}
					//else if aquarius
					else if ((Month ==  1 && Day >= 20)||(Month == 2 && Day <= 18)) {
						System.out.println("You are an Aquarius!");
					}
					//else if pisces
					else if ((Month == 2 && Day >= 19)||(Month == 3 && Day <= 20)){
					System.out.println("You are a Pisces!");
					}
					//if some unexpected error occurs (user input is taken but doesn't match to a numeric value in table)
					else {
						System.exit(0);
					}
				}
			}
		else {
			//prints out invalid Month input. run program again
			System.out.println("Invalid Month!");
		}
	}
}

