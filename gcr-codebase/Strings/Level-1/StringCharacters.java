import java.util.*;
public class StringCharacters{
	public static char[] createCharArray(String a){
		char[] arr = new char[a.length()];
		for(int i=0;i<a.length();i++){
			arr[i] = a.charAt(i);
		}
		return arr;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		char[] ans1 = createCharArray(s);
		System.out.println(Arrays.toString(ans1));
		char[] ans2 = s.toCharArray();
		System.out.println(Arrays.toString(ans2));
	}
}