import java.util.*;
public class Factors
{
public static int[] findFactors(int n){
	int count=0;
	for(int i=1;i<n;i++){
		if(n%i==0){
			count++;
		}
	}
	int arr[] = new int[count];
	int index = 0;
	for(int i=1;i<n;i++){
		if(n%i==0){
			arr[index] = i;
			index++;
		}
	}
	return arr;
}
public static int factorSum(int[] arr){
	int sum=0;
	for(int i=0;i<arr.length;i++){
		sum+=arr[i];
	}
	return sum;
}
public static long factorProduct(int[] arr){
	long product=1;
	for(int i=0;i<arr.length;i++){
		product*=arr[i];
	}
	return product;
}
public static int factorSquareSum(int[] arr){
	int sumSquare=0;
	for(int i=0;i<arr.length;i++){
		sumSquare+=Math.pow(arr[i],2);
	}
	return sumSquare;
}
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	int number = input.nextInt();
	int[] answer = findFactors(number);
	System.out.println(Arrays.toString(answer));
	System.out.println("Factor sum: "+factorSum(answer));
	System.out.println("Factor product: "+factorProduct(answer));
	System.out.println("Factor square sum: "+factorSquareSum(answer));
}
}