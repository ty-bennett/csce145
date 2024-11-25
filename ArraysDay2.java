import java.util.Scanner;

public class ArraysDay2 {

	public static void main(String[] args) {

		int[] numbers = {1,2,3,4,5};
		//ask user for number 							(done)
		//check to see if the number is inside the array(
		
		Scanner k = new Scanner(System.in);
		System.out.println("Number to search for: ");
		int target = k.nextInt();
		
		boolean found = false;
		
		for(int i = 0;i<numbers.length;i++)
		{
			if(target == numbers[i])
			{
				found = true;
				break;
			}
		}
		
		if(found) 
		{
			System.out.println("Number is in array!");
		}
		else 
		{
			System.out.println("No number in array :(");
		}
	}

}
//int[] numbers = {1,2,3,4,5};
//
//for(int i=0;i<numbers.length;i++)
//{
//	System.out.println(numbers[i]);
//}

//Searching and sorting through arrays

//searching through array ex: