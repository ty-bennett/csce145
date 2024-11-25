/*
 * Written by Ty Bennett
 */
public class AppleTester {

	public static void main(String[] args) {
		//creating variables for apple 2 paramters
		String a2Type = "Granny Smith";
		double a2Weight = 2.0;
		double a2Price = 4.50;
		
		//creating variable for apple 3 parameters
		//even though I know they're invalid
	
		String a3Type = "iPad";
		double a3Weight = 2.5;
		double a3Price = -200;
		
		
		//Testing all the methods by making apple objects
		System.out.println("Welcome to the apple tester!");
		System.out.println();
		Apple a1 = new Apple();
		Apple a2 = new Apple(a2Type, a2Weight, a2Price);
		Apple a3 = new Apple(a3Type, a3Weight, a3Price);
		
		//printing the first apple's values 
		System.out.println("Creating the defaul apple...");
		System.out.println("Printing the default apple's values");
		System.out.println(a1);
		
		//printing the values of the second apple  object
		System.out.println("Creating another apple...");
		System.out.println("Setting the new apple's values to the following valid values");
		System.out.println("\"" + a2Type + ", " + a2Weight + ", " + a2Price + "\"");
		System.out.println("Printing the new apple's values");
		System.out.println(a2);
		
		//printing the third apple's, which should be default because we are 
		//inputting invalid values
		System.out.println("Creating another default apple");
		System.out.println("Then setting the new apple's values to the following invalid values");
		System.out.println("\"" + a3Type + ", " + a3Weight + ", " + a3Price + "\"");
		System.out.println("Printing the newest apple's values which should not have changed from the default values");
		System.out.println(a3);
		System.out.println("Checking to see if the first apple and the last apple have the same values");
		System.out.println(a3.equals(a1));

	}
}
