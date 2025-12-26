import java.util.*;

public class LongestWord{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a text: ");
		String s = sc.nextLine();
		
		String longWord ="";
		
		String words[] = s.split(" ");
		
		for(int i=0;i<words.length; i++)
			if(words[i].length()>longWord.length())
				longWord = words[i];
			
		System.out.println("Longest word in string is: "+longWord);
	}
}