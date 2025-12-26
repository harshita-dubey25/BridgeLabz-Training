import java.util.*;
public class PalindromeChecker{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.next();
		
		boolean flag = true;
		int st =0;
		int ed = s.length()-1;
		
		while(st<ed){
			if(s.charAt(st)!=s.charAt(ed))
				flag = false;
			st++;
			ed--;
		}
		
		if(flag)
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
	}
}