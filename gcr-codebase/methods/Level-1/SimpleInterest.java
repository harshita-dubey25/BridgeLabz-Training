import java.util.*;
public class SimpleInterest
{
public static float findSI(float p, float t, float r){
	return (p*t*r)/100;
} 
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	float principle = input.nextFloat();
	float time = input.nextFloat();
	float rate = input.nextFloat();
	
	float si = findSI(principle,time,rate);
	
	System.out.println("The Simple Interest is "+si+" for Principal "+principle+", Rate of Interest "+rate+" and Time "+time);
}
}