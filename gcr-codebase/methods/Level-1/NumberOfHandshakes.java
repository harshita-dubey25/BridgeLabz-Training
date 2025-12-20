import java.util.*;
public class NumberOfHandshakes
{
public static int findHandshakes(int n){
	int hansdhakes = (n*(n-1))/2;
	return hansdhakes;
}
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int number = input.nextInt();
	
	System.out.println(findHandshakes(number));
}
}