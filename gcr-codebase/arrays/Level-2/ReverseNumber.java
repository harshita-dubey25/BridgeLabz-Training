import java.util.*;
public class ReverseNumber
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int number = input.nextInt();
	int digitCount=0;
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
	int[] arrReverse = new int[digitCount];
	for(int j=0;j<digitCount;j++){
		arrReverse[j] = digit[digitCount-j-1];
	}
	for(int j=arrReverse.length-1;j>=0;j--){
		System.out.print(arrReverse[j]+"");
	}
}
}