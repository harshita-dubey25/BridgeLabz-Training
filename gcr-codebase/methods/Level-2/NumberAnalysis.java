import java.util.*;
public class NumberAnalysis
{
public static String isPositive(int n){
	if(n>0){
		return "Positive and "+isEven(n);
	}
	return "Negetive";
}
public static String isEven(int n){
	if(n%2==0){
		return "Even";
	}
	return "Odd";
}
public static int compare(int a, int b){
	if(a>b){
		return 1;
	}	
	else if(a<b){
		return -1;
	}
	return 0;
}
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	int number[] = new int[5];
	for(int i=0;i<5;i++){
		number[i] = input.nextInt();
	}
	for(int i=0;i<5;i++){
		System.out.println(isPositive(number[i]));
	}
	System.out.println(compare(number[0],number[4]));
}
}