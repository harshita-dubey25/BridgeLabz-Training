import java.util.*;
public class BMI
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int numberOfPersons = input.nextInt();
	double[] weight = new double[numberOfPersons];
	double[] height = new double[numberOfPersons];
	double[] bmi = new double[numberOfPersons];
	String[] weightData = new String[numberOfPersons];
	
	for(int i=0;i<numberOfPersons;i++){
		weight[i] = input.nextDouble();
	}
	for(int i=0;i<numberOfPersons;i++){
		height[i] = input.nextDouble();
	}
	for(int i=0;i<numberOfPersons;i++){
		bmi[i] = (weight[i]*10000)/(height[i]*height[i]);
	}
	for(int i=0;i<numberOfPersons;i++){
		if(bmi[i]<=18.4){
			weightData[i] = "Underweight";
		}
		else if(bmi[i]>=18.5 && bmi[i]<=24.9){
			weightData[i] = "Normal";
		}
		else if(bmi[i]>=25 && bmi[i]<=39.9){
			weightData[i] = "Overweight";
		}
		else{
			weightData[i] = "Obese";
		}
	}
	for(int i=0;i<numberOfPersons;i++){
		System.out.println("Data of Person "+(i+1));
		System.out.println("Weight : "+weight[i]);
		System.out.println("Height : "+height[i]);
		System.out.println("BMI : "+bmi[i]);
		System.out.println("Weight status : "+weightData[i]);
	}
	
}
}