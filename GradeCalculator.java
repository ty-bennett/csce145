import java.util.Scanner;

public class GradeCalculator 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to the grading calculator. Please input your grades: ");
		
		Scanner k = new Scanner(System.in);
		System.out.print("Lab grade: ");
		double labs = k.nextDouble();
		System.out.print("Homework grade: ");
		double hw = k.nextDouble();
		System.out.print("Final exam grade: ");
		double finalExam = k.nextDouble();
		
		double final_grade = (labs * .4f) + (hw * .4f) + (finalExam * .2f);
		System.out.println("Your final grade is: "+final_grade);
		
		if(final_grade > 89)
		{
			System.out.println("A");
		}
		else if(final_grade > 79)
		{
			System.out.println("B");
		}
		else if(final_grade > 69)
		{
			System.out.println("C");
		}
		else if(final_grade > 59)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("F");
		}
	}
}
