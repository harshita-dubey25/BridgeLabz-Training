import java.util.*;
public class CharacterFreq2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.next();
		String freqChar[] = charFreq(s);
		System.out.println("Characters with frequency: "+Arrays.toString(freqChar));
		
	}
	public static String[] charFreq(String s){
		
		String str ="";
		for(int i=0;i<s.length();i++){
			if(!str.contains(""+s.charAt(i)))
				str+=s.charAt(i)+"";
		}
		
		int idx =0;
		String chr[] = new String[str.length()*2];
		str ="";
		for(int i=0;i<s.length();i++){
			if(!str.contains(s.charAt(i)+"")){
				int cnt=0;
				for(int j=0;j<s.length();j++)
					if(s.charAt(i)==s.charAt(j))
						cnt++;
				
				str+=s.charAt(i)+"";
				chr[idx++] = s.charAt(i)+"";
				chr[idx++]=cnt+"";
			}
		}
		return chr;
	}
}