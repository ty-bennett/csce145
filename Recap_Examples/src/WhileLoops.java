
public class WhileLoops {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		while(i < 5)
		{
			i++;
			j = 0;
			while(j < 5) {
				j++;
				System.out.println(i + " " + j);
			}
		}
		
	}
	
//////////////////////////////
	//while loops but with floats demonstrating rounding error
//		double a = 10.0;
//		
//		while(a >= 0)
//		{
//			System.out.println(a);
//			a -= 0.1;
//		}
//		
//		
///////////////	//////////////
	//do while loops
//		int a = 10;
//		
//		do 
//		{
//			System.out.println(a);
//			a++;
//		}while(a < 10);
/////////////////////
/////////////////////
	///////basic while loop
//		int i = 0;
//		
//		while(i < 5)
//		{
//			System.out.println(i);
//			i++;
//		}
//	}

}
