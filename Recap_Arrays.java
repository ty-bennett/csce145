
public class Recap_Arrays {

	public static void main(String[] args) {
		int [] array = {10, -2, 14, 12, 1, 3};
		// alt method
		// int[] array = new int[size];
		
		//Find the max value of the array 
		// Needs:
			//Some variable to keep track of the current max value
			// Loop to look at all numbers
		
		int min = array[0];
		//Alt shift r to rename a variable everywhere 
		
		for(int i = 1; i<array.length; i++) 
		{
			if(min > array[i]) 
			{
				min = array[i];
			}
		}
		System.out.println(min);

	}

}
