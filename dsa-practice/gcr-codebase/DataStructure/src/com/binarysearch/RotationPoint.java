package com.binarysearch;
import java.util.*;
public class RotationPoint {
	static int findRotationPoint(int[] arr) {
		int left = 0;
		int right = arr.length-1;
		int mid;
		while(left<right) {
			mid = (left+right)/2;
			if(arr[mid]>arr[right]) {
				left = mid+1;
			}
			else {
				right = mid;
			}
		}
		return arr[left];
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter 10 integer in rotated sorted form");
		for(int i=0;i<size;i++) {
			arr[i] = input.nextInt();
		}
		System.out.println("Rotation Point: "+findRotationPoint(arr));
	}
	
}
