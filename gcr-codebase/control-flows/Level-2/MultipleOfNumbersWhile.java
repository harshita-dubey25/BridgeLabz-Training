import java.util.*;
public class MultipleOfNumbersWhile
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int num = input.nextInt();
	int counter=num-1;
	
	if(num<=0 && num>100){
	System.out.println("Not a valid Input");
	System.exit(0);
	}
	while(counter>0){
	if(num%counter==0){
	System.out.println(counter);
	}
	counter--;
	}
}
}