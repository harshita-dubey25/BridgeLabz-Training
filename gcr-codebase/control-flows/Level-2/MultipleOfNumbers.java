import java.util.*;
public class MultipleOfNumbers
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int num = input.nextInt();
	
	if(num<=0 && num>100){
	System.out.println("Not a valid Input");
	System.exit(0);
	}
	for(int i=100;i>0;i--){
	if(num%i==0){
	System.out.println(i);
	}
	}
}
}