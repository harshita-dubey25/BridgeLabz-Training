import java.util.*;
public class UnitConvertor2
{
public static double convertYardsToFeet(double yards){
	double yards2feet = yards*3;
	return yards2feet;
}
public static double convertFeetToYards(double feet){
	double feet2yards = feet*0.333333;
	return feet2yards;
}
public static double metersToInches(double meters){
	double meters2inches = meters*39.3701;
	return meters2inches ;
}
public static double inchesToMeters(double inches){
	double inches2meters = inches*0.0254;
	return inches2meters;
}
public static double inchesToCentimeters(double inches){
	double inches2cm = inches*2.54;
	return inches2cm;
}
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	double value = input.nextDouble();
	System.out.println(convertYardsToFeet(value));
	System.out.println(convertFeetToYards(value));
	System.out.println(metersToInches(value));
	System.out.println(inchesToMeters(value));
	System.out.println(inchesToCentimeters(value));
}
}