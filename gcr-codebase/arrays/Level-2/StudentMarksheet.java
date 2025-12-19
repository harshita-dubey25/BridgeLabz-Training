import java.util.*;
public class StudentMarksheet
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int numberOfStedents = input.nextInt();
	int[] physics = new int[numberOfStedents];
	int[] chemistry = new int[numberOfStedents];
	int[] maths = new int[numberOfStedents];
	double[] percentage = new double[numberOfStedents];
	char[] grade = new char[numberOfStedents];
	
	for(int i=0;i<numberOfStedents;i++){
		physics[i] = input.nextInt();
		if(physics[i]<0){
				System.out.println("Please enter a positive number");
				i--;
		}
	}
	for(int i=0;i<numberOfStedents;i++){
		chemistry[i] = input.nextInt();
		if(chemistry[i]<0){
				System.out.println("Please enter a positive number");
				i--;
		}
	}
	for(int i=0;i<numberOfStedents;i++){
		maths[i] = input.nextInt();
		if(maths[i]<0){
				System.out.println("Please enter a positive number");
				i--;
		}
	}
	for(int i=0;i<numberOfStedents;i++){
		percentage[i] = (physics[i]+chemistry[i]+maths[i])/3.0;
		if(percentage[i]>=80){
			grade[i] = 'A';
		}
		else if(percentage[i]>=70 && percentage[i]<=79){
			grade[i] = 'B';
		}
		else if(percentage[i]>=60 && percentage[i]<=69){
			grade[i] = 'C';
		}
		else if(percentage[i]>=50 && percentage[i]<=59){
			grade[i] = 'D';
		}
		else if(percentage[i]>=40 && percentage[i]<=49){
			grade[i] = 'E';
		}
		else{
			grade[i] = 'R';
		}
	}
	for(int i=0;i<numberOfStedents;i++){
		System.out.println("Marks of Student "+(i+1)+" in Physics, Chemistry, and Maths are "+physics[i]+","+chemistry[i]+","+maths[i]);
		System.out.println("Percentage : "+percentage[i]);
		System.out.println("Grade : "+grade[i]);
		System.out.println();
	}
	
}
}