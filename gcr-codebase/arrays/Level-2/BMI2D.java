import java.util.*;
public class BMI2D
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int numberOfPersons = input.nextInt();
	double[][] personData = new double[numberOfPersons][3];
	String[] weightData = new String[numberOfPersons];
	
	for(int i=0;i<numberOfPersons;i++){
		for(int j=0;j<2;j++){
			personData[i][j] = input.nextDouble();
		}
		personData[i][2] = (personData[i][0]*10000)/(personData[i][1]*personData[i][1]);
	}
	for(int i=0;i<numberOfPersons;i++){
		if(personData[i][2]<=18.4){
			weightData[i] = "Underweight";
		}
		else if(personData[i][2]>=18.5 && personData[i][2]<=24.9){
			weightData[i] = "Normal";
		}
		else if(personData[i][2]>=25 && personData[i][2]<=39.9){
			weightData[i] = "Overweight";
		}
		else{
			weightData[i] = "Obese";
		}
	}
	for(int i=0;i<numberOfPersons;i++){
		System.out.println("Data of Person "+(i+1));
		System.out.println("Weight : "+personData[i][0]);
		System.out.println("Height : "+personData[i][1]);
		System.out.println("BMI : "+personData[i][2]);
		System.out.println("Weight status : "+weightData[i]);
	}
	
}
}