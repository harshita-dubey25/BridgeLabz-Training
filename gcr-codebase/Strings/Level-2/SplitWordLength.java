import java.util.*;
public class SplitWordLength{
	public static int sizeStr(String st){
		int cnt =0;
		try{
			while(st.charAt(cnt)>=0){
				cnt++;
			}
		}
		catch(StringIndexOutOfBoundsException e){
			return cnt;
		} 
		return cnt;
	}
	public static String[] textSplit(String s){
		String wd = "";
		int size =0;
		
		int curr= 0;
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)==' ')
				size++;
		String ans[] = new String[size+1];
		
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
	public static String[][] convertWordLen(String word[],int size){
		String ans[][] = new String[size][2];
		
		for(int i=0;i<size;i++){
			int len = sizeStr(word[i]);
			ans[i][0] =word[i];
			ans[i][1] = len+"";
		}
		return ans;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter text: ");
		String s = sc.nextLine();
		
		String splitWord[] = textSplit(s);
		int size = splitWord.length;
		String wordArr[][] = convertWordLen(splitWord, size);
		System.out.println("text words with their size");
		for(int i=0;i<size;i++){
			System.out.println(wordArr[i][0]+" : "+wordArr[i][1]);
		}
	}
}
