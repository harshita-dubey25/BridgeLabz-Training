import java.util.*;
public class NaturalNumber
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
		
	int number = input.nextInt();
		
	int sum = (number*(number+1))/2;
		
	if(number>0){
	System.out.println("The sum of "+number+" natural numbers is "+sum);
	}
	else{
	System.out.println("The number "+number+" is not a natural number");
	}
	}
}