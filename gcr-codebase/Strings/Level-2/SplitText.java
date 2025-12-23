import java.util.*;

public class SplitText{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text: ");
		
		String st = sc.nextLine();
		
		String s1[] = st.split(" ");
		String s2[] = textSplit(st, s1.length);
		System.out.println("Words in text are using per-defined method: "+Arrays.toString(s1));
		
		System.out.println("Words in text are using user method: "+Arrays.toString(s2));
		
	}
	public static String[] textSplit(String s,int size){
		String wd = "";
		String ans[] = new String[size];
		int curr= 0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				if(wd.length()!=0){
					ans[curr] = wd;
					wd ="";
					curr++;
				}
			}
			else
				wd+= s.charAt(i);
		}
		if(wd.length()!=0){
					ans[curr] = wd;
					wd ="";
					curr++;
				}
		
		return ans;
	}
}