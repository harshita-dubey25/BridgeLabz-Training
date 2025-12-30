import java.util.*;

public class NumberGuess{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int computerGuess = (int) (Math.random()*100+1);
		
		int cnt =5;
		do{
			System.out.print("Guess any number between 1 to 100: ");
			int num = sc.nextInt();
			if(num<computerGuess)
				System.out.println("Too low");
			else if(num>computerGuess)
				System.out.println("Too high");
			else{
				System.out.println("Right guess!");
				break;
			}
			cnt-=1;
		}while(cnt>0);
	}
}