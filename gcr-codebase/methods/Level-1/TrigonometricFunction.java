import java.util.*;
public class TrigonometricFunction
{
public static double sinFunction(double radians){
	return Math.sin(radians);
}
public static double cosFunction(double radians){
	return Math.cos(radians);
}
public static double tanFunction(double radians){
	return Math.tan(radians);
}

public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	double degrees = input.nextDouble();
	
	double radians = Math.toRadians(degrees);
	double sinValue = sinFunction(radians);
	double cosValue = cosFunction(radians);
	double tanValue = tanFunction(radians);
	
	System.out.println("Sin of "+degrees+" degrees is "+sinValue);
	System.out.println("Cos of "+degrees+" degrees is "+cosValue);
	System.out.println("Tan of "+degrees+" degrees is "+tanValue);
}
}