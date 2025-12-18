import java.util.*;
public class SumUntilZero
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
		
	int number;
	int sum = 0;
		
	while(true){
	number = input.nextInt();
	if(number==0)
	break;
	sum+=number;
    }
	System.out.println(sum);
}
}