import java.util.*;
public class PrimeNumber
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int num = input.nextInt();
	boolean isPrime = true;
	
	for(int i=2;i<num;i++){
	if(num%i==0){
	isPrime=false;
	break;
	}
	}
	System.out.println(isPrime?"Prime Number":"Not a PrimeNumber");
}
}