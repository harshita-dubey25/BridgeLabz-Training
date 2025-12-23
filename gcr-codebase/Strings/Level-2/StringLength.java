import java.util.*;
public class StringLength{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String st = sc.next();
		
		int cnt =0;
		try{
			while(st.charAt(cnt)>=0){
				cnt++;
			}
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("Length of String is: "+cnt);
		}
	}
}