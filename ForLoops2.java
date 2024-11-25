import java.util.Scanner;

public class ForLoops2 {

	public static void main(String[] args) {
		// Ask the user for a number									(done)
		//Print all of the numbers from 0 up till the number given		(done)
		//Then ask the user for that many numbers and add them together (done)
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("Please type in a number greater than 0: ");
		int userNumber = k.nextInt();

		for(int i = 0; i <= userNumber; i++)
		{
			System.out.println(i);
		}
		System.out.println("Input "+userNumber+ " numbers: ");
		
		int finalSum = 0;
		
		for(int i = 0; i < userNumber; i++)
		{
			int num = k.nextInt();
			finalSum += num;
		}
		System.out.println(finalSum);
	}
}
