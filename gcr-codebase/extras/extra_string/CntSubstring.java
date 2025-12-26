import java.util.*;
public class CntSubstring{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		String str = sc.next();
		
		System.out.print("Enter substring to search: ");
		String subStr = sc.next();
		
		int cnt=0;
		for(int i=0;i<str.length()-subStr.length()+1;i++){
			String sub = str.substring(i,i+subStr.length());
			
			if(sub.equals(subStr))
				cnt++;
		}
		
		System.out.println(subStr+" occured "+cnt+" times in "+str);
	}
}