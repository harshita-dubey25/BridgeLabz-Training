import java.util.*;

public class CheckAnagram{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first string: ");
		String s1 = sc.next();
		
		System.out.print("Enter second string: ");
		String s2 = sc.next();
		
		System.out.println("The given strings are anagram of each other: "+ isAnagram(s1,s2));
		
	}
	
	public static boolean isAnagram(String s1, String s2){
		if(s1.length()!=s2.length())
			return false;
		
		char ch1[] = new char[256];
		char ch2[] = new char[256];
		
		for(int i=0;i<s1.length();i++){
			int a= (int)s1.charAt(i);
			int b =(int)s2.charAt(i);
			ch1[a]+=1;
			ch2[b]+=1;
		}
		
		for(int i=0;i<s1.length();i++){
			int a= (int)s1.charAt(i);
			if(ch1[a]!=ch2[a])
				return false;
		}
		return true;
	}
}