import java.util.*;
public class FirstNonRepeating{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.next();
		char ans = firstNonRepeating(s);
		
		if(ans==' ')
			System.out.println("There is no non repeating character in "+s);
		else
			System.out.println("First non repeating character in string is "+ans);
	}
	public static char firstNonRepeating(String s){
		for(int i=0;i<s.length()-1;i++){
			int cnt =0;
			for(int j=0;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j)){
					cnt++;	
				}
			}	
			if(cnt==1)
				return s.charAt(i);
		}
		return ' ';
	}
}