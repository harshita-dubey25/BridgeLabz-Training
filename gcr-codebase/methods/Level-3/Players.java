import java.util.*;

public class Players{
	
	public static int sumHeight(int arr[]){
		int sm = 0;
		for(int i: arr)
			sm+=i;
		return sm;
	}
	public static double meanHeight(int arr[]){
		int sm=0;
		for(int i: arr)
			sm+=i;
		return sm/arr.length;
	}
	public static int maxHeight(int arr[]){
		int max = arr[0];
		for(int i:arr)
			max = Math.max(max,i);
		return max;
	}
	public static int minHeighgt(int arr[]){
		int min = arr[0];
		for(int i:arr)
			min = Math.min(min,i);
		return min;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[11];
		
		for(int i=0;i<11;i++)
			arr[i] = (int)(Math.random()*100+150);
		
		System.out.println("Sum of heights of players: "+sumHeight(arr));
		
		System.out.println("Mean of heights of players: "+ meanHeight(arr));
		System.out.println("Max height among players is: "+maxHeight(arr));
		System.out.println("Min height among players is: "+minHeighgt(arr));
	}
}