import java.util.*;
public class BMICalculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double heightAge[][] = new double[10][3];
		
		for(int i=0;i<10;i++){
			System.out.println("Enter weight and height of person "+i);
			heightAge[i][0] =sc.nextDouble();
			heightAge[i][1] = sc.nextDouble();
		}
		double[][] bmi = bmiCalculatorArray(heightAge);
		String[][] data = bmiStatus(bmi);
		display(data);
	}
	public static double calcBMI(double weight, double height){
		height = height/100;
		
		return weight/(height*height);
	}
	public static double[][] bmiCalculatorArray(double[][] data){
		for(int i=0;i<data.length;i++){
			data[i][2] = calcBMI(data[i][0], data[i][1]); 
		}
		return data;
	}
	public static String[][] bmiStatus(double arr[][]){
			String ans[][] =new String[10][4];
			for(int i=0;i<arr.length;i++){
				ans[i][0] = arr[i][0]+"";
				ans[i][1] = arr[i][1]+"";
				ans[i][2] = arr[i][2]+"";
				if(arr[i][2]<=18.4)
					ans[i][3] = "Underwight";
				else if(arr[i][2]<=24.9)
					ans[i][3]= "Normal";
				else if(arr[i][2]<=39.9)
					ans[i][3] = "Overweight";
				else
					ans[i][3] = "Obese";
			}	
			return ans;
	}
	public static void display(String[][] ans){
		for(int i=0;i<ans.length;i++)
			System.out.println(Arrays.toString(ans[i]));
	}
}