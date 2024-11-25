/*
 * Written by Ty Bennett
 */

import java.util.Scanner;

public class Lab04 {

	public static void main(String[] args) {
		//ask user for int input and use that as the size of the matrix
		Scanner keyboard = new Scanner(System.in);
		//introductory message 
		System.out.println("Welcome to the matrix adder program!");
		//ask the user for the two dimensions of the array
		System.out.println("Please enter the length and width of the first matrix");
		//ask user for the length of the matrix and store in variable called array1Length
		int array1Length = keyboard.nextInt();
		//ask user for the width of the matrix and store in variable called array1Width
		int array1Width = keyboard.nextInt();
		//create a 2D array with name array1 that is the Length and width of the input that the user gave us
		int[][] array1 = new int[array1Length][array1Width];

		//create a for loop to iterate through each value in the 2D array and ask for input into each value at that index
		for(int i = 0; i < array1.length;i++)
		{
			for(int j = 0;j<array1[i].length;j++)
			{
				//ask user to enter a value at index(length) i and index(width) j
				System.out.println("Enter a value at index " + i + " " + j);
				//store this input in the specific indice of the array
				array1[i][j] = keyboard.nextInt();
			}
		}
		//ask the user for the length and width of the second array
		System.out.println("Please enter the length and width of the second matrix");
		//ask user for the length of the matrix and store in variable called array2Length
		int array2Length = keyboard.nextInt();
		//ask user for the width of the matrix and store in variable called array2Width
		int array2Width = keyboard.nextInt();
		//create a 2D array with name array1 that is the Length and width of the input that the user gave us
		int[][] array2 = new int[array2Length][array2Width];

		//create a for loop to iterate through each value in the 2D array and ask for input into each value at that index
		for(int i = 0; i < array2.length;i++)
		{
			for(int j = 0;j<array2[i].length;j++)
			{
				//ask user to enter a value at index(length) i and index(width) j
				System.out.println("Enter a value at index " + i + " " + j);
				//store this input in the specific indice of the array
				array2[i][j] = keyboard.nextInt();
			}
		}
		//check to see if the two matrices are the same length and width
		//for loop to print out each value inside the 2Darray called "array1"
		if (array1Length != array2Length || array1Width != array2Width)
		{
			System.out.println("The dimensions the of matrices do not match, please restart the program and try again.");
		}
		else {
			for(int i = 0; i < array1.length;i++)
			{
				for(int j = 0; j<array1[i].length;j++)
				{
					System.out.print(array1[i][j] + " ");
				}
				System.out.println();
			}
			//plus symbol to signify we are adding the first matrix then the second matrix
			System.out.println("+");
			//for loop to print out each value inside the second matrix
			for(int i = 0; i < array2.length;i++)
			{
				for(int j = 0; j<array2[i].length;j++)
				{
					System.out.print(array2[i][j] + " ");
				}
				System.out.println();
			}
			//print out an "=" to let the user know we are adding the two matrices together
			System.out.println("=");

			//create a third 2D array with the length of the first array and the width of the second array
			int[][] array3 = new int[array1Length][array2Width];

			//for loop to iterate through each value inside the 3rd array 
			for(int i = 0; i<array3.length;i++)
			{
				for(int j=0;j<array3[i].length;j++)
				{
					//for each value inside the 3rd array we add the value of the first array + the second array for the value of the third array
					array3[i][j] = array2[i][j] + array1[i][j];
				}
			}
			//print each value inside the 3rd array in a 2d array format
			for(int i = 0; i < array3.length;i++)
			{
				for(int j = 0; j<array3[i].length;j++)
				{
					System.out.print(array3[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}

