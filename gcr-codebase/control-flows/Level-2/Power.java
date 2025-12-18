import java.util.*;
public class Power
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int num = input.nextInt();
	int power = input.nextInt();
	int answer = 1;
	
	for(int i=1;i<=power;i++){
	answer*=num;
	}
	System.out.println(answer);
}
}