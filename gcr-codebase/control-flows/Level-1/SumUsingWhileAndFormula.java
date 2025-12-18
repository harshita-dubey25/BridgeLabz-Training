import java.util.*;
public class SumUsingWhileAndFormula
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
		
	int number = input.nextInt();
	int sumWhile = 0;
	int sumFormula = 0;
		
	if(number>0){
	sumFormula = (number*(number+1))/2;
	while(number>0){
	sumWhile+=number;
	number--;
	}
	
	System.out.println("Sum using Formula "+sumFormula);
	System.out.println("Sum using While Loop "+sumWhile);
	}
	else{
	System.out.println("Not a Natural Number");
	}
		
}
}