import java.util.*;
public class CreateSubstring{
	public static String createSubstring(String a, int start, int end){
		String ans = "";
		for(int i=start;i<end;i++){
			ans = ans+a.charAt(i);
		}
		return ans;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		int start = input.nextInt();
		int end = input.nextInt();
		System.out.println("Substring by user defined method : "+createSubstring(s,start,end));
		System.out.println("Substring by substring method : "+s.substring(start,end));
	}
}