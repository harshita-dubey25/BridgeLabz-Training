import java.util.*;
public class SumUsingForAndFormula2
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
		
	int number = input.nextInt();
	int sumWhile = 0;
	int sumFormula = 0;
		
	if(number>0){
	sumFormula = (number*(number+1))/2;
	for(int i=number;i>0;i--){
	sumWhile+=i;
	}
	
	System.out.println("Sum using Formula "+sumFormula);
	System.out.println("Sum using For Loop "+sumWhile);
	}
	else{
	System.out.println("Not a Natural Number");
	}
		
}
}