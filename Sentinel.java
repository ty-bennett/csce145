import java.util.Scanner;

public class Sentinel {

	public static void main(String[] args) {
		//Ask the user for numbers until they type in a negative number
		//Print the avg of those numbers 
		
		Scanner k = new Scanner(System.in);
		
		int input = 0;
		int sum = 0;
		int total = 0;
		
		while(true)
		{
			input = k.nextInt();
			if(input < 0)
			{
				break;
			}
			
			sum += input;
			total++;
		}
		System.out.println((float)sum/(float)total);
	}

}
