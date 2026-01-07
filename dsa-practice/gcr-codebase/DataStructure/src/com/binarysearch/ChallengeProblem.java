package com.binarysearch;

public class ChallengeProblem {
	static int findMissingInteger(int[] arr) {
		boolean temp[] = new boolean[arr.length+1];
		
		for(int num : arr) {
			if(num>0 && num <= arr.length)
				temp[num] = true;
		}
		
		for(int i = 1;i<temp.length;i++) {
			if(!temp[i])
				return i;
		}
		return arr.length+1;
	}
	
	static int findTarget(int arr[], int target) {
		int left = 0;
		int right = arr.length-1;
		while(left<=right) {
			int mid = (left+right)/2;
			if(arr[mid] == target) {
				return mid;
			}
			else if(arr[mid]>target)
				right = mid-1;
			else
				left = mid+1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int t = 9;
		int missing = findMissingInteger(arr);
		int index = findTarget(arr,t);
		System.out.println("First Missing Positive Integer: "+missing);
		if(index !=-1)
			System.out.println("Target at: "+index);
		else
			System.out.println("Not Found!!!");
		
	}
}
