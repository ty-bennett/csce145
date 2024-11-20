
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticValues s = new StaticValues();
		StaticValues s2 = new StaticValues(10,15);
		StaticValues s3 = new StaticValues(15,20);
		
		System.out.println(s.getA());
		System.out.println(s2.getA());
		System.out.println(s3.getA());
		System.out.println(s3.c);
		s3.c = 5;
		System.out.println(s3.c);
		System.out.println(s2.c);
		
	}

}
