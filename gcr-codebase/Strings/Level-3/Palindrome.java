import java.util.*;
public class Palindrome{
	public static void main(String  args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string to check palindrome: ");
		String s = sc.next();
		
		char ch[] = s.toCharArray();
		System.out.println("Given string is palindrome: "+isPalindrome(s));
		System.out.println("Given string is palindrome: "+isPalinRecursion(s,0,s.length()-1));
		System.out.println("Given string is palindrome: "+isPalinCharArray(ch));
	}
	public static boolean isPalindrome(String s){
		int st =0;
		int ed = s.length()-1;
		while(st<ed){
			if(s.charAt(st)!=s.charAt(ed))
				return false;
			st++;
			ed--;
		}
		return true;
	}
	public static boolean isPalinRecursion(String s, int st, int ed){
		if(st>ed)
			return true;
		if(s.charAt(st)!=s.charAt(ed))
			return false;
		return isPalinRecursion(s,st+1,ed-1);
	}
	public static boolean isPalinCharArray(char[] arr){
		int st=0;
		int ed = arr.length-1;
		while(st<ed){
			if(arr[st]!=arr[ed])
				return false;
			ed--;
			st++;
		}
		return true;
	}
}