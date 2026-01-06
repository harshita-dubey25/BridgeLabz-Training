package com.LinearSearch;

public class FirstNegetiveNumber {
	
	static int findFirstNegetive(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int a[] = {1,-44,2,5,3,8,0,-4};
		int index = findFirstNegetive(a);
		System.out.println(index>=0?"First negetive found at index: "+index:"Not found");
	}
}
