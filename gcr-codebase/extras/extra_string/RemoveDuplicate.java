import java.util.*;
public class RemoveDuplicate{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = sc.next();
		
		String ans ="";
		for(int i=0;i<s.length();i++)
			if(!ans.contains(s.charAt(i)+""))
				ans+=s.charAt(i)+"";
			
		System.out.println("String after removing duplicates: "+ans);
	}
}
