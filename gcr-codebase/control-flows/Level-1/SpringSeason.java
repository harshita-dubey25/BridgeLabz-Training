import java.util.*;
public class SpringSeason
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
		
	int month = input.nextInt();
	int date = input.nextInt();
		
	if((month==3 && date>=20) || (month==6 && date<=20) || (month >=3 && month <=6)){
	System.out.println("Its a Spring Season");
	}
	else{
	System.out.println("Not a Spring Season");
	}
}
}