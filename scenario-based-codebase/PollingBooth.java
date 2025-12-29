import java.util.*;
public class PollingBooth{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int voter1 = 0;
		int voter2 = 0;
		int voter3 = 0;
		
		int code = 0;
		while(code<10{
			int age = input.nextInt();
			if(age>=18){
				System.out.println("Enter your vote please");
				int vote = input.nextInt();
				if(vote==1){
					voter1++;
				}
				else if(vote==2){
					voter2++;
				}
				else{
					voter3++;
				}
			}
			else{
				System.err.println("You are not eligible!!!");
			}
			code++;
		}
		if(voter1>voter2 && voter1>voter3){
			System.out.println("Cadidate1  1 won");
		}
		else if(voter2>voter1&& voter2>voter3){
			System.out.println("Cadidate1  2 won");
		}
		else if(voter3>voter2 && voter3>voter1){
			System.out.println("Cadidate1  3 won");
		}
		else {
			System.out.println("More than one candidate got highest votes!!!");
		}
	}
}