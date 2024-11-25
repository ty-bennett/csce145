import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		//declare the cat
//		Cat cat01;
//		//construct the object cat01
//		cat01 = new Cat(); 
//		//no arguments = defualt constructor 
//		
//		Cat cat02;
//		cat02 = new Cat("Fluffy", 8.0, 4);
//		//cat01.weight = -5; nooooooooo dont do this
//		
//		System.out.println(cat02.getName());
//		cat02.setName("Scruffy");
//		System.out.println(cat02.getName());
//		
//		cat02.setWeight(-1);
//		System.out.println(cat02.getWeight());  
		Scanner k = new Scanner(System.in);
		//dataType id = new dataType(args);
		
		Cat cat1 = new Cat();
		Cat cat2 = new Cat("Fluffy", 5.0, 3);
		
		System.out.println(cat2.getName());
		cat2.setName("Fluffy Jr.");
		System.out.println(cat2.getName());
		
		
	}
	

}
