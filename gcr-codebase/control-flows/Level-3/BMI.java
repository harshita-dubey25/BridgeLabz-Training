import java.util.*;
public class BMI
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	double weight = input.nextDouble();
	double height = input.nextDouble();
	
	height/=100;
	double bmi = weight/(height*height);
	if(bmi<=18.4){
	System.out.println("UnderWeight");
	}
	else if(bmi>=18.5 && bmi<=24.9){
	System.out.println("Normal");
	}
	else if(bmi>=25.0 && bmi<=39.9){
	System.out.println("OverWeight");
	}
	else{
	System.out.println("Obese");
	}
	
}
}
