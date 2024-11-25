
public class Arrays1 {

	public static void main(String[] args) {
		//create an integer array of size 5
		int length = 50;
		int[] array = new int[length];
		
		array[0] = 100;
		array[array.length - 1] = 50;
		
		System.out.println(array[4]);
		
		for(int i = 0; i < array.length; i++) //(.length) is your best friend when iterating through an array //best to help avoid putting constants because they can make bugs
			
		{
			System.out.println(array[i]);
		}
	}
}
