package Java_Sem2;
import java.util.*;

public class GradeCalculator {
	public static void main(String[]args) 
	{
		Scanner user = new Scanner(System.in);
		
		System.out.print("Enter your full name: ");
		String name = user.nextLine();
		
		System.out.print("Enter course name: ");
		String course = user.nextLine();
		
		System.out.print("Enter your score [0-100]: ");
		int score = user.nextInt();
		
		if(score>100 || score<0)
		{
			System.out.println("Failed to calculate grade!");
		}
		else
		{
		grade_Calculator(name, course, score);
		}
	}
	
	
	public static void grade_Calculator(String name, String course, int score)
	{
		System.out.println("");
		System.out.println("Grade Calculator");
		System.out.println("===============================");
		System.out.println("Name: " + name);
		System.out.println("Course Name: " + course);
		//System.out.println("");
	
		
		if(score<=100 && score>=90)
		{
			System.out.println("Your Grade is A");
		}
		if(score<90 && score>=85)
		{
			System.out.println("Your Grade is A-");
		}
		if(score<85 && score>=80)
		{
			System.out.println("Your Grade is B+");
		}
		if(score<80 && score>=75)
		{
			System.out.println("Your Grade is B");
		}
		if(score<75 && score>=70)
		{
			System.out.println("Your Grade is B-");
		}
		if(score<70 && score>=65)
		{
			System.out.println("Your Grade is C");
		}
		if(score<65 && score>=50)
		{
			System.out.println("Your Grade is D");
		}
		if(score<50 && score>=0)
		{
			System.out.println("Your Grade is E");
		}
	}
}
