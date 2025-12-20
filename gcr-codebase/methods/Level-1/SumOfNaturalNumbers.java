import java.util.*;
public class SumOfNaturalNumbers
{
public static int findSum(int n){
	int sum=0;
	for(int i=1;i<=n;i++){
		sum+=i;
	}
	return sum;
}
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int number = input.nextInt();
	
	System.out.println(findSum(number));
}
}