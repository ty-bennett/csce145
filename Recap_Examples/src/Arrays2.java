import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		//		int[] array = new int[5];
		//		
		//		for(int i = 0;i < array.length; i++)
		//		{
		//			array[i] = i;
		//		}
		//		System.out.println(array);

		//Ask user for number
		//Ask the user for that many numbers and save them into an  array
		// print the array one value at a time
		Scanner k = new Scanner(System.in);
		System.out.println("How many numbers do you want to save? ");
		int size = k.nextInt();

		int[] numbers = new int[size];

		for(int i = 0; i < numbers.length; i++)
		{
			System.out.println("Input number "+ (i + 1) + ": ");
			numbers[i]= k.nextInt();
		}
		for(int i = 0; i < numbers.length; i++)
		{
			System.out.println("Saved number "+ (i + 1) + ": ");
			System.out.println(numbers[i]);
		}
	}
}