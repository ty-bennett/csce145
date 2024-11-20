import java.util.Scanner;

public class Examples {

	public static void main(String[] args) {
		//Cmd/Ctrl Shift O = auto import 
		// to comment multiple line cmd + /
		//Cmd A and Cmd I auto aligns and indents
		Scanner k = new Scanner(System.in);
		System.out.println("Please type in a number: ");
		int num = k.nextInt();
		System.out.println("Please type in another number");
		int num2 = k.nextInt();

		if (num > num2) {
			System.out.println("Num1 > Num2");
		}
		else if (num == num2) {
			System.out.println("num1 = num2");
		}
		else {
			System.out.println("Num 1 < Num 2");
		}
		System.out.println("Finsih");
	}
}
