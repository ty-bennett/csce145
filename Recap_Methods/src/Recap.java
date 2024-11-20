
public class Recap {

	public void print(String s)
	{
		System.out.println(s);
	}
	public double inchesToCenti(double inches) 
	{
		return inches * 2.54;
		// once return is used the method is done
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recap r = new Recap();
		r.print("Hello");
		
		double inches = 2;
		double centi = inches * 2.54;
		r.print(centi + "");
		
		r.print(r.inchesToCenti(inches) + "");
	}

}
