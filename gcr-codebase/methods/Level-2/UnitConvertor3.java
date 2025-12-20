import java.util.*;
public class UnitConvertor3
{
public static double convertKmToMiles(double km) {
	double km2miles = km*0.621371;
	return km2miles;
}
public static double convertMilesToKm(double miles){
	double miles2km = miles*1.60934;
	return miles2km;
}
public static double metersToFeet(double meters){
	double meters2feet = meters*3.28084;
	return meters2feet ;
}
public static double feetToMeters(double feet){
	double feet2meters = feet*0.3048;
	return feet2meters;
}
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	double value = input.nextDouble();
	System.out.println(convertKmToMiles(value));
	System.out.println(convertMilesToKm(value));
	System.out.println(metersToFeet(value));
	System.out.println(feetToMeters(value));
}
}