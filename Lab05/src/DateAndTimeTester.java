/*
 * Written by Ty Bennett
 */
import java.util.Scanner;

public class DateAndTimeTester  {
	//create delimeters when reading and creating the substrings
	
	//create a char called slashDelimeter to hold the / character
	char slashDelimeter = '/';
	//create a char called colonDelimeter to hold the : character
	char colonDelimeter = ':';
	//create a char called spaceDelimeter to hold the ' ' character
	char spaceDelimeter = ' ';
	//create a boolean called isOver and set it to false for use in the while loop condition
	boolean isOver = false;
	public void run()
	{
		// set a while loop to run the program until the user types quit to end the program or continue to continue the program
		while (isOver != true)
		{
			//new scanner taking in user input
			Scanner k = new Scanner(System.in);
			//ask the user for a date in the MM/DD hh:mm format
			System.out.println("Enter a date and time (MM/DD hh:mm) and I will determine if it is a valid format");
			// capture the user input and store it into a variable called dateTime
			String dateTime = k.nextLine();
			//call the isValid() method to check the validity of the user's input
			isValid(dateTime);
			//gather user input to see if they would like to check another date or if they would like to quit
			System.out.println("Would you like to exit? Type \"quit\" to exit or \"continue\" to continue");
			//store the user input in the String quitOrContinue
			String quitOrContinue = k.next();
			//make the user input all lowercase letters to use when checking what was typed
			quitOrContinue.toLowerCase();
			if (quitOrContinue.equals("quit"))
			{
				System.out.println("The program has ended.");
				break;
			}
			else if(quitOrContinue.equals("continue"))
			{
				continue;
			}
			else
			{
				break;
			}
		}
		System.exit(0);
	}
	// is valid method takes a string as an argument
	public boolean isValid(String date)
	{
		//if the validDate method and validTime method are true then the boolean evaluates to true
		if (isValidDate(date) && isValidTime(date)) 
		{
			System.out.println("The date and time is valid");
			return true;
		}
		System.out.println("The date and time is not valid");
		return false;
	}
	// method to check if the date is valid, returns a boolean type
	public boolean isValidDate(String date)
	{
		//create a new local variable called month and day and use the getMonth() and getDay() methods and pass a string as an arg
		int month = getMonth(date);
		int day = getDay(date);
		
		//check to see if month is in the 1-12 range
		if(month > 0 || month < 13)
		{
			//check for months with 30 days
			if (month == 2 || month == 4 || month == 6|| month == 9 || month == 11)
			{
				//if the day is greater than 30 or less than 1, return false
				if(day > 30 || day < 1)
				{
					return false;
				}
			}
			//check for months with 31 days
			else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			{
				//if the day is greater than 31 or less than 1, return false
				if(day > 31 || day < 1)
				{
					return false;
				}
			}
			// if the month is February and the day is greater than 29, return false
			else if(month == 2)
			{
				// if the day is greater than 29 or less than 1 then return false
				if (day > 29 || day < 1)
				{
					return false;
				}
			}
			// if all the other conditions are false then return true but still within the month range
			return true;
		}
		//if the month is outside the month range return false
		return false;
	}
	public boolean isValidTime(String date)
	{
		int hour = getHour(date);
		int minute = getMinute(date);
		
		if ((hour < 1 || hour > 12) || (minute > 59 || minute < 0)) 
		{
			return false;
		}
		return true;
	}
	
	//get methods that have an argument from the user input
	
	//first method gets the month with an argument of date with type String
	public int getMonth(String date)
	{
		//set an end index of whatever the index of the '/' character is in the date string
		int endIndex = date.indexOf(slashDelimeter);
		//make a string called date slice that is a substring taken from the first character in the date string up until the / character 
		String dateSlice = date.substring(0, endIndex);
		//turn those numbers taken from that slice into an integer with the parseInt method
		int dateMonth= Integer.parseInt(dateSlice);
		//return the integer and end the method call
		return dateMonth;
	}
	//the getDay method takes a string input that is called date
	public int getDay(String date)
	{
		//the end index of the substring will be the index of the ' ' character
		int endIndex = date.indexOf(spaceDelimeter);
		// the start index of the substring will be the '/' character
		int startIndex = date.indexOf(slashDelimeter);
		// create a slice from the date string with the start index at the index of the / + 1 and the end is the index of the space
		String daySlice = date.substring(startIndex + 1, endIndex);
		//turn those numbers taken from that slice into an integer with the parseInt method
		int dateDay = Integer.parseInt(daySlice);
		//return the integer and end the method call
		return dateDay;
	
	}
	public int getHour(String date)
	{
		// the start index of the substring will be the ' ' (space) character
		 int startIndex = date.indexOf(spaceDelimeter);
		 // the end index will be the ':' character
		 int endIndex = date.indexOf(colonDelimeter);
		 //create a slice of the date string with those indexes
		 String hourSlice = date.substring(startIndex + 1, endIndex);
		//turn those numbers taken from that slice into an integer with the parseInt method
		 int dateHour = Integer.parseInt(hourSlice);
		//return the integer and end the method call
		 return dateHour;
		 
	}
	public int getMinute(String date)
	{
		// the start index of the substring will be the ':' character
		int startIndex = date.indexOf(colonDelimeter);
		// create a new string with the slice starting at the colon and ending at the last character in the string
		String minuteSlice = date.substring(startIndex + 1, date.length());
		//turn those numbers taken from that slice into an integer with the parseInt method
		int dateMinute = Integer.parseInt(minuteSlice);
		//return the integer and end the method call
		return dateMinute;
	}
}