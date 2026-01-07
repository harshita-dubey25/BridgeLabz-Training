package com.binarysearch;
import java.util.*;

public class SearchIn2dMatrix {
	static boolean findElement(int arr[][], int target) {
		int left = 0;
		int right = (arr.length*arr[0].length-1);
		while(left<=right) {
			int mid = (left+right)/2;
			int row = mid / arr[0].length;
			int column = mid % arr[0].length;
			if(arr[row][column]==target) {
				return true;
			}
			else if(arr[row][column]>target) {
				right = mid-1;
			}
			else {
				left = mid+1;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.print("Enter an integer to search: ");
		int target = input.nextInt();
		System.out.print(findElement(matrix,target));
	}
}
