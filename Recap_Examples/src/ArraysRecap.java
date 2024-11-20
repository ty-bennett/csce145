
public class ArraysRecap {

	public static void main(String[] args) {
		// to make an array
		//datatype[] identifier = new datatype[size];
		int[] numbers = new int[5];
		
		//to change first value
		
		numbers[0] = 10;
		//to get last value of array of any specified length
		numbers[numbers.length - 1] = 5;
		
		for(int i = 0; i < numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}

	}

}
