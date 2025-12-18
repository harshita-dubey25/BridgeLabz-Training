import java.util.*;
public class HarshadNumber
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int num = input.nextInt();
	int originalNumber = num;
	int sum = 0;
	
	while(num>0){
	int r = num%10;
	sum+=r;
	num/=10;
	}
	if(originalNumber%sum==0){
	System.out.println("Harshad Number");
	}
	else{
	System.out.println("Not a Harshad Number");
	}
}
}
