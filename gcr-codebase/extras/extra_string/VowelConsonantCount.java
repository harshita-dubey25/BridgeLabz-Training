import java.util.*;
public class VowelConsonantCount{
	public static String consoVow(char ch){
		int i = (int)ch;
		if(i>=65 && i<=90)
			ch = (char)(ch+32);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			return "vowel";
		return "consonant";
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String s = input.next();
		int vow =0;
		int con =0;
		for(int i=0;i<s.length();i++){
			String ans= consoVow(s.charAt(i));
			if(ans =="vowel"){
				System.out.println(s.charAt(i)+" is Vowel");
				vow++;
			}
			else{
				System.out.println(s.charAt(i)+" is Consonant");
				con++;
			}
		}
		System.out.println("Total vowels in string "+s+" is: "+vow);
		System.out.println("Total consonant in string "+s+" is: "+con);	
	}
}