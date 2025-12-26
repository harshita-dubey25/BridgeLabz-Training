import java.util.*;
public class RemoveCharacter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		
		System.out.print("Enter an integer: ");
		int ch = sc.nextInt();
		String newStr = remove(s,ch-1);
		System.out.println("The new String is "+newStr);
	}
	public static String remove(String s,int ch){
		StringBuilder str = new StringBuilder();
		for(int i=0;i<s.length();i++){
			if(i==ch){
				continue;
			}
			str.append(""+s.charAt(i));
		}
		return str.toString();
	}
}