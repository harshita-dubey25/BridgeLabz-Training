import java.util.Scanner;
import java.lang.Math;
public class NumberGussing{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number (1-100): ");
		
		int num = sc.nextInt();
		int comNumber = guessNumber();
		
		if(num==comNumber)
			System.out.println("Correct");
		else if(num<comNumber)
			System.out.println("High");
		else
			System.out.println("Low");
	}
	public static int guessNumber(){
		return (int)(Math.random()*100+1);
	}
}