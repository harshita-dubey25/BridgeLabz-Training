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
public static int greatestFactor(int[] arr){
	return arr[arr.length-1];
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
public static long factorCubeProduct(int[] arr){
	long productCube=1;
	for(int i=0;i<arr.length;i++){
		productCube *=(Math.pow(arr[i],3));
	}
	return productCube;
}
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	int number = input.nextInt();
	int[] answer = findFactors(number);
	System.out.println(Arrays.toString(answer));
	System.out.println("Greatest Factor "+greatestFactor(answer));
	System.out.println("Factor sum: "+factorSum(answer));
	System.out.println("Factor product: "+factorProduct(answer));
	System.out.println("Factor cube product: "+factorCubeProduct(answer));
}
}