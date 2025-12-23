import java.util.*;
public class RockPaperScissors{
	public static int computerSelection(){
		Random r = new Random();
		int n = r.nextInt(2);
		return n;
	}
	public static String choiceOutput(int u){
		if(u==0){
			return "ROCK";
		}
		if(u==1){
			return "PAPER";
		}
		if(u==2){
			return "SCISSORS";
		}
		return "not valid choice";
	}
	public static String winner(int u,int c){
		if(u==c){
			return "draw";
		}
		if((u==0&&c==2)||(u==1&&c==0)||(u==2&&c==1)){
			return "You win";
		}
		else{
			return "Computer win";
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of round you want to play :");
		int n = sc.nextInt();
		String [][] arr = new String[n][3];
		int idx =0;
		while(idx<n){
		  System.out.println("Enter the 0 Rock, 1 Paper, 2 Scissors");
           int u = sc.nextInt();
           int c = computerSelection();
           arr[idx][0]=""+(idx+1);
           arr[idx][1]=""+winner(u,c);
           arr[idx][2]= choiceOutput(u);
		   idx++;
		}
		
		for(String[] a:arr){
			System.out.println("Round "+a[0]+" winner is "+a[1]+" your choice is "+ a[2]);
		}
	}
}
