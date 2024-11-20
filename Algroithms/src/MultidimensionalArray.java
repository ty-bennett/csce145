
public class MultidimensionalArray {
	public static void main(String[] args){
		//2d array
		int[][] array2D = new int[2][3];
		
		//first value (0) is saying which array we are working with (0 or 1)
		//Second value(1) is saying which element in that array we are working with 
		
		//array2D[0][1] = 5;
		
		for(int i = 0; i < array2D.length; i++)
		{
			for(int j = 0; j < array2D[i].length; j++)
			{
				array2D[i][j] = j;
			}
		}
		for(int i = 0; i < array2D.length; i++)
		{
			System.out.print("Array #" + i + ": ");
			for(int j = 0; j < array2D[i].length; j++)
			{
				System.out.print(array2D[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
