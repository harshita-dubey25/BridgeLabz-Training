import java.util.*;
public class SumOfNaturalNumbers
{
public static int sumFormula(int n){
	return (n*(n+1))/2;
}
public static int sumRecursion(int n){
	if(n<=0){
		return 0;
	}
	return n+sumRecursion(n-1);
}
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	int number = input.nextInt();
	
	System.out.println("Using Formula: "+sumFormula(number));
	System.out.println("Using Recursion: "+sumRecursion(number));
}
}