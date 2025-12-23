import java.util.*;
public class VotingEligibilityTest{
	public static int[] generateAge(int n){
		int age[] = new int[10];
		
		for(int i=0;i<n;i++)
			age[i] = (int)(Math.random()*99+10);
		
		return age;
	}
	public static String[][] isEligible(int arr[], int n){
		String ans[][]= new String[n][2];
		
		for(int i=0;i<n;i++){
			ans[i][0] = arr[i]+"";
			ans[i][1] = (arr[i]>=18)+"";
		}
		return ans;
	}
	public static void display(String ans[][], int n){
		for(int i=0;i<n;i++){
			System.out.println("Age : "+ans[i][0]+" is eligible for vote: "+ans[i][1]);
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int n = sc.nextInt();
		int age[] = generateAge(n);
		String ans[][] =isEligible(age, n);
		display(ans, n);
		
	}
}
