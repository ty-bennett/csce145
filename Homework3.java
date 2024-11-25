/*
 * Written by Ty Bennett
 */

 // import scanner for user input
import java.util.Scanner;

public class Homework3 {

	//make a global array but do not set a size yet.
    public static double[] RectangleArray; 

		//make a method to sort the array in descending order using bubble sort
    public static void sortDescend(double[] array) {
			//check if the array is empty and return nothing if so. 
        if (array == null) {
            System.out.println("Array is empty");
            return;
        }
				//Bubble sort algorithm
        boolean isSwapped = true;
        double temp;
        while (isSwapped) {
            isSwapped = false; //reset the boolean to avoid an infinite loop
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    isSwapped = true; // Set to true if swap happens
                }
            }
        }
        printArray(array); //print the array after running through sorting algorithm
    }
		
		//sort descend method using bubble sort
    public static void sortAscend(double[] array) {
        if (array == null) { // check if the array passed is empty
            System.out.println("Array is empty");
            return; // return nothing if so
        }
				//bubble sort algorithm.
        boolean isSwapped = true;
        double temp;
        while (isSwapped) {
            isSwapped = false; // Reset this to avoid infinite loop
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    isSwapped = true; // Set to true if swap happens
                }
            }
        }
        printArray(array); //print the array at the end to show the changes
    }

		//a method to print the array
    public static void printArray(double[] array) {
			//check if the array passed is empty
        if (array == null) {
            System.out.println("Array is empty");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
						System.out.println();
        }
    }

    public static void averageArea(double[] array) {
        if (array == null) {
            System.out.println("Array is empty");
            return;
        }
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        double average = total / array.length;
        System.out.println("Average area: " + average);
    }
		public static void minimumArea(double[] array)
		{
			//check to see if array is null
			if(array == null)
			{
				System.out.println("Array is empty");
				return;
			}
			//create a new minimum value at the first array index
			double min = array[0];
			//loop through array 
			for (int i = 0; i < array.length; i++) {
				//if current value is less than the minimum
				if(array[i] < min)
				//new minimum value is that value at the index i 
					min = array[i];
			}
			//print the value to the console
			System.out.println(min);
		}
		//method to check the maximum area of the area
		public static void maximumArea(double[] array)
		{
			//first check to see if the array is null
			if(array == null)
			{
				System.out.println("Array is empty");
				return;
			}
			// create a new maximum value at the first array index
			double max = array[0];
			for (int i = 0; i < array.length; i++) {
				//if the current value at index i is greater than the max, then set the max value to the value at index i
				if(array[i] > max)
					max = array[i];
			}
			//print the max value to the console
			System.out.println(max);
		}
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        boolean isDone = false;
        System.out.println("--------------------------------------------");
        System.out.println("Welcome to the Rectangle Sorter and Creator!");
        String option = "";
        // Move array declaration outside the loop so it's accessible globally
        while (!isDone) {
            System.out.println("Please select from one of the options: (enter as one word)");
            System.out.println("Enter, SortAscend, SortDescend, Average, Minimum, Maximum, or Quit");
            option = k.nextLine().trim(); //trim any input to get rid of whitespace or new line character

						//series of if, else if, and else to check the input and then perform actions based on input
						
						//if user said "enter" and ignore case for ease of use purposes, we are gonna create our # of rectangles here and the size of each

            if (option.equalsIgnoreCase("Enter")) {
                System.out.println("Please enter a number for the amount of rectangles to be created: ");
								//set array size equal to the input
                int rectangleSize = k.nextInt();
                RectangleArray = new double[rectangleSize]; // initialize the array with the specified size

                System.out.println("Time to input values for each rectangle's length and width");
								//for loop to iterate through each value in the array and set a length and width for each rectangle
                for (int i = 0; i < RectangleArray.length; i++) {
                    System.out.println("Rectangle " + (i + 1));
                    System.out.print("Length: ");
                    double l = k.nextDouble();
                    System.out.print("Width: ");
                    double w = k.nextDouble();
										//set the value at that index to be the area of the rectangle (length * width)
                    RectangleArray[i] = w * l;
										//get rid of next line character to clean up the terminal output
										k.nextLine();
                }
                printArray(RectangleArray); //print the rectangle to show user the values in the order in which they input them
            }
						// if the option was to sortAscend
            else if (option.equalsIgnoreCase("SortAscend")) {
							//first check if the array is null
                if (RectangleArray != null && RectangleArray.length > 0) {
									//if not then we can perform the sortAscend method
                    sortAscend(RectangleArray);
                } else {
									//tell the user the array is empty
                    System.out.println("No rectangles entered yet.");
                }
            }
						// if the option was to sortDescend
            else if (option.equalsIgnoreCase("SortDescend")) {
							//first check if the array is null
                if (RectangleArray != null && RectangleArray.length > 0) {
									//the perform the sortDescend method if it is not empty & null
                    sortDescend(RectangleArray);
                } else {
									//tell the user the array is empty otherwise
                    System.out.println("No rectangles entered yet.");
                }
            }
						//if the option is average 
            else if (option.equalsIgnoreCase("Average")) {
							//again check if the array is null
                if (RectangleArray != null && RectangleArray.length > 0) {
									//if not perform the averageArea function to get the average area of the rectangles 
                    averageArea(RectangleArray);
                } else {
									//tell the user their array is empty
                    System.out.println("No rectangles entered yet.");
                }
            }
						//if the user selects the quit option
            else if (option.equalsIgnoreCase("Quit")) {
							//break the while loop by setting isDone to true
                isDone = true;
								//exit with code 0
                System.exit(0);
            }
						//if the option selected is maximum
						else if(option.equalsIgnoreCase("Maximum"))
						{
						//check to see if array is emppty
							if(RectangleArray != null && RectangleArray.length > 0) 
							{
								//if not perform the maximumArea function
								maximumArea(RectangleArray);
							} else {
							//tell the user their array is empty
								System.out.println("No rectangles entered yet.");
							}
						}
						else if(option.equalsIgnoreCase("Minimum"))
						{
						//check to see if array is emppty
							if(RectangleArray != null && RectangleArray.length > 0) 
							{
								//if not perform the minimumArea function
								minimumArea(RectangleArray);
							} else {
							//tell the user their array is empty
								System.out.println("No rectangles entered yet.");
							}
						}
            else {
							//if none of the options above have been selected, then tell the user to try again and type another option
                System.out.println("Invalid option, please try again");
            }
        }
        k.close(); // Close the scanner to prevent memory leaks of course
    }
}
