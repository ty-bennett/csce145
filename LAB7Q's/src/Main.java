
public class Main {

	public static void main(String[] args) {
		Machine m1 = new Machine();
		m1.setName("Machine01");
		Machine m2 = Machine.copyAndRenameMachine("Machine02", m1);
		System.out.println(m1);
		System.out.println(m2);
	}
}
