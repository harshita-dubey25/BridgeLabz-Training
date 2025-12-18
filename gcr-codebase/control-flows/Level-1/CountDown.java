import java.util.*;

public class CountDown
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
		
	int number = input.nextInt();
		
	while(number>0){
	System.out.println(number);
	number--;
	}
}
}