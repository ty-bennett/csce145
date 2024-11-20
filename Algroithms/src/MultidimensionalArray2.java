
public class MultidimensionalArray2 {

	public static void main(String[] args) {
		int[][] array2D = new int[3][];
		
		array2D[0] = new int[2];
		array2D[1] = new int[5];
		array2D[2] = new int[3];

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
