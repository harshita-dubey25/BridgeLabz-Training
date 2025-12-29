import java.util.*;
public class ResultGenerator{
	static float findAverage(int[] a){
		float average = (a[0]+a[1]+a[2]+a[3]+a[4])/5.0f;
		return average;
	}
	static char assignGrades(int marks){
		int g= marks/10;
		char grade = switch(g){
				case 9-> 'A';
				case 8 -> 'B';
				case 7 -> 'C';
				case 6 -> 'D';
				case 5 -> 'E';
				case 4 -> 'R';
				default -> 'F';
		};
		return grade;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter Marks:");
		for(int i=0;i<5;i++){
			arr[i] = input.nextInt();
		}
		char grades[] = new char[5];
		for(int i=0;i<5;i++){
			grades[i] = assignGrades(arr[i]);
		}
		System.out.println("Result:");
		for(int i=0;i<5;i++){
			System.out.println("Subject "+(i+1)+":"+grades[i]);
		}
	}
	
}