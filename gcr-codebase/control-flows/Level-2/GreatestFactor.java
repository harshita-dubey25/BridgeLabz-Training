import java.util.*;
public class GreatestFactor
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int num = input.nextInt();
	
	if(num<=0){
	System.out.println("Not a valid Input");
	}
	for(int i=num-1;i>0;i--){
	if(num%i==0){
	System.out.println(i);
	break;
	}
	}
}
}