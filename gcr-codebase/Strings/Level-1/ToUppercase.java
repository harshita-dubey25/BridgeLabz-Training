import java.util.*;
public class ToUppercase{
	public static String toUppercaseMethod(String a){
		String upper = "";
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)>=97 && a.charAt(i)<=122)
			{
				upper = upper+(char)(a.charAt(i)-32);
			}
			else{
				upper = upper+a.charAt(i);
			}
		}
		return upper;
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
		
		String s1 = toUppercaseMethod(s);
		String s2 = s.toUpperCase();
		System.out.println("Uppercase by method : "+s1);
		System.out.println("Uppercase by built-in method : "+s2);
		System.out.println("Are both string equal? : "+isEqual(s1,s2));
	}
}
