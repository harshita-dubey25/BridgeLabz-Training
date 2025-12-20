import java.util.*;
public class LargestAndSmallest
{
public static int[] findSmallestAndLargest(int number1, int number2, int number3){
	int arr[] = new int[2];
	if(number1>number2 && number1>number3){
		arr[1]  = number1;
	}
	else if(number2>number3){
		arr[1] = number2;
	}
	else{
		arr[1] = number3;
	}
	if(number1<number2 && number1<number3){
		arr[0]  = number1;
	}
	else if(number2<number3){
		arr[0] = number2;
	}
	else{
		arr[0] = number3;
	}
	return arr;
}
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int number1 = input.nextInt();
	int number2 = input.nextInt();
	int number3 = input.nextInt();
	
	int[] answer = findSmallestAndLargest(number1,number2,number3);
	
	System.out.println(Arrays.toString(answer));
}
}