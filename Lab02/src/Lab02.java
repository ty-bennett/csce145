/*
 * 
 * Written by Ty Bennett
 * 
 */

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args)
	{
		//initialize scanner variable and set it to gather user input
		Scanner keyboard = new Scanner(System.in);
		//ask user for input
		System.out.println("Welcome to the Triangle Maker! Enter the size of your triangle");
		//store that value in an integer called triangleHeight
		int triangleHeight = keyboard.nextInt();
		//check to see if height is less than or equal to 0
		if (triangleHeight <= 0) 
		{
			//if true output to the console "Invalid input. Try again" and return an error code of 0 and exit program
			System.out.println("Invalid input. Try again");
			System.exit(0);
		}
		else {
			//i indicates the number of rows and that is how many times the for loops runs 
			for (int i = 0;i <= triangleHeight;i++)
			{
				//empty character lets the nested for loop print the stars
				System.out.println("");
				//for loop with j prints a star until it reaches the value of the row it is in 
				//(ie for loop prints 3 stars if it is in the 3rd "row" which is really just 3rd iteration of the i for loop
				//j starts at 0 and works it way up until the value of i for each iteration
				for (int j = 0;j < i;j++)
				{
					System.out.print("*");
				}
			}
			//a repeat of the above except we start with the triangle height and subtract 1 until we reach the 0th row
			//we start at a row value of triangleHeight-1 so that way there is no duplicate max height row
			for (int i = triangleHeight-1; i > 0;i--)
			{
				System.out.println("");
				//prints the number of stars in each column starting from the 
				for(int j = i;j > 0;j--)
				{
					System.out.print("*");
				}
			}
		}

	}
}