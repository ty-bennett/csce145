import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a 4 digit binary number");
		String binary1 = keyboard.nextLine();
		System.out.println("Enter another 4 digit binary number");
		String binary2 = keyboard.nextLine();
		
		int binary1decimal = 0;
		int binary2decimal = 0;
		
		char[] binary1array = binary1.toCharArray();
		char[] binary2array = binary2.toCharArray();
		
		for(int i = binary1.length()-1;i>=0;i--)
		{
			binary1array[i] = i;
		}
//		for(int i = binary1.length()-1;i >= 0; i--)
//		{
//			if(binary1array[i] == '1')
//			{
//				binary1decimal += Math.pow(2, i);
//			}
//			else
//			{
//				continue;
//			}
//		}
		
		int binary3 = binary1decimal + binary2decimal;
		System.out.println(binary1array);
	}
}

