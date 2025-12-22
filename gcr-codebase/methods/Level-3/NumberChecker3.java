import java.util.*;
public class NumberChecker3{
public static int digitCount(int n){
	int digits = 0;
	while(n>0){
		digits++;
		n/=10;
	}
	return digits;
}
public static int[] storeDigits(int n){
	int digits = digitCount(n);
	int[] digit = new int[digits];
	int i=0;
	while(n>0){
		int r = n%10;
		digit[i] = r;
		n/=10;
		i++;
	}
	return digit;
}
public static void reverseDigits(int[] arr){
	int[] arrReverse = new int[arr.length];
	for(int j=0;j<arrReverse.length;j++){
		arrReverse[j] = arr[arr.length-j-1];
	}
	for(int j=arrReverse.length-1;j>=0;j--){
		System.out.print(arrReverse[j]+" ");
	}
}
public static boolean compareArrays(int[] a, int[] b){
	if(a.length!=b.length){
		return false;
	}
	for(int i=0;i<a.length;i++){
		if(a[0]!=b[0]){
			return false;
		}
	}
	return true;
}
public static boolean isPalindrome(int n){
	int num = n;
	int newNum =0;
	while(num>0){
		int d = num%10;
		newNum = (newNum*10)+d;
		num/=10;
	}
	if(newNum==n){
		return true;
	}
	return false;
}
public static boolean isDuck(int[] arr){
	for(int i=0;i<arr.length;i++){
		if(arr[i]==0 && arr[arr.length-1]!=0){
			return true;
		}
	}
	return false;
}
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int number = input.nextInt();
	
	System.out.println("Digits: "+digitCount(number));
	int arr[] = storeDigits(number);
	System.out.println(Arrays.toString(arr));
	reverseDigits(arr);
	System.out.println();
	System.out.println("Palindrome Number: "+isPalindrome(number));
	System.out.println("Tow arrays equal? : "+compareArrays(arr,arr));
	System.out.println("Duck Number: "+isDuck(arr));
}
}