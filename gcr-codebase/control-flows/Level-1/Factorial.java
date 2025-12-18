import java.util.*;
public class Factorial{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int number = input.nextInt();
	int fatorial = 1;
	
	if(number>=0){
	while(number>1){
	fatorial*=number;
	number--;
	}
	System.out.println(fatorial);
	}
	else
	{
	System.out.println("Not a Positive Number");
	}		
}
}