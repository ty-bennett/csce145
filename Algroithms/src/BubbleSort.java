
public class BubbleSort {

	public static void main(String[] args) {
		int[] sortArray = {4,2,1,3,5};
		boolean hasSwapped = false;
		
		do
		{
			hasSwapped = false;
			
			for(int i = 0;i<sortArray.length-1;i++)
			{
				//comparing i to its neighbor (i+1)
				if(sortArray[i] > sortArray[i+1])
				{
					hasSwapped = true;
					int temp = sortArray[i];
					sortArray[i] = sortArray[i+1];
					sortArray[i+1] = temp;
					
					//Dont do thiSSSS
					//sortArray[i] = sortArray[i+1];
					//sortArray[i+1] = sortArray[i];
				}
			}
			for(int j=0;j<sortArray.length;j++) 
			{
				System.out.print(sortArray[j]);
				System.out.println();
			}
			
		} while(hasSwapped);
		
		System.out.println("Sorted list");
		for(int i=0;i<sortArray.length;i++) 
		{
			System.out.println(sortArray[i]);
		}
	}

}
