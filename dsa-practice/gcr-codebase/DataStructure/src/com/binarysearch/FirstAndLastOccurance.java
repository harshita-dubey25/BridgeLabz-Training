package com.binarysearch;

public class FirstAndLastOccurance {
		static int findFirstOccurence(int arr[], int target) {
			int left = 0;
			int right = arr.length-1;
			int result = -1;
			while(left<=right) {
				int mid = (left+right)/2;
				if(arr[mid] == target) {
					result = mid;
					right = mid - 1;
				}
				else if(arr[mid]>target)
					right = mid-1;
				else
					left = mid+1;
			}
			return result;
		}
		
		static int findLastOccurence(int arr[], int target) {
			int left = 0;
			int right = arr.length-1;
			int result = -1;
			while(left<=right) {
				int mid = (left+right)/2;
				if(arr[mid] == target) {
					result = mid;
					left = mid + 1;
				}
				else if(arr[mid]>target)
					right = mid-1;
				else
					left = mid+1;
			}
			return result;
		}
		
		public static void main(String[] args) {
			int arr[] = {1,2,2,3,4,5,5,5,6,7};
			int t = 2;
			int first = findFirstOccurence(arr,t);
			int last = findLastOccurence(arr,t);
			if(first>-1) {
				System.out.println("Index of first occurance: "+first);
				System.out.println("Index of last occurance: "+last);
			}
			else
				System.out.println("Not Found!!!");
		}
}
