import java.util.*;
public class LeapYear
{
public static String isLeapYear(int y){
	if(y<=1582){
	return "Invalid year!!!";
	}
	if(y%400==0 || (y%4==0 && y%100!=0))
	{
	return "Leap Year";
	}
	return "Not a Leap Year";
}
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int year = input.nextInt();
	
	System.out.println(isLeapYear(year));
}
}