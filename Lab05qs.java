
public class Lab05qs {
	public static void main(String[] args)
	{
		isValid(3);
	}
	public static boolean isValid(int value)
	{
		if(value >= 0)
		{
			return true;
		}
		else if(value < 0)
		{
			return false;
		}
	}
}
