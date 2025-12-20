import java.util.*;
public class UnitConvertor
{
public static double convertFarhenheitToCelsius(double farhenheit){
	double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
	return farhenheit2celsius;
}
public static double convertCelsiusToFarhenheit(double celsius){
	double celsius2farhenheit = (celsius * 9 / 5) + 32;
	return celsius2farhenheit;
}
public static double poundsToKilogram(double pounds){
	double pounds2kilograms = pounds * 0.453592;
	return pounds2kilograms ;
}
public static double kilogramToPounds(double kilogram){
	double kilograms2pounds = kilogram*2.20462; 
	return kilograms2pounds;
}
public static double gallonsToLiters(double gallons){
	double gallons2liters = gallons*3.78541; 
	return gallons2liters;
}
public static double litersToGallons(double liters){
	double liters2gallons = liters*0.264172;  
	return liters2gallons;
}

public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	double value = input.nextDouble();
	System.out.println(convertCelsiusToFarhenheit(value));
	System.out.println(convertFarhenheitToCelsius(value));
	System.out.println(kilogramToPounds(value));
	System.out.println(poundsToKilogram(value));
	System.out.println(gallonsToLiters(value));
	System.out.println(litersToGallons(value));
}
}