import java.util.Scanner;

public class Methods {

	public void greetings() 
	{
		System.out.println("Hello world i <3 u");
	}
	
	public String getGreetingString()
	{
		return "Hello World!";
	}
	
	public double inchesToCentimeters(double inches)
	{
		double centimeters = 2.54 * inches;
		return centimeters;
	}
	public boolean isGreaterThan(int a, int b)
	{
		return a > b;
	}
	
	
	public static void main(String[] args) {
		Methods m = new Methods();  //this is making a methods object
		m.greetings();
		System.out.println(m.getGreetingString());
		Scanner k = new Scanner(System.in);
		double inches = k.nextDouble();
		System.out.println(m.inchesToCentimeters(inches));
	}

}
