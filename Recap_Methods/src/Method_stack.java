
public class Method_stack {

	public void start()
	{
		method1();
		System.out.println("Start!");
		//method1();
	}
	public void method1()
	{
		method2();
		System.out.println("One!");
		//method2();
	}
	public void method2()
	{
		method3();
		System.out.println("Two!");
		//method3();
	}
	public void method3()
	{
		System.out.println("Three!");
	}
	public static void main(String[] args) {
		Method_stack m = new Method_stack();
		m.start();

	}

}
