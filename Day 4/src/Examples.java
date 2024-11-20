import java.util.Scanner;

public class Examples {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		String a = k.nextLine();
		String b = k.nextLine();
		
		if(a.equals(b)) {
			System.out.println("a is equal to b");
		}
		else {
			System.out.println("a is not equal to b");
		}
	}
}