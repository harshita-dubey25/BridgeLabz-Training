import java.util.*;
public class NumberChecker2{
public static boolean isPrime(int n){
	if(n<=1){
		return false;
	}
	for(int i=2;i<n;i++){
		if(n%i==0){
			return false;
		}
	}
	return true;
}
public static boolean isNeon(int n){
	int sqr = (int)Math.pow(n,2);
	int sum = 0;
	while(sqr>0){
		sum+=(sqr%10);
		sqr/=10;
	}
	if(sum==n){
		return true;
	}
	return false;
}
public static boolean isSpy(int num){
	int product = 1;
	int sum = 0;
	while(num>0){
		sum+=(num%10);
		product*=(num%10);
		num/=10;
	} 
	if(sum==product){
		return true;
	}
	return false;
}
public static boolean isAutomorphic(int n){
	int num = n;
	int digits = 0;
	int sqr = (int)Math.pow(n,2);
	while(num>0){
		digits++;
		num/=10;
	}
	if(n==(sqr%(int)(Math.pow(10,digits)))){
		return true;
	} 
	return false;
}
public static boolean isBuzz(int n){
	if(n%7==0 || n%10==7){
		return true;
	}
	return false;
}
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int number = input.nextInt();
	
	System.out.println("Prime Number: "+isPrime(number));
	System.out.println("Neon Number: "+isNeon(number));
	System.out.println("Spy Number: "+isSpy(number));
	System.out.println("Automorphic Number: "+isAutomorphic(number));
	System.out.println("Buzz Number: "+isBuzz(number));
}
}