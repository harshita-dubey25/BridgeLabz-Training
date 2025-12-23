import java.util.*;
public class TrimString{
	public static String subString(String s, int st, int ed){
		String ans = "";
		for(int i=st;i<=ed; i++)
			ans+= (char)s.charAt(i);
		
		return ans;
	}
	public static String trimSpace(String s){
		if(s==null || s.length() ==0)
			return "";
		int st=0;
		while(st<s.length()){
			if(s.charAt(st)!=' ')
				break;
			st++;
		}
		int ed = s.length()-1;
		while(s.charAt(ed)==' '){
			if(s.charAt(ed)!=' ')
				break;
			ed--;
		}
		return subString(s,st,ed);
	}
	public static boolean isEqual(String s1, String s2){
		if(s1.length() != s2.length())
			return false;
		for(int i=0;i<s1.length();i++)
			if(s1.charAt(i)!=s2.charAt(i))
				return false;
			
		return true;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		String st = "  Harshita     ";
		String s1 = trimSpace(st);
		String s2 = st.trim();
		
		boolean equal = isEqual(s1,s2);
		System.out.println("Both string using inbuilt method and user defined methods are equal: "+equal);
	}
}