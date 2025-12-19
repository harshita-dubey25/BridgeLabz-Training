import java.util.*;
public class ElementsComparison
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int[] arr = new int[5];
	
	for(int i=0;i<arr.length;i++){
	arr[i] = input.nextInt();	
	}
	for(int i=0;i<arr.length;i++){
	if(arr[i]>0){
	if(arr[i]%2==0){
	System.out.println("Element is Positive and Even.");
	}
	else{
	System.out.println("Element is Positive and Odd.");	
	}
	}	
	else if(arr[i]<0){
	System.out.println("Element is Negetive");
	}
	else{
	System.out.println("Element is Zero");
	}
	}
	if(arr[0]>arr[4]){
		System.out.println("First element is greater than last element.");
	}
	else if(arr[0]<arr[4]){
	System.out.println("First element is lesser than last element.");
	}
	else{
	System.out.println("First and last elements are equal.");
	}
}
}