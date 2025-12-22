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
			arr[i][2] = arr[0][1];
	}
	return arr;
}
public static void displayMatrix(float[][] arr){
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[0].length;j++){
			System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
	}
}

public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int students = input.nextInt();
	
	float[][] sheet = takeMarks(students);
	displayMatrix(sheet);
	System.out.println();
	float[][] result = findAveragePercentage(sheet);
	displayMatrix(result);
	System.out.println();
	
}
}
