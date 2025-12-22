import java.util.*;
public class NumberChecker1{
public static boolean isPerfectNumber(int n){
	int sum = 0;
	if(n==1){
		return false;
	}
	for(int i=1;i<n;i++){
		if(n%i==0){
			sum+=i;
		}
	}
	if(sum==n){
		return true;
	}
	return false;
}
public static boolean isAbundantNumber(int num){
	int i=1;
	int sum = 0;
	while(i<num){
	if(num%i==0){
	sum+=i;
	}
	i++;
	}
	if(sum>num){
		return true;
	}
	return false;
}
public static boolean isDeficientNumber(int num){
	int i=1;
	int sum = 0;
	while(i<num){
	if(num%i==0){
	sum+=i;
	}
	i++;
	}
	if(sum<num){
		return true;
	}
	return false;
}
public static boolean isStrongNumber(int n){
	int sum = 0;
	int num = n;
	while(num>0){
	int d = num%10;
	int fact = 1;
	for(int i=2;i<=d;i++){
		fact*=i;
	}
	sum+=fact;
	num/=10;
	}
	if(sum==n){
		return true;
	}
	return false;
}
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int number = input.nextInt();
	
	System.out.println("Is Perfect Numvber? :"+isPerfectNumber(number));
	System.out.println("Is Abundant Numvber? :"+isAbundantNumber(number));
	System.out.println("Is Deficient Numvber? :"+isDeficientNumber(number));
	System.out.println("Is Strong Numvber? :"+isStrongNumber(number));
}
}