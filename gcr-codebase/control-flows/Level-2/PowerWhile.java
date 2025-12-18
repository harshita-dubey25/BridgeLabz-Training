import java.util.*;
public class PowerWhile
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int num = input.nextInt();
	int power = input.nextInt();
	int answer = 1;
	
	while(power>0){
	answer*=num;
	power--;
	}
	System.out.println(answer);
}
}