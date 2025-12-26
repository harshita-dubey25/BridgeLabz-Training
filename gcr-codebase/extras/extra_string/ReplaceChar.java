import java.util.*;
public class ReplaceChar{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		String sen = sc.nextLine();
		
		System.out.print("Enter word to be replaced: ");
		String word = sc.next();
		System.out.print("Enter new word: ");
		String rep = sc.next();
		
		System.out.println("The sentence after replacement is: "+replace(sen,word,rep));
	}
	public static String replace(String s,String word,String rep){
		String[] arr = s.split(" ");
		String str = "";
		for(int i =0;i<arr.length;i++){
			if(arr[i].equals(word)){
				arr[i] = rep;
			}
			if(i!=arr.length-1){
				str+=arr[i]+" ";
			}else{
				str+=arr[i];
			}
		}
		return str;
	}
}