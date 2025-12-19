import java.util.*;
public class StudentMarksheet2D
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int numberOfStedents = input.nextInt();
	int[][] marks = new int[numberOfStedents][3];
	double[] percentage = new double[numberOfStedents];
	char[] grade = new char[numberOfStedents];
	
	for(int i=0;i<numberOfStedents;i++){
		for(int j=0;j<3;j++){
			marks[i][j] = input.nextInt();
			if(marks[i][j]<0){
				System.out.println("Please enter a posotive number");
				j--;
			}	
		}
	}
	for(int i=0;i<numberOfStedents;i++){
		percentage[i] = (marks[i][0]+marks[i][1]+marks[i][2])/3.0;
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
		System.out.println("Marks of Student "+(i+1)+" in Physics, Chemistry, and Maths are "+marks[i][0]+","+marks[i][1]+","+marks[i][2]);
		System.out.println("Percentage : "+percentage[i]);
		System.out.println("Grade : "+grade[i]);
		System.out.println();
	}
	
}
}