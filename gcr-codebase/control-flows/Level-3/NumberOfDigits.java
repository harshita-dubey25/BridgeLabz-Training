import java.util.*;
public class NumberOfDigits
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int num = input.nextInt();
	int count = 0;
	
	while(num>0){
	count++;
	num/=10;
	}
	System.out.println(count);
	
}
}
