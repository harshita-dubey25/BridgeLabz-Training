import java.util.*;
public class Digits2
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	long number = input.nextLong();
	int maxDigit=10;
	long[] digits = new long[maxDigit];
	int index = 0;
	long[] temp;
	
	while(number>0){
		digits[index] = number%10;
		index++;
		if(index==maxDigit){
			maxDigit+=10;
			temp = new long[maxDigit];
			for(int i=0;i<digits.length;i++){
				temp[i] = digits[i];
			}
			digits = temp;
			digits[index] = number%10;
			index++;
		}
		number/=10;
	}
	long largest = 0;
	long secondLargest = 0;
	for(int i=0;i<maxDigit;i++){
		if(digits[i]>largest)
		{
			secondLargest = largest;
			largest = digits[i];
		}
		else if(digits[i]>secondLargest && digits[i]!=largest){
			secondLargest = digits[i];
		}
	}
	System.out.println("Largest : "+largest);
	System.out.println("Second Largest : "+secondLargest);
}
}