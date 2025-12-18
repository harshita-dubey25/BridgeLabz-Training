import java.util.*;
public class AbundantNumber
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int num = input.nextInt();
	int i=1;
	int sum = 0;
	
	while(i<num){
	if(num%i==0){
	sum+=i;
	}
	i++;
	}
	if(sum>num){
	System.out.println("Abundant Number");
	}
	else{
	System.out.println("Not an Abundant Number");
	}
}
}
