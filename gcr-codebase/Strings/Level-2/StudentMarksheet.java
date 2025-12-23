import java.util.*;
public class StudentMarksheet{
	public static float[][] takeMarks(int n){
		float arr[][] = new float[n][3];
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
				arr[i][j] = (int)(Math.random()*90)+10;
			}
		}
		return arr;
    }
	public static float[][] findAveragePercentage(float[][] a){
		float arr[][] = new float[a.length][3];
		for(int i=0;i<a.length;i++){
			arr[i][0] = Math.round(a[i][0]+a[i][1]+a[i][2]);
			arr[i][1] = Math.round(arr[i][0]/3);
			arr[i][2] = arr[i][1];
		}
		return arr;
	}
	public static String[][] findGrades(float[][] a){
		String arr[][] = new String[a.length][2];
		for(int i=0;i<a.length;i++){
			arr[i][0] = ""+a[i][2];
			if(a[i][2]>=80){
				arr[i][1] = "A";
		    }
			else if(a[i][2]>=70 && a[i][2]<=79){
				arr[i][1] = "B";
			}
			else if(a[i][2]>=60 && a[i][2]<=69){
				arr[i][1] = "C";
			}
			else if(a[i][2]>=50 && a[i][2]<=59){
				arr[i][1] = "D";
			}
			else if(a[i][2]>=40 && a[i][2]<=49){
				arr[i][1] = "E";
			}
			else{
				arr[i][1] = "R";
			}
		}
		return arr;
	}
	public static void displayMatrix(float[][] arr,float[][] arr2, String[][] arr3){
		for(int i=0;i<arr.length;i++){
			System.out.println("Marks in physics: "+arr[i][0]);
			System.out.println("Marks in chemistry: "+arr[i][1]);
			System.out.println("Marks in maths: "+arr[i][2]);
			System.out.println("Total marks: "+arr2[i][0]);
			System.out.println("Average marks: "+arr2[i][1]);
			System.out.println("Percentage: "+arr2[i][2]);
			System.out.println("Grades: "+arr3[i][1]);
		}
    }
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		float[][] marks = takeMarks(n);
		float[][] result = findAveragePercentage(marks);
		String[][] grades = findGrades(result);
		displayMatrix(marks,result,grades);
	}
}