import java.util.*;
public class CharacterFreq1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.next();
		
		String[][] str = freq(s);
		char[] ch = unique(s);
		
		System.out.println("Unique charcters in the string "+Arrays.toString(ch));
		System.out.println("Frequency of the charcter :");
		
		for(String[] a: str){
			System.out.println(Arrays.toString(a));
		}
	}
	public static String[][] freq(String s){
		int [] arr = new int[256];
		for(char a: s.toCharArray()){
			arr[a]+=1;
		}
		return display(arr);
	}
	public static String[][] display(int[] arr){
		int count =0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				count++;
			}
		}
		String[][] fer = new String[count][2];
		int idx =0;
			for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				char ch = (char)(i);
				fer[idx][0]=""+ch;
				fer[idx][1]= Integer.toString(arr[i]);
				idx++;
			}
		}
		return fer;
	}
	public static char[] unique(String s){
		String str = "";
		int len =0;
		for(int i =0;i<s.length();i++){
			if(!str.contains(""+s.charAt(i))){
				int count =0;
				for(int j =0;j<s.length();j++){
					if(s.charAt(i)==s.charAt(j)){
						count++;
					}
				}
				if(count==1){
					len++;
					str+=""+s.charAt(i);
				}
			}	
		}
		char[] ch = new char[len];
		String temp ="";
		len =0;
		for(int i =0;i<s.length();i++){
			if(!temp.contains(""+s.charAt(i))){
				int count =0;
				for(int j =0;j<s.length();j++){
					if(s.charAt(i)==s.charAt(j)){
						count++;
					}
				}
				if(count==1){
					temp+=""+s.charAt(i);
					ch[len++] = s.charAt(i);
				}
			}			
		}
		return ch;
		}
}