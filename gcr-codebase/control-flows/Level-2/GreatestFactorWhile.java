import java.util.*;
public class GreatestFactorWhile
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int num = input.nextInt();
	int i=num-1;
	
	if(num<=0){
	System.out.println("Not a valid Input");
	}
	while(i>0){
	if(num%i==0){
	System.out.println(i);
	break;
	}
	i--;
	}
}
}