import java.util.*;
public class DigitFrequency
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int number = input.nextInt();
	int digitCount=0;
	int[] digitFrequency = new int[10];
	int temp = number;
	
	while(number>0){
		digitCount++;
		number/=10;
	}
	
	int[] digit = new int[digitCount];
	int i=0;
	while(temp>0){
		int r = temp%10;
		digit[i] = r;
		temp/=10;
		i++;
	}
	for(int j=0;j<i;j++){
		digitFrequency[digit[j]]++;
	}
	for(int j=0;j<10;j++){
		if(digitFrequency[j]>0){
			System.out.println("Frequency of "+j+" is "+digitFrequency[j]);
		}
	}
}
}