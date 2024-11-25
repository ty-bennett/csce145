
public class OverloadedMethods {

	public static void print(String s)
	{
		System.out.println(s);
	}
	public static void print(int i)
	{
		System.out.println(i);
	}
	public static void print(float f)
	{
		System.out.println("The float is here");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("Hello, World!");
		print(5);
		print(10.0f);

	}

}
