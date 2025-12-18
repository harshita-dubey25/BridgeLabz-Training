import java.util.*;
public class ArmstrongNumber
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int num = input.nextInt();
	int originalNumber = num;
	int sum = 0;
	
	while(num>0){
	int r = num%10;
	sum+=Math.pow(r,3);
	num/=10;
	}
	if(sum==originalNumber){
	System.out.println("Armstrong Number");
	}
	else{
	System.out.println("Not an Armstrong Number");
	}
}
}
