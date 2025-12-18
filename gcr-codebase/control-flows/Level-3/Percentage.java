import java.util.*;
public class Percentage
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int physics = input.nextInt();
	int chemistry = input.nextInt();
	int maths = input.nextInt();
	float averageMarks = (physics+chemistry+maths)/3.0f;
	
	
	if(averageMarks>80){
	System.out.println("Average Marks: "+averageMarks);
	System.out.println("Grade: A");
	System.out.println("Level 4, above agency-normalized standards");
	}
	else if(averageMarks>=70 && averageMarks<=79){
	System.out.println("Average Marks: "+averageMarks);
	System.out.println("Grade: B");
	System.out.println("Level 3, at agency-normalized standards");
	}
	else if(averageMarks>=60 && averageMarks<=69){
	System.out.println("Average Marks: "+averageMarks);
	System.out.println("Grade: C");
	System.out.println("Level 2, below, but approaching agency-normalized standards");
	}
	else if(averageMarks>=50 && averageMarks<=59){
	System.out.println("Average Marks: "+averageMarks);
	System.out.println("Grade: D");
	System.out.println("Level 1, well below agency-normalized standards");
	}
	else if(averageMarks>=40 && averageMarks<=49){
	System.out.println("Average Marks: "+averageMarks);
	System.out.println("Grade: E");
	System.out.println("Level 1-, too below agency-normalized standards");
	}
	else{
	System.out.println("Average Marks: "+averageMarks);
	System.out.println("Grade: R");
	System.out.println("Remedial standards");
	}
	
}
}