import java.util.*;
public class Factorial2{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int number = input.nextInt();
	int fatorial = 1;
	
	if(number>=0){
	for(int i=number;i>1;i--){
	fatorial*=i;
	}
	System.out.println(fatorial);
	}
	else
	{
	System.out.println("Not a Positive Number");
	}
			
}
}