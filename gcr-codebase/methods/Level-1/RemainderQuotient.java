import java.util.*;
public class RemainderQuotient
{
public static int[] findRemainderAndQuotient(int number, int divisor) {
	int[] arr = new int[2];
	arr[0] = number/divisor;
    arr[1] = number%divisor;	
	return arr;
}

public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int number1 = input.nextInt();
	int number2 = input.nextInt();
	int[] answer =findRemainderAndQuotient(number1,number2);
	System.out.println(Arrays.toString(answer));
}
}