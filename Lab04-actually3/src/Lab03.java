/*
 * Written by Ty Bennett
 */
import java.util.Scanner;

public class Lab03 {

	public static void main(String[] args) {
		// initialize a scanner for user input
		Scanner keyboard = new Scanner(System.in);
		// intialize a new array that can hold 10 values
		double[] temperatureArray = new double[10];
		// sets a double value for the average temperature equal to 0
		double averageTemperature = 0;
		// sets a double value for the total temperature equal to 0
		double totalTemperature = 0;
		// prompt user for input for each day starting at Day 1 and iterating up to Day 10
		System.out.println("Welcome to the below average temperature tester program.");
		// for loop to iterate 10 times to prompt the user for 10 inputs
		for(int i = 0;i < temperatureArray.length;i++)
		{
			//prompts the user for the input on a specific day 
			//we add 1 to i because we want to start counting at 1 for the day but start at 0 for the index of the array
			System.out.println("Please enter the temperature for Day "+(i+1)+" ");
			//gets the next double input from the user and stores it in a variable called temperature
			double temperature = keyboard.nextDouble();
			// update the index i of the array to be the temperature that was entered in by the user
			temperatureArray[i] = temperature;
			// update the total temperature by adding each value from each input from the user
			totalTemperature += temperature;
		}
		// stores the average temperature value by dividing the total temperature by 10 (the number of days)
		averageTemperature = totalTemperature / 10;
		System.out.println("The average temperature was " + averageTemperature);
		System.out.println("The days that were below average were:");
		//another for loop to loop through the array since we know there are 10 days
		for(int i = 0;i<temperatureArray.length;i++)
		{
			// if the value of the array at index i is less than the average temperature then
			if (temperatureArray[i] < averageTemperature) {
				// the program prints to the console the day that was below average and the temperature on that day
				System.out.println("Day " +(i+1) + " with " + temperatureArray[i]);
			}
			else 
			{
				//if the value of the array at index i is not less than the average temperature variable, then the program continues to the next iteration
				continue;
			}

		}
	}

}
