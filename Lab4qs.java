
public class Lab4qs {

	public static void main(String[] args) {
		double[][] values = new double[5][];
		for(int i=0;i<values.length;i++)
		{
			values[i] = new double[i+1];
			for(int j=0;j<values[i].length;j++)
			{
				values[i][j] = i*values.length+j;
			}
		}
		for(int i=0;i<values.length;i++)
		{
			for(int j=0;j<values[i].length;j++)
			{
				System.out.print(values[i][j]+" ");
			}
			System.out.println();
		}

	}

}
