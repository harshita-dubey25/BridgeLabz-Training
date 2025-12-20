import java.util.*;
public class WindChillTemperature
{
public static double calculateWindChill(double temp, double windSpeed){
	double windChill = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed,0.16);
	return windChill;
}

public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	double temp = input.nextDouble();
	double windSpeed = input.nextDouble();
		
	System.out.println("Wind Chill Temperature : "+calculateWindChill(temp,windSpeed));
}
}