import java.util.*;
public class ChocolatesDivision
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
	
	int numberOfChocolates = input.nextInt();
	int numberOfChildren = input.nextInt();
	int[] answer =findRemainderAndQuotient(numberOfChocolates,numberOfChildren);
	System.out.println(Arrays.toString(answer));
}
}