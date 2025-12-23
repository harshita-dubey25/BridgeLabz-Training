import java.util.*;
public class ToLowercase{
	public static String toLowercaseMethod(String a){
		String lower = "";
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)>=65 && a.charAt(i)<=90)
			{
				lower = lower+(char)(a.charAt(i)+32);
			}
			else{
				lower = lower+a.charAt(i);
			}
		}
		return lower;
	}
	public static boolean isEqual(String a, String b){
		if(a.length()!=b.length()){
			return false;
		}
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)!=b.charAt(i)){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		
		String s1 = toLowercaseMethod(s);
		String s2 = s.toLowerCase();
		System.out.println("Lowercase by method : "+s1);
		System.out.println("Lowercase by built-in method : "+s2);
		System.out.println("Are both string equal? : "+isEqual(s1,s2));
	}
}
