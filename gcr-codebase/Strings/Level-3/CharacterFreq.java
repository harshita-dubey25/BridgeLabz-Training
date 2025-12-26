import java.util.*;
public class CharacterFreq{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String s = sc.next();
		
		String[][] arr = freq(s);
		for(String[] a:arr){
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
}
