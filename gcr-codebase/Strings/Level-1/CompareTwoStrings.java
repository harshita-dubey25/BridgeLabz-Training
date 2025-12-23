import java.util.*;
public class CompareTwoStrings{
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
		
		String first = input.next();
		String second = input.next();
		System.out.println("Equality check by using chatAt():"+isEqual(first,second));
		System.out.println("Equality check by using chatAt():"+isEqual(first,second));
	}
}