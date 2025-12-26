
import java.util.*;

public class AnagramChecker{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first string: ");
		String s1 = sc.next();
		
		System.out.print("Enter second string: ");
		String s2 = sc.next();
		
		System.out.println("The strings are anagram : "+anagram(s1,s2));
	}
	public static boolean anagram(String s1, String s2){
		int [] arr1 = new int[256];
		int [] arr2 = new int[256];
		
		for(char a:s1.toCharArray()){
			arr1[a]+=1;
		}
			for(char a:s2.toCharArray()){
			arr2[a]+=1;
		}
		
		for(int i =0;i<256;i++){
			if(arr1[i]!=arr2[i]){
				return false;
			}
		}
		return true;
	}
}
