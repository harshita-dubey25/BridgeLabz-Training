import java.util.*;
public class UniqueCharacter{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.next();
		
		char ch[] = uniqueChar(s, s.length());
		System.out.println("Uniques character in "+s+" are "+Arrays.toString(ch));
	}
	public static char[] uniqueChar(String s,int n){
		char arr[] = new char[n];
		int curr =1;
		arr[0] = s.charAt(0);
		for(int i=1;i<n; i++){
			boolean flag = true;
			for(int j=0;j<i;j++){
				if(s.charAt(i)==s.charAt(j)){
					flag = false;
					break;
				}
			}
			if(flag==true){
					arr[curr] = s.charAt(i);
					curr++;
				}
		}
		return arr;
	}
}